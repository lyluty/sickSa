package sickSa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MobileController {

	@RequestMapping("mobileIndex")
	public String mobileIndex() {
		return "mobileIndex";
	}
}
