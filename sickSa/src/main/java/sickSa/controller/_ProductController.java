package sickSa.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import sickSa.domain.OrderDetail;
import sickSa.domain._Product;
import sickSa.service._ProductService;

/*
 * 내용 전체를 OrderController로 옮기기
 */
@Controller
public class _ProductController {

	@Autowired
	_ProductService productService;

	@RequestMapping("testProduct")
	public String testProduct(Model model) {
		model.addAttribute("productCategoryList", productService.productCategoryList());
		return "_productList";
	}

	@RequestMapping("productListByCategoryId.ajax")
	public String productListByCategoryIdAjax(Model model, @RequestParam int categoryId) {
		System.out.println("categoryId: " + categoryId);
		List<_Product> productList = productService.productListByCategoryId(categoryId);
		model.addAttribute("productList", productList);
		return "_productList2";
	}

	@SuppressWarnings("unchecked")
	@RequestMapping("addToCart.ajax")
	public String addToCart(HttpSession session, @RequestParam int productId) {
		System.out.println("productId: " + productId);
		session.setAttribute("cart",
				productService.addToCart((List<OrderDetail>) session.getAttribute("cart"), productId));
		return "_cart";
	}

	@RequestMapping("orderNow.ajax")
	@ResponseBody
	@SuppressWarnings("unchecked")
	public void orderNowAjax(HttpSession session) {
		List<_Product> sCart = (List<_Product>) session.getAttribute("cart");
		System.out.println("sCart: " + sCart);
	}
}
