package sickSa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import sickSa.mapper.OrderDao;


@Controller
public class OrderController {

	@Autowired
	OrderDao orderDao;
	// OrderService orderService;
	
	@RequestMapping("/test/order")
	public String test(){
		return "test/order";
	}
	
	@RequestMapping("/test/order/list")
	public String testPage(Model model){
	model.addAttribute("orderList", orderDao.selectList());
	return "test/order/list";
	}
	
	@RequestMapping("test/order/get/{ord_id}")
	public String testGet(Model model,@PathVariable("ord_id")Integer ord_id){
		model.addAttribute("order",orderDao.selectOne(ord_id));
		
		return "test/order/get";
	}
	
	
}

