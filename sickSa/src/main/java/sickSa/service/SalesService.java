package sickSa.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sickSa.domain.Order;
import sickSa.domain.Product;
import sickSa.domain.ProductCategory;
import sickSa.mapper.OrderDao;
import sickSa.mapper.ProductDao;

@Service
public class SalesService {

	@Autowired
	private OrderDao orderDao;
	@Autowired
	private ProductDao productDao;

	/* 전체 판매내역 조회 (최근순) */
	public List<Order> list() {
		List<Order> ORDList = orderDao.selectOrderList();
		Collections.reverse(ORDList);
		return ORDList;
	}

	/* 기간별 조회 */
	public List<Order> list(String startDate, String endDate) {
		Map<String, String> dateMap = new HashMap<>();
		dateMap.put("startDate", startDate);
		dateMap.put("endDate", endDate);
		return orderDao.selectOrderListByDate(dateMap);
	}

	/* 누적 판매량 순으로 조회 */
	public List<Product> bestSellerList() {
		List<Product> bestSellerList = new ArrayList<>();
		List<Map<String, Integer>> salesVolumeMapList = orderDao.selectOrderListBySalesVolume();
		for (Map<String, Integer> salesVolumeMap : salesVolumeMapList) {
			int pId = salesVolumeMap.get("pdt_id");
			bestSellerList.add(productDao.selectProductByProductId(pId));
			if (bestSellerList.size() == 4)
				break;
		}
		return bestSellerList;
	}
	
	/* 전체 상품 카테고리 리스트 */
	public List<ProductCategory> productCategoryList() {
		return productDao.selectProductCategoryList();
	}
	
	/* 특정 상품 주문목록 조회 */
	public List<Order> salesListByProductId(int productId) {
		return orderDao.selectOrderListByProductId(productId);
	}
}
