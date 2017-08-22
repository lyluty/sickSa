package sickSa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping("testMain")
	public String testMain() {
		return "testIndex";
	}
	
	@RequestMapping("testMain2")
	public String testMain2() {
		return "testIndex2";
	}
	
	@RequestMapping("sales")
	public String sales() {
		return "sales";
	}
	
	@RequestMapping("salesViewHtm")
	public String salesViewHtml(@RequestParam String startDate, @RequestParam String endDate) {
		System.out.println("start: " + startDate);
		System.out.println("end: " + endDate);
		return "salesView2";
	}
}
