package sickSa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import sickSa.mapper.IngredientCategoriesMapper;

@Controller
public class BootstrapIngredientsCategoriesController {
	
	@Autowired
	private IngredientCategoriesMapper ingredientCategoriesMapper;
	
	
	public void setIngredientCategoriesMapper(IngredientCategoriesMapper ingredientCategoriesMapper) {
		this.ingredientCategoriesMapper = ingredientCategoriesMapper;
	}


	@RequestMapping("/static/bootIndex")
	public String bootStrap(){
		System.out.println("부트스트랩 ㅁ에인테스트");
		
		return "index.html";
	}
}