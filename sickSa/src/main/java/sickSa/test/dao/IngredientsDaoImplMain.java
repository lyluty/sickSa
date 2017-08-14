package sickSa.test.dao;

import java.util.List;

import sickSa.dao.IngredientsDaoImpl;
import sickSa.domain.Ingredients;

public class IngredientsDaoImplMain {
	public static void main(String[] args) {
		IngredientsDaoImpl test = new IngredientsDaoImpl();
		
		List<Ingredients> list = test.selectAllIngredient();
		
		for (Ingredients ingredients : list) {
			System.out.println(ingredients);
		}
	}
}
