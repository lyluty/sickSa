package sickSa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sickSa.domain.Order;
import sickSa.domain.OrderDetail;
import sickSa.domain.Product;
import sickSa.domain.ProductCategory;
import sickSa.mapper.OrderDao;
import sickSa.mapper.ProductDao;

@Service
public class OrderService {

	@Autowired
	private OrderDao orderDao;
	@Autowired
	private ProductDao productDao;

	/* 결제 완료 - 레코드 생성 */
	public void createOrder(List<OrderDetail> sCart, String paymentMethod) {
		int orderId = orderDao.selectOrderSequence();
		System.out.println("orderId: " + orderId);
		int total = 0;
		for (OrderDetail orderDetail : sCart) {
			Product product = orderDetail.getProduct();
			System.out.println("product: " + product);
			total += product.getPdt_price();
		}
		System.out.println("total: " + total);
		Order order = new Order(orderId, total, paymentMethod, sCart);
		System.out.println("order : " + order);
		orderDao.insertOrder(order);
		for (OrderDetail orderDetail : sCart) {
			orderDetail.setOrd_id(orderId);
			orderDetail.setOrdt_amount(1);
			System.out.println("orderDetail: " + orderDetail);
			orderDao.insertOrderDetail(orderDetail);
		}
	}

	public void setOrder(Order order) {
		orderDao.updateOrder(order);
	}

	/* 전체목록 불러오기 */
	public List<Order> orderList() {
		return orderDao.selectOrderList();
	}

	public List<ProductCategory> productCategoryList() {
		return productDao.selectProductCategoryList();
	}

	public List<Product> productListByCategoryId(int categoryId) {
		return productDao.selectProductListByCategoryId(categoryId);
	}

	public List<OrderDetail> addToCart(List<OrderDetail> sCart, Product product) {
		List<OrderDetail> cart = sCart == null ? new ArrayList<OrderDetail>() : sCart;
		cart.add(new OrderDetail(product));
		return cart;
	}

	public Order createOrder(List<OrderDetail> cart) {
		Order order = new Order();
		OrderDetail orderDetail = new OrderDetail();
		return null;
	}

	public Product getProduct(int productId) {
		return productDao.selectProductByProductId(productId);
	}
}
