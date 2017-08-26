package sickSa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import sickSa.domain.IngredientCategories;
import sickSa.domain.IngredientDetails;
import sickSa.domain.Ingredients;
import sickSa.domain.ProductIngredients;

public interface IngredientService {
	
	//모든 재료 카테고리별 모든 재료 리스트를 불러온다
	public List<Ingredients> loadDefaultList(Integer IGCT_ID);
	
	//재료 카테고리를 리스트로 불러온다
	public List<IngredientCategories> loadListIgct();
	//재료 카테고리를 추가한다
	public Integer addIgct(IngredientCategories ingredientCategories);
	//재료 카테고리를 삭제한다
	public Integer deleteIgct(Integer IGCT_ID);
	//재료 카테고리를 수정한다
	public Integer updateIgct(IngredientCategories ingredientCategories);
	
	
	//재료 카테고리에 따른 재료를 리스트에 마지막으로 추가된 재료를 가져온다
	public List<Ingredients> loadListIng(Integer IGCT_ID);
	//재료를 추가한다
	public Integer addIng(Ingredients ing,IngredientDetails igdt,IngredientCategories igct);
	//재료의 정보를 확인한다
	public IngredientDetails openIngDetail(Integer ING_ID);
	//재료의 정보(단위,입고일시,출고일시,재료단가,연락처)를 수정한다
	public Integer updateIngDetail(IngredientDetails ingredientDetails);
	//재료를 입고하여,출고하여 재고를 변경한다
	public Integer changeStock(ProductIngredients productIngredients);
	//재료를 삭제한다
	public Integer expireStock(Integer ING_ID);
	
}
