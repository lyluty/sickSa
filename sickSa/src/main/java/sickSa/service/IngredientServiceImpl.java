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
	
	/*ingredients, details, categories mapper setter*/
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
	
	//재료 카테고리를 리스트로 불러온다
	@Override
	public List<IngredientCategories> loadListIgct() {
		return ingredientCategoriesMapper.ingredientCategoriesList();
	}
	
	//재료 카테고리를 추가한다
	@Override
	public Integer addIgct(IngredientCategories ingredientCategories) {
		return ingredientCategoriesMapper
				.insertIngredientCategories(ingredientCategories);
	}
	
	//재료 카테고리를 삭제한다
	@Override
	public Integer deleteIgct(Integer IGCT_ID) {
		return ingredientCategoriesMapper
				.deleteIngredientCategories(IGCT_ID);
	}
	
	//재료 카테고리를 수정한다
	@Override
	public Integer updateIgct(IngredientCategories ingredientCategories) {
		return ingredientCategoriesMapper
				.updateIngredientCategories(ingredientCategories);
	}
	
	//재료 카테고리에 따른 재료를 리스트로 불러온다
	@Override
	public List<Ingredients> loadListIng(Integer IGCT_ID) {
		
		return null;
	}
	//재료를 추가한다
	@Override
	public Integer addIng(Ingredients ingredients) {
		
		return null;
	}
	//재료의 정보를 추가한다
	@Override
	public Integer addIngDetail(IngredientDetails ingredientDetails) {
		
		return null;
	}
	//재료의 정보를 확인한다
	@Override
	public IngredientDetails openIngDetail(Integer ING_ID) {
		
		return null;
	}
	//재료의 정보(단위,입고일시,출고일시,재료단가,연락처)를 수정한다
	@Override
	public Integer updateIngDetail(IngredientDetails ingredientDetails) {
		
		return null;
	}
	//재료를 입고하여,출고하여 재고를 변경한다
	@Override
	public Integer changeStock(Integer ING_STOCK) {
		
		return null;
	}
	//재료를 삭제한다
	@Override
	public Integer expireStock(Integer ING_ID) {
		
		return null;
	}

}
