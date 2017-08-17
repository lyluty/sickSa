package sickSa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import sickSa.domain.Order;

/*
 * 전체 판매내역 조회 (최근순)
 * 주문번호로 주문정보 조회
 * ...
 */
@Service("SalesService")
public interface SalesService {

		public List<Order> getOrdList();
		public  Order getOrdListByNo(Integer ord_no);
	
}
