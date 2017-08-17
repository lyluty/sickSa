package sickSa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import sickSa.dao.IngredientCategoriesMapper;
import sickSa.dao.IngredientsMapper;
import sickSa.domain.Ingredients;

@Controller
public class IngredientsCategoriesController {
	
	@Autowired
	private IngredientCategoriesMapper ingredientCategoriesMapper; 
	 
	
	// 재료 카테고리 한개 반환 OK
	@RequestMapping("/test/IGCTList")
	public String ingredientCategoriesListTest(Model model){
		
		model.addAttribute("ingredientCategoriesList", ingredientCategoriesMapper.ingredientCategoriesList());
		
		return "test/ingredientCategoriesSelect";
	}
	
	// 재료 카테고리 아이디로 찾기 OK
	@RequestMapping("/test/IGCTID/{igct_id}")
	public String selectIngredientCategoriesByIdTest(Model model,  @PathVariable("igct_id") Integer igct_id){
			
		model.addAttribute("selectIngredientCategoriesById", ingredientCategoriesMapper.selectIngredientCategoriesById(igct_id));
		
		return "test/ingredientCategoriesById";
	}
	
	// 재료 카테고리 삽입 X
	
	// INSERT FORM
	@RequestMapping("/test/IGCTINSERTFORM")
	public String insertFormIngredientCategoriesTest(){
		
		return "test/ingredientInsertForm";
	}
	
	// ACTION FORM
	@RequestMapping("/test/IGCTACTIONFORM")
	public String actionFormIngredientCategoriesTest(Model model, @PathVariable("igct_name") String igct_name){
		
		model.addAttribute("insertIngredientCategories", ingredientCategoriesMapper.insertIngredientCategories(igct_name));
		
		return "test/ingredientActionForm";
	}
	
	
	
	
}
