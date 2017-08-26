package sickSa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import sickSa.domain.IngredientCategories;
import sickSa.mapper.IngredientCategoriesMapper;
import sickSa.mapper.IngredientDetailsMapper;
import sickSa.service.IngredientService;

@Controller
public class IngredientController {
	
	@Autowired
	private IngredientService ingredientService;
	@Autowired
	private IngredientDetailsMapper ingredientDetailsMapper;
	@Autowired
	private IngredientCategoriesMapper ingredientCategoriesMapper;
	
	public void setIngredientService(IngredientService ingredientService) {
		this.ingredientService = ingredientService;
	}
	
	@RequestMapping("/ingredients")
	public String salesView() {
		return "ingredientView";
	}
	@RequestMapping("/igctList")
	public String loadIgctList(Model model){
		model.addAttribute("ingredientCategoriesList", ingredientCategoriesMapper.ingredientCategoriesList());
		return "ingredientCateListView";
	}
	
	//defaultList
	@RequestMapping("/ingList/{IGCT_ID}")
	public String loadIngList(Model model, @PathVariable Integer IGCT_ID) {
		model.addAttribute("ingredientList", ingredientService.loadDefaultList(IGCT_ID));
		return "ingredientListView";
	}

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
	
	
	
}
