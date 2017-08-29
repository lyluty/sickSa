package sickSa.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import sickSa.domain.OrderDetail;
import sickSa.domain.Product;
import sickSa.service.OrderService;
import sickSa.service.ProductService;

@Controller
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@RequestMapping("testP")
	public String testP(Model model) {
		model.addAttribute("productCategoryList", orderService.productCategoryList());
		return "order/_index";
	}
	
	@RequestMapping("_productList")
	public String _productList(@RequestParam("cateNo") int categoryId, Model model) {
		List<Product> productList = orderService.productListByCategoryId(categoryId);
		model.addAttribute("productList", productList);
		return "order/_productList";
	}

	@RequestMapping("vmMain")
	public String testProduct(Model model) {
		model.addAttribute("productCategoryList", orderService.productCategoryList());
		return "order/index";
	}

	@RequestMapping("productListByCategoryId.ajax")
	public String productListByCategoryIdAjax(Model model, @RequestParam int categoryId) {
		List<Product> productList = orderService.productListByCategoryId(categoryId);
		model.addAttribute("productList", productList);
		return "order/productList";
	}

	@RequestMapping("orderNow.ajax")
	public String orderNowAjax(HttpSession session, @RequestParam int productId) {
		session.removeAttribute("cart");
		@SuppressWarnings("unchecked")
		List<OrderDetail> sCart = (List<OrderDetail>) session.getAttribute("cart");
		Product product = orderService.getProduct(productId);
		List<OrderDetail> cart = orderService.addToCart(sCart, product);
		session.setAttribute("cart", cart);
		return "order/choicePaymentMethod";
	}

	@RequestMapping("addToCart.ajax")
	public String addToCart(HttpSession session, @RequestParam int productId) {
		@SuppressWarnings("unchecked")
		List<OrderDetail> sCart = (List<OrderDetail>) session.getAttribute("cart");
		Product product = orderService.getProduct(productId);
		List<OrderDetail> cart = orderService.addToCart(sCart, product);
		session.setAttribute("cart", cart);
		return "order/cart";
	}

	@RequestMapping("productDetail/{productId}")
	public String productDetailAjax(Model model, @PathVariable int productId) {
		Product product = orderService.getProduct(productId);
		if (product == null)
			return "order/index";
		model.addAttribute("product", product);
		return "order/productDetail";
	}

	@RequestMapping("choicePaymentMethod.ajax")
	public String choicePaymentMethodAjax() {
		return "order/choicePaymentMethod";
	}

	@RequestMapping("payNow.ajax")
	@ResponseBody
	@SuppressWarnings("unchecked")
	public String payNowAjax(HttpSession session, @RequestParam String paymentMethod) {
		List<OrderDetail> sCart = (List<OrderDetail>) session.getAttribute("cart");
		orderService.createOrder(sCart, paymentMethod);
		session.removeAttribute("cart");
		return "testProduct";
	}
}
