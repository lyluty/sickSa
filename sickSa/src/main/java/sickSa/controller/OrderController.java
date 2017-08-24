package sickSa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import sickSa.domain.OrderDetailVO;
import sickSa.domain.OrderVO;
import sickSa.mapper.OrderDao;
import sickSa.service.OrderService;


@Controller
public class OrderController {

	@Autowired
	 OrderService orderService;		
	
	@RequestMapping("testOrder")
	public String testOrder() {
		System.out.println(orderService.testOrder());
		List<OrderVO> t = orderService.testOrder2();
		System.out.println(t);
		return "testIndex2";
	}
	
	@RequestMapping("/orderList")
	public String orderList() {
		return "static/orderList";
	}
	
	/*
	@RequestMapping("/viewList")
	public String viewList() {
		return "static/viewList";
	}
	*/
	
	@RequestMapping("/viewList")
	public String getOrderList(Model model){
	model.addAttribute("orderList",orderService.getList());
	return "static/viewList";
	}
	
	@RequestMapping("/orderTest")
	public String orderTest() {
		return "static/orderTest";
	}
	
	@RequestMapping("/test/order")
	public String test(){
		return "test/order";
	}
	
	@RequestMapping("/test/order/list")
	public String testPage(Model model){
	model.addAttribute("orderList",orderService.getList());
	return "test/order/list";
	}
	
	
	@RequestMapping("test/order/get/{ord_id}")
	public String testGet(Model model,@PathVariable("ord_id")Integer ord_id){
		model.addAttribute("order",orderService.getById(ord_id));
		
		return "test/order/get";
	}
}

