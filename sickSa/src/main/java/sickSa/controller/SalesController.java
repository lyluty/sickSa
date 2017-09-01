package sickSa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import sickSa.domain.Order;
import sickSa.domain.Product;
import sickSa.service.OrderService;
import sickSa.service.SalesService;

/*
 * 매출조회 관련 컨트롤러
 */
@Controller
public class SalesController {

	@Autowired
	SalesService salesService;
	@Autowired
	OrderService orderService;

	// 기간별 조회 페이지
	@RequestMapping("salesViewByTimePeriod")
	public String salesViewByTimePeriod() {
		return "sales/salesViewByTimePeriod";
	}

	// 상품별 조회 페이지
	@RequestMapping("salesViewByProduct")
	public String salesViewByProduct(Model model) {
		model.addAttribute("bestSellerMapList", salesService.bestSellerMapList());
		model.addAttribute("productCategoryList", salesService.productCategoryList());
		return "sales/salesViewByProduct";
	}

	// 기간별 조회결과 요청
	@RequestMapping("salesListByTimePeriod.ajax")
	@ResponseBody
	public List<Order> salesListAjax(Model model, @RequestParam String startDate, @RequestParam String endDate) {
		return salesService.list(startDate, endDate);
	}

	// 이건뭐지
	@RequestMapping("salesListByProductId.ajax")
	public String salesListByProductIdAjax(Model model, @RequestParam int productId) {
		model.addAttribute("orderList", salesService.salesListByProductId(productId));
		return "sales/div/salesListByProduct";
	}

	// 여기
	@RequestMapping("productListByCategoryId2.ajax")
	@ResponseBody
	public List<Product> productListByCategoryIdAjax(@RequestParam int cId) {
		return orderService.productListByCategoryId(cId);
	}

	@RequestMapping("orderListByProductId.ajax")
	@ResponseBody
	public List<Order> orderListByProductIdAjax(@RequestParam int pId) {
		return salesService.salesListByProductId(pId);
	}
}
