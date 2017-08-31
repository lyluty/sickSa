package sickSa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sickSa.service.QueueService;
import sickSa.service.ServingService;
import sickSa.service.StoreService;

@Controller
public class QueueController {

	@Autowired
	QueueService queueService;
	StoreService storeService;
	ServingService servingService;


	// modal check
	@RequestMapping("checkModal")
	public String checkType(Model model) {
		if (storeService.getRest() != 0) {
			model.addAttribute("type", "order");
			model.addAttribute("restCnt", storeService.setRest());
			System.out.println("1" + storeService.getRest());
			return "mainIndex";
		}
		model.addAttribute("type", "waiting");
		model.addAttribute("waitCnt", storeService.getWaiting());
		System.out.println(storeService.getWaiting());
		return "mainIndex";
	}

/*
	@RequestMapping("waitModal")
	public String waitModal() {
		return "waitModal";
	}

	@RequestMapping("restModal")
	public String restModal() {
		return "restModal";
	}

	@RequestMapping("mainModal")
	public String mainModal() {
		return "mainModal";
	}
	*/

}
