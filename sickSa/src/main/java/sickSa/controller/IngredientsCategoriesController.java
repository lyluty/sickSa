package sickSa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import sickSa.dao.IngredientCategoriesMapper;
import sickSa.domain.IngredientCategories;

@Controller
public class IngredientsCategoriesController {
	
	@Autowired
	private IngredientCategoriesMapper ingredientCategoriesMapper; 
	 
	
	// 재료 카테고리 한개 반환 OK
	@RequestMapping("/IGCTList")
	public String ingredientCategoriesListTest(Model model){
		
		model.addAttribute("ingredientCategoriesList", ingredientCategoriesMapper.ingredientCategoriesList());
		return "ingredientCategoriesSelect";
	}
	
	// 재료 카테고리 아이디로 찾기 OK
	@RequestMapping("/IGCTID/{igct_id}")
	public String selectIngredientCategoriesByIdTest(Model model,  @PathVariable("igct_id") Integer igct_id){
			
		model.addAttribute("selectIngredientCategoriesById", ingredientCategoriesMapper.selectIngredientCategoriesById(igct_id));
		return "ingredientCategoriesById";
	}
	
	// 재료 카테고리 삽입 X
	
	// INSERT FORM
	@RequestMapping("/IGCTINSERTFORM")
	public String insertFormIngredientCategoriesTest(){
		return "ingredientInsertForm";
	}
	
	// ACTION FORM
	@RequestMapping("/IGCTACTIONFORM")
	public String actionFormIngredientCategoriesTest(Model model, @PathVariable("igct_name") String igct_name){
		model.addAttribute("insertIngredientCategories", ingredientCategoriesMapper.insertIngredientCategories(igct_name));
		return "ingredientActionForm";
	}
	
	
	// 재료 카테고리 삭제 OK 지워지긴 함.
	@RequestMapping("/IGCTDELETE/{igct_id}")
	public String deleteIngredientCategoriesTest(Model model, @PathVariable("igct_id") Integer igct_id){
		
		model.addAttribute("deleteIngredientCategories", ingredientCategoriesMapper.deleteIngredientCategories(igct_id));
		return "ingredientCategoriesSelect";
	}
	
	// 재료 카테고리 수정
	@RequestMapping("/IGCTUPDATEFORM")
	public String updateIngredientCategoriesTest(){
		return "ingredientCategoriesUpdateForm";
	}
	
	@RequestMapping("/IGCTUPDATEACTION")
	public String updateIngredientCategoriesActionTest(Model model, @ModelAttribute("ingredientCategories") IngredientCategories ingredientCategories){
		System.out.println("sipal");
		ingredientCategoriesMapper.updateIngredientCategories(ingredientCategories);
		model.addAttribute("ingredientCategoriesList", ingredientCategoriesMapper.ingredientCategoriesList());
		return "ingredientCategoriesSelect";
	}
	
	
}
