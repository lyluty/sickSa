package sickSa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	@RequestMapping("productMain")
	public String productMain(){
		
		return "index";
	}
}
