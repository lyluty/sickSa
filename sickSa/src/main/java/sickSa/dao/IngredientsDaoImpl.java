package sickSa.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import sickSa.domain.Ingredients;

public class IngredientsDaoImpl implements IngredientsDao{
	
	@Autowired
	private SqlSession sqlSession;
	
	public IngredientsDaoImpl() {
		System.out.println("IngredientsDaoImpl Constructor():"+this);
	}

	@Override
	public Ingredients selectAllIngredient() {
		
		return null;
	}

	@Override
	public Ingredients selectIngredientById(Integer ING_ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer insertIngredient(Ingredients ingredient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteIngredient(Integer ING_ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updateIngredient(Ingredients ingredient) {
		// TODO Auto-generated method stub
		return null;
	}

}
