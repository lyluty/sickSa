package sickSa.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import sickSa.service.QueueService;
import sickSa.service.SalesService;

@Controller
public class SalesController {
	
	@Autowired
	SalesService salesService;

	@RequestMapping("/salesView")
	public String salesView(Model model, @RequestParam String startDate, @RequestParam String endDate) throws ParseException {
		model.addAttribute("orderList", salesService.list(startDate, endDate));
		System.out.println("startDate: " + startDate);
		System.out.println("endDate: " + endDate);
		return "salesView";
	}
}
