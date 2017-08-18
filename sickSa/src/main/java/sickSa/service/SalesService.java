package sickSa.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sickSa.domain.Order;
import sickSa.mapper.OrderDao;

@Service
public class SalesService {

	@Autowired
	private OrderDao orderDao;

	/* 전체 판매내역 조회 (최근순) */
	public List<Order> getOrdList() {
		List<Order> ORDList = orderDao.selectList();
		Collections.reverse(ORDList);
		return ORDList;
	}

	/* 주문번호로 주문정보 조회 */
	public Order getOrdListByNo(int ord_id) {
		Order resultOrder = orderDao.selectOne(ord_id);
		return resultOrder;
	}
}
