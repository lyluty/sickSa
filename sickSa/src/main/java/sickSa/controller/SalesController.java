package sickSa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import sickSa.service.SalesService;

@Controller
public class SalesController {
	
	@Autowired
	SalesService salesService;

	@RequestMapping("sales")
	public String salesView() {
		return "sales/salesView";
	}
	
	@RequestMapping("salesList.ajax")
	public String salesListAjax(Model model, @RequestParam String startDate, @RequestParam String endDate) {
		model.addAttribute("orderList", salesService.list(startDate, endDate));
		return "sales/div/salesList";
	}
	
	@RequestMapping("selectTimePeriod.ajax")
	public String selectTimePeriodAjax() {
		return "sales/div/timePeriod";
	}
}
