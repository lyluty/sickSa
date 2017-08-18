package sickSa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import sickSa.domain.IngredientDetails;
import sickSa.domain.Ingredients;
import sickSa.mapper.IngredientCategoriesMapper;
import sickSa.mapper.IngredientDetailsMapper;
import sickSa.mapper.IngredientsMapper;

@Controller
public class IngredientDetailController {
	
	@Autowired
	private IngredientDetailsMapper ingredientDetailsMapper;
	 
	@RequestMapping("/selectAllIngDetails")
	public String selectAllIngDetailsTest(Model model) {
		model.addAttribute(
				"ingredientList", ingredientDetailsMapper.listIngDetail());
		return "ingredientsSelectAll";
	}
	
	@RequestMapping("/selectIngDetails/{ing_id}")
	public String selectIngDetailsTest(
			Model model,@PathVariable("ing_id") Integer ING_ID) {
		model.addAttribute(
				"ingredient", ingredientDetailsMapper.selectIngDetailById(ING_ID));
	    return "ingredientsSelect";
	}
	
	@RequestMapping("/insertFormIngDetails")
	public String insertFormIngDetailsTest(){
		return "ingredientsInsertForm";
	}
	
	@RequestMapping("/insertActionIngDetails")
	public String insertActionIngDetailsTest(
			Model model,@ModelAttribute("ingDetail") IngredientDetails ingredientDetails){
		ingredientDetailsMapper.insertIngDetail(ingredientDetails);
		return "forward:/selectIngDetails/"+ingredientDetails.getIng_id();
	}
	
	@RequestMapping("/updateFormIngDetails/{ing_id}")
	public String updateFormIngDetailsTest(
			Model model,@PathVariable("ing_id") Integer ING_ID){
		model.addAttribute(
				"ingDetail", ingredientDetailsMapper.selectIngDetailById(ING_ID));
		return "ingredientsUpdateForm";
	}
	
	@RequestMapping("/updateActionIngDetails")
	public String updateActionIngDetailsTest(
			Model model,@ModelAttribute("ingDetail") IngredientDetails ingredientDetails){
		ingredientDetailsMapper.updateIngDetail(ingredientDetails);
		return "forward:/selectIngDetails/"+ingredientDetails.getIng_id();
	}
	
	@RequestMapping("/deleteActionIngDetails/{ing_id}")
	public String deleteActionIngDetailsTest(
			Model model,@PathVariable("ing_id") Integer ING_ID){
		ingredientDetailsMapper.deleteIngDetail(ING_ID);
		return "forward:/selectAllIngDetails";
	}
	
	@Autowired
	public void setIngredientsDao(IngredientDetailsMapper ingredientDetailsMapper) {
		System.out.println("@Autowired => IngredientsDao: "+ingredientDetailsMapper);
		this.ingredientDetailsMapper = ingredientDetailsMapper;
	}
	
}
