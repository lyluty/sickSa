package sickSa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import sickSa.domain.Product;
import sickSa.domain.ProductCategories;
import sickSa.service.ProductService;


@Controller
public class ProductListController {
	@Autowired
	private ProductService productService;
	 
	@RequestMapping("/productL")
	public String listProduct(Model model){
		//List<ProductCategories> categories = productService.getAllCategories();
		List<Product> p = productService.getAllCategoryProductList(1);
		// System.out.println(categories);
		model.addAttribute("productList",p);
		//model.addAttribute("categoryList",categories);
		return "test/product/product";
		
	}
	
	@RequestMapping("/product")
	public String detailProduct(Model model, @RequestParam int pdct_id){
		//List<ProductCategories> categories = productService.getAllCategories();
		List<Product> p = productService.getAllCategoryProductList(pdct_id);
		// System.out.println(categories);
		model.addAttribute("productList",p);
		//model.addAttribute("categoryList",categories);
		return "test/product/product";
		
	}
}