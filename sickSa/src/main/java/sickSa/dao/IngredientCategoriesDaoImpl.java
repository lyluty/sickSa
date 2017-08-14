package sickSa.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import sickSa.domain.IngredientCategories;

public class IngredientCategoriesDaoImpl implements IngredientCategoriesDao {

	
	@Autowired
	private SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		System.out.println("sqlSession: " + sqlSession);
		this.sqlSession = sqlSession;
	}
	
	public IngredientCategoriesDaoImpl() {
		System.out.println("IngredientCategoriesDaoImpl Constructor(): "+ this);
	}
	
	@Override
	public List<IngredientCategories> selectIngredientCategoriesList() {
		return sqlSession.selectList("selectIngredientCategoriesList");
	}

	@Override
	public IngredientCategories selectIngredientCategoriesById(Integer igct_id) {
		return sqlSession.selectOne("selectIngredientCategoriesById");
	}

	@Override
	public Integer insertIngredientCategories(String igct_name) {
		return sqlSession.insert("insertIngredientCategories",igct_name);
	}

	@Override
	public Integer deleteIngredientCategories(Integer igct_id) {
		return sqlSession.delete("deleteIngredientCategories", igct_id);
	}

	@Override
	public Integer updateIngredientCategories(IngredientCategories ingredientCategories) {
		
		return sqlSession.update("updateIngredientCategories",ingredientCategories);
	}
}
