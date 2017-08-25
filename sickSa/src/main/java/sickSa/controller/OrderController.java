package sickSa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sickSa.service.OrderService;

@Controller
public class OrderController {

	@Autowired
	OrderService orderService;

	@RequestMapping("orderList")
	public String orderList() {
		return "static/orderList";
	}

	@RequestMapping("viewList")
	public String getOrderList(Model model) {
		model.addAttribute("orderList", orderService.orderList());
		return "static/viewList";
	}
}
