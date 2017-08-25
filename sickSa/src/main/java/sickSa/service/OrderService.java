package sickSa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sickSa.dao.ProductCategoriesDao;
import sickSa.dao.ProductDao;
import sickSa.domain.Order;
import sickSa.domain.OrderDetailVO;
import sickSa.domain.OrderVO;
import sickSa.domain.Product;
import sickSa.domain.ProductCategories;
import sickSa.mapper.OrderDao;

@Service
public class OrderService {

	@Autowired
	private OrderDao orderDao;
	@Autowired
	private ProductDao productDao;
	@Autowired
	private ProductCategoriesDao productCategoriesDao;

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

	/* 전체목록 불러오기 */
	public List<Order> orderList() {
		return orderDao.selectOrderList();
	}
	
	public List<ProductCategories> productCategoryList() {
		return productCategoriesDao.selectAllProductCategories();
	}
	
	public List<Product> productListByCategoryId(int categoryId) {
//		return productDao.selectProductListByCategoryId(categoryId);
		return null;
	}
}
