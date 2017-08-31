package sickSa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Index, 기타등등 여기다 담으셈
 */
@Controller
public class MainController {

	@RequestMapping("Modal")
	public String Modal() {
		return "Modal";
	
	
}
}
