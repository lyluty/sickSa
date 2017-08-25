package sickSa.service;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sickSa.domain.Order;
import sickSa.domain.OrderVO;
import sickSa.mapper.OrderDao;

@Service
public class SalesService {

	@Autowired
	private OrderDao orderDao;

	/* 전체 판매내역 조회 (최근순) */
	public List<Order> list() {
		List<Order> ORDList = orderDao.selectOrderList();
		Collections.reverse(ORDList);
		return ORDList;
	}
	
	/* 기간별 조회 */
	public List<OrderVO> list(String startDate, String endDate) {
		Map<String, String> dateMap = new HashMap<>();
		dateMap.put("startDate", startDate);
		dateMap.put("endDate", endDate);
		System.out.println(dateMap);
		return orderDao.selectOrderListByDate(dateMap);
	}

	/* 주문번호로 주문정보 조회 */
//	public Order getOrdListByNo(int ord_id) {
//		Order resultOrder = orderDao.selectOrder(ord_id);
//		return resultOrder;
//	}
}
