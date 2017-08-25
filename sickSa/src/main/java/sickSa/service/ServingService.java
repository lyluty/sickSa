package sickSa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sickSa.domain.Order;
import sickSa.domain.OrderVO;
import sickSa.mapper.OrderDao;

@Service
public class ServingService {

	@Autowired
	private OrderDao orderDao;
	
	public int setState(int ord_id, int pdt_id, String ord_state) {
		// dao 수정해야함
//		Order order = orderDao.selectOne(ord_id);
//		order.setOrd_state(ord_state);
//		return orderDao.update(order);
		return 0;
	}
	
	public List<Order> cookList() {
		return orderDao.selectListByState('B');
	}
	
	public List<Order> servingList() {
		return orderDao.selectListByState('C');
	}
}
