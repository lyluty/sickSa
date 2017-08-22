package sickSa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sickSa.service.QueueService;
import sickSa.service.SalesService;

@Controller
public class SalesController {
	
	@Autowired
	SalesService salesService;

	@RequestMapping("/salesView")
	public String salesView(Model model) {
		model.addAttribute("orderList", salesService.getOrdList());
		return "salesView";
	}
}
