package sickSa.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import sickSa.domain.Product;
import sickSa.service.ProductService;
@SessionAttributes("spdt_Id")
@Controller
public class ProductViewController {
	@Autowired
	private ProductService productService;
	
	
	@RequestMapping("/product_view")
	public String viewProduct( Model model, @RequestParam int pdt_id){
	 
		  Product p = productService.getProductById(pdt_id);
		  System.out.println("p번호"+p);
		  System.out.println(p); 
		  model.addAttribute("spdt_Id",p);
		 // model.addAttribute("cartOne", );
		  
		  return "test/product/product_view";
		
	}
	
}