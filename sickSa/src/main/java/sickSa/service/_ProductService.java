package sickSa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sickSa.domain.Order;
import sickSa.domain.OrderDetail;
import sickSa.domain._Product;
import sickSa.domain._ProductCategory;
import sickSa.mapper._ProductDao;

/*
 * 내용 전체를 OrderService로 옮기기
 */
@Service
public class _ProductService {

	@Autowired
	private _ProductDao productDao;

	public List<OrderDetail> addToCart(List<OrderDetail> sCart, int productId) {
		List<OrderDetail> cart = sCart == null ? new ArrayList<OrderDetail>() : sCart;
		cart.add(new OrderDetail(productId));
		return cart;
	}

	public Order createOrder(List<OrderDetail> cart) {
		Order order = new Order();
		OrderDetail orderDetail = new OrderDetail();
		return null;
	}

	public List<_ProductCategory> productCategoryList() {
		List<_ProductCategory> productCategoryList = productDao.selectProductCategoryList();
		for (_ProductCategory productCategory : productCategoryList)
			System.out.println(productDao.selectProductListByCategoryId(productCategory.getPdct_id()));
		return productCategoryList;
	}

	public List<_Product> productListByCategoryId(int categoryId) {
		return productDao.selectProductListByCategoryId(categoryId);
	}

	public _Product getProduct(int productId) {
		return productDao.selectProductByProductId(productId);
	}
}
