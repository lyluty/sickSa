package sickSa.mapper;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import sickSa.domain.ProductIngredients;

public class ProductIngredientMapperImpl implements ProductIngredientMapper{
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<ProductIngredients> passAmount(Integer PDT_ID) {
		return sqlSession.selectList("passAmount", PDT_ID);
	}

}
