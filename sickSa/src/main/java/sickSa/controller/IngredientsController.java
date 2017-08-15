package sickSa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import sickSa.dao.IngredientsMapper;

@Controller
public class IngredientsController {
	
	@Autowired
	private IngredientsMapper ingredientsDao;
	 
	@RequestMapping("/test/ingredients/{ing_id}")
	public String testMybatis(Model model,@PathVariable("ing_id") Integer ing_id) {
		model.addAttribute("ingredientList", ingredientsDao.ingredientList());
		model.addAttribute("ingredient", ingredientsDao.selectIngredientById(ing_id));
	    return "test/testIngredients";
	}
	
	@Autowired
	public void setIngredientsDao(IngredientsMapper ingredientsDao) {
		System.out.println("@Autowired => IngredientsDao: "+ingredientsDao);
		this.ingredientsDao = ingredientsDao;
	}
	
}
