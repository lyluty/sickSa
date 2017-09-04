package sickSa.controller;


import javax.servlet.http.HttpSession;


import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import sickSa.service.OrderService;
import sickSa.service.StoreService;

/*
 * Index, 기타등등 여기다 담으셈
 */
@Controller
public class MainController {

	@Autowired
	StoreService storeService;
	@Autowired
	OrderService orderService;

	@RequestMapping("mainIndex")
	public String mainIndex(Model model) {
		 /*
		storeService.setRest();
		storeService.setWaiting();
		model.addAttribute("restCnt", storeService.getRest());
		model.addAttribute("waitCnt", storeService.getWaiting());
		*/
		model.addAttribute("restCnt", orderService.getRestTableCount());
	    model.addAttribute("tableList", orderService.tableList());

		return "mainIndex";
	}
	
	//로그인버튼 누르기
	@RequestMapping("loginForm")
	public String loginForm(){
		return "common/login";
	}

	@RequestMapping("logout")
	public String logout(HttpSession session){
		 session.setAttribute("loginStatus", false);
		return "common/login";
	}

	@RequestMapping("matchPw")
	public String matchPw(HttpSession session,@RequestParam("pw_pin") String pw_pin){
		 session.setAttribute("loginStatus", storeService.checkPin(pw_pin));
		if(storeService.checkPin(pw_pin)){			
			return "ing/ingredientView";		//임시
		}
		return "common/login";
	}
		
	//로그인 체크
	@RequestMapping("loginAction")
	public String loginAction(Session session, @RequestParam("pw_pin") String pw_pin){
		if(storeService.checkPin(pw_pin)){	
			System.out.println("true");
			return "";

		}
		System.out.println("false");
		return "";
	}
	
}

