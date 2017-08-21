package sickSa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sickSa.mapper.IngredientCategoriesMapper;

@Controller
public class BootstrapIngredientsCategoriesController {
	
	@Autowired
	private IngredientCategoriesMapper ingredientCategoriesMapper;
	
	
	
	public void setIngredientCategoriesMapper(IngredientCategoriesMapper ingredientCategoriesMapper) {
		this.ingredientCategoriesMapper = ingredientCategoriesMapper;
	}


	
	/*
	// JSP 들어감
	@RequestMapping("/static/bootIndex")
	public String bootStrap(){
		System.out.println("부트스트랩 ㅁ에인테스트");
		
		return "ingredientsUpdateForm";
	}
	*/
	
	
	
	// ViewResolver 있어도 redirect로 됨.
	@RequestMapping("/static/bootIndex2")
	public String bootStrap2(){
		System.out.println("부트스트랩 메인테스트2");
		
		return "redirect:/static/index.html";
	}
}