package sickSa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import sickSa.service.QueueService;

@Controller
public class ProductController {
	@Autowired
	private QueueService queueService;
	
	@RequestMapping("/productMain")
	public String productMain(){
		System.out.println("1");
		return "index";
	}
	
	@RequestMapping("/test/queue/{qawtId}")
	public String test(Model model, @PathVariable Integer qawtId) {
		model.addAttribute("queueAwaiterList", queueService.getQueueAwaiterList());
		model.addAttribute("queueAwaiter", queueService.getQueueAwaiterById(qawtId));
		model.addAttribute("nextAwaiter", queueService.callAwaiter());
		return "test/queue.jsp";
	}
	
	@Autowired
	public void setQueueService(QueueService queueService) {
		System.out.println("@Autowired => QueueService: " + queueService);
		this.queueService = queueService;
	}
}
