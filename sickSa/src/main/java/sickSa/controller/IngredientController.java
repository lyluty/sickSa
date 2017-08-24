package sickSa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	
	//defaultList
	@RequestMapping("/ingList")
	public String loadListIgct(Model model) {
		model.addAttribute("ingredientCategoriesList", ingredientService.loadDefaultList());
		return "ingredientCateView";
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
	
<<<<<<< HEAD
	
=======
	// Test
	@RequestMapping("/igctList")
	public String loadListIgct(Model model){
		System.out.println("asdfsdfadf");
		model.addAttribute(
				"ingredientCategoriesList", ingredientService.loadListIgct());
		return "/ingridentTestMain";
	}
>>>>>>> branch 'master' of https://github.com/lyluty/sickSa
	
	@RequestMapping("/categoriesDetail")
	public String loadDetail(Model model){
		System.out.println("detail load success!!");
		model.addAttribute("ingredientCategoriesList", ingredientService.loadListIgct());
		
		return "/ingridentAddView";
	}
	
	
}
