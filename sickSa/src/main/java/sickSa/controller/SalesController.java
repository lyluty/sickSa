package sickSa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import sickSa.service.SalesService;

/*
 * 매출조회 관련 컨트롤러
 */
@Controller
public class SalesController {
	
	@Autowired
	SalesService salesService;

	// 기간별 조회 페이지
	@RequestMapping("salesViewByTimePeriod")
	public String salesViewByTimePeriod() {
		return "sales/salesViewByTimePeriod";
	}
	
	// 기관별 조회결과 요청
	@RequestMapping("salesListByTimePeriod.ajax")
	public String salesListAjax(Model model, @RequestParam String startDate, @RequestParam String endDate) {
		model.addAttribute("orderList", salesService.list(startDate, endDate));
		return "sales/div/salesList";
	}
	
	// 기간선택 달력
	@RequestMapping("showTimePeriod.ajax")
	public String showTimePeriodAjax() {
		return "sales/div/timePeriod";
	}
	
	// 상품별 조회 페이지
	@RequestMapping("salesViewByProduct")
	public String salesViewByProduct() {
		return "sales/salesViewByProduct";
	}
}
