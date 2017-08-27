package sickSa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


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
	@RequestMapping("mainIndex")
	public String mainIndex(){
		return "mainIndex";		
	}
	
	@RequestMapping("login")
		public String login(){
			return "login";
		}
		
}
