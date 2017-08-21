package sickSa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import sickSa.domain.Ingredients;
import sickSa.mapper.IngredientCategoriesMapper;
import sickSa.mapper.IngredientsMapper;

@Controller
public class IngredientsController {
	
	@Autowired
	private IngredientsMapper ingredientsMapper;
	 
	//@RequestMapping("/selectAllIngredients")
	public String selectAllIngredientsTest(Model model) {
		model.addAttribute(
				"ingredientList", ingredientsMapper.listIngredient());
		return "ingredientsSelectAll";
	}
	
	//@RequestMapping("/selectIngredients/{ing_id}")
	public String selectIngredientsTest(
			Model model,@PathVariable("ing_id") Integer ing_id) {
		model.addAttribute(
				"ingredient", ingredientsMapper.selectIngredientById(ing_id));
	    return "ingredientsSelect";
	}
	
	//@RequestMapping("/insertFormIngredients")
	public String insertFormIngredientsTest(){
		return "ingredientsInsertForm";
	}
	
	//@RequestMapping("/insertActionIngredients")
	public String insertActionIngredientsTest(
			Model model,@ModelAttribute("ingredient") Ingredients ingredients){
		ingredientsMapper.insertIngredient(ingredients);
		return "forward:/selectIngredients/"+ingredients.getIng_id();
	}
	
	//@RequestMapping("/updateFormIngredients/{ing_id}")
	public String updateFormIngredientTest(
			Model model,@PathVariable("ing_id") Integer ing_id){
		model.addAttribute(
				"ingredient", ingredientsMapper.selectIngredientById(ing_id));
		return "ingredientsUpdateForm";
	}
	
	//@RequestMapping("/updateActionIngredients")
	public String updateActionIngredientTest(
			Model model,@ModelAttribute("ingredient") Ingredients ingredients){
		ingredientsMapper.updateIngredient(ingredients);
		return "forward:/selectIngredients/"+ingredients.getIng_id();
	}
	
	//@RequestMapping("/deleteActionIngredients/{ing_id}")
	public String deleteActionIngredientTest(
			Model model,@PathVariable("ing_id") Integer ing_id){
		ingredientsMapper.deleteIngredient(ing_id);
		return "forward:/selectAllIngredients";
	}
	
	@Autowired
	public void setIngredientsDao(IngredientsMapper ingredientsDao) {
		System.out.println("@Autowired => IngredientsDao: "+ingredientsDao);
		
		this.ingredientsMapper = ingredientsDao;
	}
	
}
