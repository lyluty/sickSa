package sickSa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sickSa.domain.IngredientCategories;
import sickSa.domain.IngredientDetails;
import sickSa.domain.Ingredients;
import sickSa.mapper.IngredientCategoriesMapper;
import sickSa.mapper.IngredientDetailsMapper;
import sickSa.mapper.IngredientsMapper;

@Service
public class IngredientServiceImpl implements IngredientService{
	
	@Autowired
	private IngredientsMapper ingredientsMapper;
	@Autowired
	private IngredientDetailsMapper ingredientDetailsMapper;
	@Autowired
	private IngredientCategoriesMapper ingredientCategoriesMapper;
	
	public void setIngredientsMapper(IngredientsMapper ingredientsMapper) {
		this.ingredientsMapper = ingredientsMapper;
	}

	public void setIngredientDetailsMapper(
			IngredientDetailsMapper ingredientDetailsMapper) {
		this.ingredientDetailsMapper = ingredientDetailsMapper;
	}

	public void setIngredientCategoriesMapper(
			IngredientCategoriesMapper ingredientCategoriesMapper) {
		this.ingredientCategoriesMapper = ingredientCategoriesMapper;
	}

	@Override
	public List<IngredientCategories> loadListIgct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer addIgct(IngredientCategories ingredientCategories) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteIgct(Integer IGCT_ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updateIgct(IngredientCategories ingredientCategories) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ingredients> loadListIng() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer addIng(Ingredients ingredients) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer addIngDetail(IngredientDetails ingredientDetails) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IngredientDetails openIngDetail(Integer ING_ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updateIngDetail(IngredientDetails ingredientDetails) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer changeStock(Integer ING_STOCK) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer expireStock(Integer ING_ID) {
		// TODO Auto-generated method stub
		return null;
	}

}
