package sickSa.mapper;


import java.util.List;

import sickSa.domain.ProductIngredients;

public interface ProductIngredientMapper {
	public List<ProductIngredients> passAmount(Integer PDT_ID);
}
