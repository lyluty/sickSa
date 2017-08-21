package sickSa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sickSa.domain.Product;
import sickSa.service.ProductService;
@Controller
public class ProductListController {
	
	private ProductService productService;
	
	
	@Autowired
	public void setProductService(ProductService productService){
		this.productService = productService;
	}
	
	@RequestMapping("/product")
	public String listProduct(Model model){
		
		List<Product> p = productService.getAllProductList();
		 
		model.addAttribute("productList",p);
		return "test/product";
		
	}
}