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
	  // modal check
	@RequestMapping("checkModal.do")
	public String checkType(Model model){
		if(storeService.getRest()!=0){
			model.addAttribute("restCnt",storeService.getRest());			
			return  "restModal";
		}
		model.addAttribute("waitCnt",storeService.getWaiting());			
		return "waitModal";
	}

	@RequestMapping("waitModal")
	public String waitModal(){
		return "main/waitModal";
	}
		
		@RequestMapping("restModal")
		public String restModal(){
			return "main/restModal";
		}
	
}
