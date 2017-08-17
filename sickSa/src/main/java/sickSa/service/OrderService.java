package sickSa.service;


import org.springframework.stereotype.Service;

import sickSa.dao.OrderDao;
import sickSa.domain.Order;

/*
 * 결제 완료 - 레코드 생성
 * 테이블번호 수정
 */
@Service("OrderService")
public class OrderService {
	
	private OrderDao orderDao;
	
	public void createOrder(Order order){
		
		Order tmpOrder=new Order();
		tmpOrder.setOrd_id(order.getOrd_id());
		tmpOrder.setPdt_id(order.getPdt_id());
		tmpOrder.setOrd_pdtAmount(order.getOrd_pdtAmount());
		tmpOrder.setOrd_total(order.getOrd_total());
		tmpOrder.setOrd_paymentMethod(order.getOrd_paymentMethod());
		tmpOrder.setOrd_date(order.getOrd_date());
		tmpOrder.setOrd_state(order.getOrd_state());
		tmpOrder.setTbl_id(order.getTbl_id());
		
		orderDao.insertOrder(tmpOrder);

	}
	
	public void changeTblNo(Order order, int tbl_id){
	
		Order tmpOrder=new Order();
		
		orderDao.selectOrder(order);
	
		tmpOrder.setOrd_id(order.getOrd_id());
		tmpOrder.setPdt_id(order.getPdt_id());
		tmpOrder.setOrd_pdtAmount(order.getOrd_pdtAmount());
		tmpOrder.setOrd_total(order.getOrd_total());
		tmpOrder.setOrd_paymentMethod(order.getOrd_paymentMethod());
		tmpOrder.setOrd_date(order.getOrd_date());
		tmpOrder.setOrd_state(order.getOrd_state());
		tmpOrder.setTbl_id(order.getTbl_id());
		
		
		orderDao.updateOrder(tmpOrder);
		
	}
	


}
