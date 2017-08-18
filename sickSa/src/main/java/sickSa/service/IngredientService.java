package sickSa.service;

import java.util.List;


import sickSa.domain.IngredientCategories;
import sickSa.domain.IngredientDetails;
import sickSa.domain.Ingredients;

public interface IngredientService {
	
	//재료 카테고리를 리스트로 불러온다
	public List<IngredientCategories> loadListIgct();
	//재료 카테고리를 추가한다
	public Integer addIgct(IngredientCategories ingredientCategories);
	//재료 카테고리를 삭제한다
	public Integer deleteIgct(Integer IGCT_ID);
	//재료 카테고리를 수정한다
	public Integer updateIgct(IngredientCategories ingredientCategories);
	
	//재료 카테고리에 따른 재료를 리스트로 불러온다
	public List<Ingredients> loadListIng();
	//재료를 추가한다
	public Integer addIng(Ingredients ingredients);
	//재료의 정보를 추가한다
	public Integer addIngDetail(IngredientDetails ingredientDetails);
	//재료의 정보를 확인한다
	public IngredientDetails openIngDetail(Integer ING_ID);
	//재료의 정보(단위,입고일시,출고일시,재료단가,연락처)를 수정한다
	public Integer updateIngDetail(IngredientDetails ingredientDetails);
	//재료를 입고하여,출고하여 재고를 변경한다
	public Integer changeStock(Integer ING_STOCK);
	//재료를 삭제한다
	public Integer expireStock(Integer ING_ID);
	
}
