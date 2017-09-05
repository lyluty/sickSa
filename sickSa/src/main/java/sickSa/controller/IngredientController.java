package sickSa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
		return "ing/ingredientView";
	}
	
	@RequestMapping("/igctList")
	public String loadIgctList(Model model){
		model.addAttribute("ingredientCategoriesList", ingredientCategoriesMapper.ingredientCategoriesList());
		return "ing/ingredientCateListView";
	}
	
	
	@RequestMapping("/ingList")
	public String testLoadList(Model model, @RequestParam int igct_id) {
		List<Ingredients> ingredientList = ingredientService.loadListIng(igct_id);
		model.addAttribute("ingredientList", ingredientList);
		return "ing/ingListView";
	}
	

	//@RequestMapping("/igctInsertForm")
	public String addIgctForm(){
		return "ing/ingredientCateAddView";
	}
	
	@RequestMapping(value="/igctInsertAction", method=RequestMethod.POST)
	public String addIgctAction( 
			@ModelAttribute("ingredientCategories") IngredientCategories ingredientCategories){
		System.out.println("input");
		System.out.println(ingredientCategories.toString());
		ingredientService.addIgct(ingredientCategories);
		System.out.println("return");
		return "forward:/ingredients";
	}
	
	@RequestMapping("/ingInsertForm")
	public String addIngForm(Model model){
		model.addAttribute(
				"igctList", ingredientService.loadListIgct());
		return "ing/ingredientAddView";
	}
	
	@RequestMapping(value="/ingInsertAction", method=RequestMethod.POST)
	public String addIngAction(
			@ModelAttribute("ingredients") Ingredients ingredients,
			@ModelAttribute("ingredientDetails") IngredientDetails igdt){
		System.out.println(ingredients.toString());
		System.out.println(igdt.toString());
		ingredientService.addIng(ingredients, igdt);
		return "forward:/ingredients";
	}
	
}
