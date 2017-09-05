package sickSa.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import sickSa.domain.Order;
import sickSa.domain.OrderDetail;
import sickSa.domain.Product;
import sickSa.service.IngredientService;
import sickSa.service.OrderService;

@Controller
public class OrderController {

	@Autowired
	OrderService orderService;
	@Autowired
	IngredientService ingredientService;

	@RequestMapping("_productList")
	public String _productList(@RequestParam("cateNo") int categoryId, Model model) {
		List<Product> productList = orderService.productListByCategoryId(categoryId);
		model.addAttribute("productList", productList);
		return "order/_productList";
	}

	@RequestMapping("vmMain")
	public String testProduct(HttpSession session, Model model, @RequestParam(defaultValue = "0") int tableNo) {
		if (tableNo == 0)
			return "redirect:mainIndex";
		
		session.setAttribute("tableNo", tableNo);
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

	@RequestMapping("deleteProductFromCart")
	@ResponseBody
	public List<OrderDetail> deleteProductFromCart(HttpSession session, @RequestParam int pId) {
		@SuppressWarnings("unchecked")
		List<OrderDetail> sCart = (List<OrderDetail>) session.getAttribute("cart");
		for (OrderDetail orderDetail : sCart) {
			if (orderDetail.getPdt_id() == pId) {
				sCart.remove(orderDetail);
				break;
			}
		}
		return sCart.size() == 0 ? null : sCart;
	}

	@RequestMapping("choicePaymentMethod.ajax")
	public String choicePaymentMethodAjax() {
		return "order/choicePaymentMethod";
	}

	@RequestMapping("payNow")
	public String payNowAjax(HttpSession session, Model model, @RequestParam String paymentMethod) {
		@SuppressWarnings("unchecked")
		List<OrderDetail> sCart = (List<OrderDetail>) session.getAttribute("cart");
		int tableNo = (int) session.getAttribute("tableNo");
		Order order = orderService.createOrder(sCart, tableNo, paymentMethod);
		model.addAttribute("order", order);
		model.addAttribute("orderDetailList", sCart);
		for (OrderDetail orderDetail : sCart) {
			ingredientService.changeStock(orderDetail.getPdt_id());
		}
		session.removeAttribute("cart");
		return "order/result";
	}

	@RequestMapping("setOrdtAmount")
	@ResponseBody
	public void setOrdtAmount(HttpSession session, @RequestParam int pId, @RequestParam int amount) {
		@SuppressWarnings("unchecked")
		List<OrderDetail> sCart = (List<OrderDetail>) session.getAttribute("cart");
		List<OrderDetail> cart = orderService.setOrdtAmount(sCart, pId, amount);
		session.setAttribute("cart", cart);
	}
}
