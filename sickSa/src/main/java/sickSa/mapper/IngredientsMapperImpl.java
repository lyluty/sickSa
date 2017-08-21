package sickSa.mapper;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import sickSa.domain.Ingredients;

public class IngredientsMapperImpl implements IngredientsMapper{
	
	@Autowired
	private SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		System.out.println("sqlSession: " + sqlSession);
		this.sqlSession = sqlSession;
	}
	
	public IngredientsMapperImpl() {
		System.out.println("IngredientsDaoImpl Constructor():"+this);
	}
	
	//
	@Override
	public List<Ingredients> listIngredient() {
		return sqlSession.selectList("listIngredient");
	}
	
	public List<Ingredients> cateIngList() {
		return sqlSession.selectList("cateIngList");
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
