package sickSa.service;

import java.util.Collections;
import java.util.List;

import sickSa.dao.OrderDao;
import sickSa.domain.Order;



public class SalesServiceImpl {

	private OrderDao orderDao;
	
	/* 전체 판매내역 조회 (최근순) */
	public List<Order> getOrdList(){
		List<Order> ORDList=orderDao.getOrders();
		Collections.reverse(ORDList);
		return ORDList;
	} 
	
	/* 주문번호로 주문정보 조회 */
	public Order getOrdListByNo(Integer ord_no){
		Order resultOrder=orderDao.selectOrder(ord_no);
		return resultOrder;
	}
	
	
}
