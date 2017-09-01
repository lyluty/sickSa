package sickSa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import sickSa.domain.Order;
import sickSa.service.ServingService;

@Controller
public class ServingController {

	@Autowired
	ServingService servingService;

	@RequestMapping("servingState")
	public String servingState() {
		return "servingState";
	}

	@RequestMapping("cookList.ajax")
	@ResponseBody
	public List<Order> cookList(@RequestParam char state) {
		return servingService.cookList(state);
	}

	@RequestMapping("setServingState.ajax")
	@ResponseBody
	public void setServingState(@RequestParam int ord_id, @RequestParam int pdt_id, @RequestParam char ordt_state) {
		servingService.setState(ord_id, pdt_id, ordt_state);
	}
}
