package sickSa.mapper;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import sickSa.domain.ProductIngredients;

public class ProductIngredientMapperImpl implements ProductIngredientMapper{
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public ProductIngredients passAmount(Integer PDT_ID) {
		return sqlSession.selectOne("passAmount", PDT_ID);
	}

}
