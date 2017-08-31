package sickSa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import sickSa.service.ServingService;

@Controller
public class ServingController {

	@Autowired
	ServingService servingService;

	@RequestMapping("servingState")
	public String servingState() {
		return "servingState";
	}

	@RequestMapping("servingList")
	public String servingList(Model model) {
			model.addAttribute("orderList", servingService.servingList());
		return "servingList";
	}

	@RequestMapping("cookList")
	public String cookList(Model model) {
		model.addAttribute("orderList", servingService.cookList());
		return "cookList";
	}

	@RequestMapping("setServingState")
	@ResponseBody
	public void setServingState(@RequestParam int ord_id, @RequestParam int pdt_id, @RequestParam char ordt_state) {
		servingService.setState(ord_id, pdt_id, ordt_state);
	}
}
