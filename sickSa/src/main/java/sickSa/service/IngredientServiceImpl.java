package sickSa.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
import sickSa.mapper.ProductIngredientMapper;

@Service
public class IngredientServiceImpl implements IngredientService{
	
	@Autowired
	private IngredientsMapper ingredientsMapper;
	@Autowired
	private IngredientDetailsMapper ingredientDetailsMapper;
	@Autowired
	private IngredientCategoriesMapper ingredientCategoriesMapper;
	@Autowired
	private ProductIngredientMapper productIngredientMapper;
	
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
	
	public void setProductIngredientMapper(ProductIngredientMapper productIngredientMapper) {
		this.productIngredientMapper = productIngredientMapper;
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
	public List<Ingredients> loadListIng(Integer igct_id) {
		IngredientCategories ingredientCategory = ingredientCategoriesMapper.selectIngredientCategoryById(igct_id);
		System.out.println(ingredientCategory);
		return ingredientsMapper.cateIngList(ingredientCategory.getIgct_name());
	}
	//재료를 추가한다
	@Override
	public Integer addIng(Ingredients ing,IngredientDetails igdt) {
		ingredientsMapper.insertIngredient(ing);
		return ingredientDetailsMapper.insertIngDetail(igdt); 
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
	//재료를 출고하면서 출고일시 기록과 재고의 변경을 한다 
	@Override
	public Integer changeStock(Integer pdt_id) {
		ProductIngredients pdig = productIngredientMapper.passAmount(pdt_id);
		Map<Integer, Integer> pdigMap = pdig.getPdig_amount();
		
		Set<Integer> ingIdSet = pdigMap.keySet();
		
		for (Integer ingId : ingIdSet) {
			ingredientDetailsMapper
						.changeIgctOut(
								(ingredientDetailsMapper
										.selectIngDetailById(ingId)));
		}
		return ingredientsMapper.changeStock(pdig);
	}
	//재료를 삭제한다
	@Override
	public Integer expireStock(Integer ING_ID) {
		return ingredientDetailsMapper.deleteIngDetail(ING_ID);
	}
	

}
