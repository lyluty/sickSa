package sickSa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import sickSa.domain.IngredientCategories;
import sickSa.domain.IngredientDetails;
import sickSa.domain.Ingredients;
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
		
		return "ingredientCateAddView";
	}
	
	@RequestMapping("/igctInsertAction")
	public String addIgctAction( 
			@ModelAttribute("ingredientCategories") IngredientCategories ingredientCategories){
		ingredientService.addIgct(ingredientCategories);
		return "forward:/ingredients";
	}
	
	@RequestMapping("/ingInsertForm")
	public String addIngForm(Model model){
		model.addAttribute(
				"igctList", ingredientService.loadListIgct());
		return "ingredientAddView";
	}
	
	@RequestMapping("/ingInsertAction")
	public String addIngAction(
			@ModelAttribute("ingredients") Ingredients ingredients,
			@ModelAttribute("ingredientDetails") IngredientDetails igdt){
		ingredientService.addIng(ingredients, igdt);
		return "forward:/ingredients";
	}
	
	
}
