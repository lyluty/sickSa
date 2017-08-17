package sickSa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import sickSa.dao.IngredientCategoriesMapper;
import sickSa.dao.IngredientsMapper;
import sickSa.domain.Ingredients;

@Controller
public class IngredientsController {
	
	@Autowired
	private IngredientsMapper ingredientsMapper;
	 
	@RequestMapping("/selectIngredients/{ing_id}")
	public String selectIngredientsTest(Model model,@PathVariable("ing_id") Integer ing_id) {
		model.addAttribute(
				"ingredientList", ingredientsMapper.ingredientList());
		model.addAttribute(
				"ingredient", ingredientsMapper.selectIngredientById(ing_id));
	    return "ingredientsSelect";
	}
	
<<<<<<< HEAD
	@RequestMapping("/insertFormIngredients")
	public String insertFormIngredientsTest(){
		
		return "ingredientsInsertForm";
	}
	
	@RequestMapping("/insertActionIngredients")
	public String insertActionIngredientsTest(
			Model model,@ModelAttribute("ingredient") Ingredients ingredients){
		ingredientsMapper.insertIngredient(ingredients);
		return "forward:/selectIngredients/"+ingredients.getIng_id();
=======
	@RequestMapping("/test/ingredientCategories/{igct_id}")
	public String ingredientCategoriesListTest(
			Model model,@PathVariable("igct_name") Integer igct_id){
		
		/*
		model.addAttribute(
				"ingredientCategoryList", ingredientCategoriesMapper.ingredientCategoriesList());
		model.addAttribute(
				"ingredientCategory", ingredientCategoriesMapper.selectIngredientCategoriesById(igct_id));
		*/
		return "test/testIngredientCategories";
>>>>>>> branch 'master' of https://github.com/lyluty/sickSa
	}
	
	
	
	@Autowired
	public void setIngredientsDao(IngredientsMapper ingredientsDao) {
		System.out.println("@Autowired => IngredientsDao: "+ingredientsDao);
		
		
		this.ingredientsMapper = ingredientsDao;
	}
	
}
