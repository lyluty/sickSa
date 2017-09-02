package sickSa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import sickSa.service.SalesService;

@Controller
public class TestController {

	@Autowired
	SalesService salesService;
	
	@RequestMapping("test")
	public String test() {
		return "common/test";
	}
}
