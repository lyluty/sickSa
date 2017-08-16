package sickSa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import sickSa.dao.IngredientCategoriesMapper;
import sickSa.dao.IngredientsMapper;

@Controller
public class IngredientsController {
	
	@Autowired
	private IngredientsMapper ingredientsMapper;
	@Autowired
	private IngredientCategoriesMapper ingredientCategoriesMapper; 
	 
	@RequestMapping("/test/ingredients/{ing_id}")
	public String testIngredients(Model model,@PathVariable("ing_id") Integer ing_id) {
		model.addAttribute("ingredientList", ingredientsMapper.ingredientList());
		model.addAttribute("ingredient", ingredientsMapper.selectIngredientById(ing_id));
	    return "test/testIngredients";
	}
	
	@RequestMapping("/test/ingredientCategories/{igct_id}")
	public String testIngredientCategories(
			Model model,@PathVariable("igct_id") Integer igct_id){
		model.addAttribute(
				"ingredientCategoryList", ingredientCategoriesMapper.ingredientCategoriesList());
		model.addAttribute(
				"ingredientCategory", ingredientCategoriesMapper.selectIngredientCategoriesById(igct_id));
		return "test/testIngredientCategories";
	}
	
	@Autowired
	public void setIngredientsDao(IngredientsMapper ingredientsDao) {
		System.out.println("@Autowired => IngredientsDao: "+ingredientsDao);
		this.ingredientsMapper = ingredientsDao;
	}
	
}
