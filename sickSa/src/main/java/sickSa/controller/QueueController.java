package sickSa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import sickSa.service.QueueService;

@Controller
public class QueueController {

	@Autowired
	QueueService queueService;

	@RequestMapping("/test/queue")
	public String test() {
		return "test/queue";
	}

	@RequestMapping("/test/queue/list")
	public String testList(Model model) {
		model.addAttribute("queueLogList", queueService.list());
		return "test/queue/list";
	}
	
	@RequestMapping("/test/queue/get/{qlog_id}")
	public String testGet(Model model, @PathVariable("qlog_id") int qlog_id) {
		model.addAttribute("queueLog", queueService.get(qlog_id));
		return "test/queue/get";
	}
}
