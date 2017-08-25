package sickSa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sickSa.domain.Order;
import sickSa.domain.OrderDetailVO;
import sickSa.mapper.OrderDao;

@Service
public class OrderService {

	@Autowired
	private OrderDao orderDao;
<<<<<<< HEAD
	@Autowired
	private OrderDetailDao orderDetailDao;
	
	public List<OrderDetailVO> testOrder() {
		return orderDetailDao.list();
	}
	
	public List<Order> testOrder2() {
		return orderDao.list();
	}
=======
>>>>>>> branch 'master' of https://github.com/lyluty/sickSa.git

	/* 결제 완료 - 레코드 생성 */
	public void add(OrderVO order) {
		orderDao.insertOrder(order);
		for (OrderDetailVO orderDetail : order.getOrderDetailList()) {
			orderDao.insertOrderDetail(orderDetail);
		}
	}

	public void set(OrderVO order) {
		orderDao.updateOrder(order);
	}
	//
	// /* find List by id */
	// public Order getById(Integer ord_id) {
	// return orderDao.selectOrder(ord_id);
	// }

	/* 전체목록 불러오기 */
	public List<Order> orderList() {
		return orderDao.selectOrderList();
	}
}
