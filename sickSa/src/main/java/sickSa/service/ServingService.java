package sickSa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sickSa.domain.Order;
import sickSa.domain.OrderDetail;
import sickSa.mapper.OrderDao;

@Service
public class ServingService {

	@Autowired
	private OrderDao orderDao;
	
	public void setState(int ord_id, int pdt_id, char ordt_state) {
		Order order = orderDao.selectOrderById(ord_id);
		for (OrderDetail orderDetail : order.getOrderDetailList()) {
			if (orderDetail.getPdt_id() == pdt_id) {
				orderDetail.setOrdt_state(ordt_state);
				orderDao.updateOrderDetail(orderDetail);
				break;
			}
		}
	}
	
	public List<Order> cookList() {
		return orderDao.selectOrderListByState('B');
	}
	
	public List<Order> servingList() {
		return orderDao.selectOrderListByState('C');
	}
}
