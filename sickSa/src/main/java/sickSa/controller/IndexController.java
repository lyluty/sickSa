package sickSa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sickSa.service.StoreService;

@Controller
public class IndexController {

	@Autowired
	StoreService storeService;

	@RequestMapping("mainIndex")
	public String mainIndex(Model model) {
		 /*
		storeService.setRest();
		storeService.setWaiting();
		*/
		
		System.out.println("1" +storeService.getRest());
		System.out.println("2"+storeService.getWaiting());
	
		model.addAttribute("restCnt", storeService.getRest());
		model.addAttribute("waitCnt", storeService.getWaiting());
		
		return "mainIndex";
	}

}
