package sickSa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sickSa.domain.Order;
import sickSa.mapper.OrderDao;

@Service
public class OrderService {

	@Autowired
	private OrderDao orderDao;

	/* 결제 완료 - 레코드 생성 */
	public void createOrder(Order order) {
		orderDao.insert(order);
	}

	/* 테이블 번호 수정 */
	public void changeTblNo(Integer ord_no, int tbl_id) {
		Order tmpOrder = orderDao.selectOne(ord_no);
		tmpOrder.setTbl_id(tbl_id);
		orderDao.update(tmpOrder);
	}
}
