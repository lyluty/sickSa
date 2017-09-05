package sickSa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import sickSa.service.SalesService;
import sickSa.service.TestService;

@Controller
public class TestController {

	@Autowired
	SalesService salesService;
	@Autowired
	TestService testService;
	
	@RequestMapping("test")
	@ResponseBody
	public String test() {
		System.out.println("여기까진 오나?");
		testService.test(3);
		System.out.println("여기가 문제가 아니었다");
		return "common/test";
	}
}
