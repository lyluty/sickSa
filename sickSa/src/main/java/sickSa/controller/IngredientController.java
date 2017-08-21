package sickSa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import sickSa.domain.IngredientCategories;
import sickSa.service.IngredientService;

@Controller
public class IngredientController {
	
	@Autowired
	private IngredientService ingredientService;
	
	
	/*
	@RequestMapping("/igctList")
	public String loadListIgct(Model model){
		model.addAttribute(
				"ingredientCategoriesList", ingredientService.loadListIgct());
		return "ingredientCategoriesSelect";
	}
	*/
	
	@RequestMapping("/igctInsertForm")
	public String addIgctForm(){
		return "ingredientCategoriesInsertForm";
	}
	
	@RequestMapping("/igctInsertAction")
	public String addIgctAction(Model model, 
			@ModelAttribute("ingredientCategory") 
					IngredientCategories ingredientCategories){
		model.addAttribute("insertIngredientCategories",ingredientService.addIgct(ingredientCategories));
		return "forward:/IGCTSelect/"+ingredientCategories.getIgct_name();
	}
	
	// Test
	@RequestMapping("/igctList")
	public String loadListIgct(Model model){
		model.addAttribute(
				"ingredientCategoriesList", ingredientService.loadListIgct());
		
		return "/jsp/index";
	}
	
}
