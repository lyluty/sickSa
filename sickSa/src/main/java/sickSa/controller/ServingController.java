package sickSa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
		model.addAttribute("servingList", servingService.servingList());
		return "servingList";
	}
	
	@RequestMapping("cookList")
	public String cookList(Model model) {
		model.addAttribute("cookList", servingService.cookList());
		return "cookList";
	}

	@RequestMapping("setServingState")
	public String setServingState(Model model,@RequestParam int ord_id, @RequestParam int pdt_id, @RequestParam String ord_state) {
		System.out.println(ord_id + ", " + pdt_id + ", " + ord_state);
		servingService.setState(ord_id, pdt_id, ord_state);
		return "servingState-s";
	}
}
