package sickSa.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import sickSa.domain.Ingredients;

public class IngredientsDaoImpl implements IngredientsDao{
	
	@Autowired
	private SqlSession sqlSession;
	
	public IngredientsDaoImpl() {
		System.out.println("IngredientsDaoImpl Constructor():"+this);
	}
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	//
	@Override
	public List<Ingredients> selectAllIngredient() {
		return sqlSession.selectList("selectAllIngredient");
	}

	@Override
	public Ingredients selectIngredientById(Integer ING_ID) {
		return sqlSession.selectOne("selectIngredientById",ING_ID);
	}

	@Override
	public Integer insertIngredient(Ingredients ingredient) {
		return sqlSession.insert("insertIngredient",ingredient);
	}

	@Override
	public Integer deleteIngredient(Integer ING_ID) {
		return sqlSession.delete("deleteIngredient",ING_ID);
	}

	@Override
	public Integer updateIngredient(Ingredients ingredient) {
		return sqlSession.update("updateIngredient",ingredient);
	}

}
