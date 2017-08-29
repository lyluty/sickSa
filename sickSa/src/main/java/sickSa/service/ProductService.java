package sickSa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sickSa.domain.Order;
import sickSa.domain.OrderDetail;
import sickSa.domain.Product;
import sickSa.domain.ProductCategory;
import sickSa.mapper.ProductDao;

/*
 * 내용 전체를 OrderService로 옮기기
 */
@Service
public class ProductService {

	@Autowired
	private ProductDao productDao;

//	public List<OrderDetail> addToCart(List<OrderDetail> sCart, Product product) {
//		List<OrderDetail> cart = sCart == null ? new ArrayList<OrderDetail>() : sCart;
//		cart.add(new OrderDetail(product));
//		return cart;
//	}
//
//	public Order createOrder(List<OrderDetail> cart) {
//		Order order = new Order();
//		OrderDetail orderDetail = new OrderDetail();
//		return null;
//	}
//
//	public List<ProductCategory> productCategoryList() {
//		List<ProductCategory> productCategoryList = productDao.selectProductCategoryList();
//		return productCategoryList;
//	}
//
//	public List<Product> productListByCategoryId(int categoryId) {
//		return productDao.selectProductListByCategoryId(categoryId);
//	}
//
//	public Product getProduct(int productId) {
//		return productDao.selectProductByProductId(productId);
//	}
}
