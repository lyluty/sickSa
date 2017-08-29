package sickSa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import sickSa.service.QueueService;
import sickSa.service.StoreService;

@Controller
public class QueueController {

	@Autowired
	QueueService queueService;
	StoreService storeService;

	// modal check
	@RequestMapping("checkModal.do")
	public String checkType(Model model) {
		if (storeService.getRest() != 0) {
			model.addAttribute("restCnt", storeService.getRest());
			return "restModal";
		}
		model.addAttribute("waitCnt", storeService.getWaiting());
		return "waitModal";
	}

	@RequestMapping("waitModal")
	public String waitModal() {
		return "waitModal";
	}

	@RequestMapping("restModal")
	public String restModal() {
		return "restModal";
	}
}
