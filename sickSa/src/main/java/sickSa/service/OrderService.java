package sickSa.service;


import org.springframework.stereotype.Service;

import sickSa.dao.OrderDao;
import sickSa.domain.Order;


@Service("OrderService")
public class OrderService {
	
	private OrderDao orderDao;
	
	/* 결제 완료 - 레코드 생성 */
	
	public void createOrder(Order order){
		
		orderDao.insertOrder(order);

	}
	
	/* 테이블 번호 수정 */
	
	public void changeTblNo(Integer ord_no, int tbl_id){
	
		Order tmpOrder=	orderDao.selectOrder(ord_no);
		tmpOrder.setTbl_id(tbl_id);
		
		orderDao.updateOrder(tmpOrder);
		
	}
	


}
