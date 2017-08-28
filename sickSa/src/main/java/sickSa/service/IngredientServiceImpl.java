package sickSa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import sickSa.domain.IngredientCategories;
import sickSa.domain.IngredientDetails;
import sickSa.domain.Ingredients;
import sickSa.domain.ProductIngredients;
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
	
	//모든 재료 카테고리별 모든 재료 리스트를 불러온다
	@Override
	public @ResponseBody ArrayList<Ingredients> loadDefaultList(Integer IGCT_ID) {
		List<IngredientDetails> igdtList = 
				ingredientDetailsMapper.selectIngDetailByCt(IGCT_ID);
		List<Ingredients> ingList = ingredientsMapper.listIngredient();
		ArrayList<Ingredients> resultIng = new ArrayList<>();
		for (Ingredients ing : ingList) {
			for (IngredientDetails igdt : igdtList) {
				if(ing.getIng_id()==igdt.getIng_id()){
					ing.setIngredientDetails(igdt);
					resultIng.add(ing);
				}
			}
		}
		System.out.println(IGCT_ID);
		System.out.println(resultIng.toString());
		return resultIng;
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
	public List<Ingredients> loadListIng(Integer IGCT_NAME) {
		return ingredientsMapper.cateIngList(IGCT_NAME);
	}
	//재료를 추가한다
	@Override
	public Integer addIng(Ingredients ing,IngredientDetails igdt) {
		ing.setIngredientDetails(igdt);
		return ingredientsMapper.insertIngredient(ing);
	}
	//재료의 정보를 확인한다
	@Override
	public IngredientDetails openIngDetail(Integer ING_ID) {
		return ingredientDetailsMapper.selectIngDetailById(ING_ID);
	}
	//재료의 정보(단위,입고일시,출고일시,재료단가,연락처)를 수정한다
	@Override
	public Integer updateIngDetail(IngredientDetails ingredientDetails) {
		return ingredientDetailsMapper.updateIngDetail(ingredientDetails);
	}
	//재료를 입고하여,출고하여 재고를 변경한다
	@Override
	public Integer changeStock(ProductIngredients productIngredients) {
		return ingredientsMapper.changeStock(productIngredients);
	}
	//재료를 삭제한다
	@Override
	public Integer expireStock(Integer ING_ID) {
		return ingredientDetailsMapper.deleteIngDetail(ING_ID);
	}
	

}
