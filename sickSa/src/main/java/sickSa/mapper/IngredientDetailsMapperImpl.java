package sickSa.mapper;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import sickSa.domain.IngredientDetails;

public class IngredientDetailsMapperImpl implements IngredientDetailsMapper {
	
	@Autowired
	private SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		System.out.println("sqlSession: " + sqlSession);
		this.sqlSession = sqlSession;
	}
	
	public IngredientDetailsMapperImpl() {
		System.out.println("IngredientDetailsDaoImpl Constructor():"+this);
	}

	@Override
	public List<IngredientDetails> listIngDetail() {
		return sqlSession.selectList("listIngDetail");
	}

	@Override
	public IngredientDetails selectIngDetailById(Integer ING_ID) {
		return sqlSession.selectOne("selectIngredientDetailById",ING_ID);
	}

	@Override
	public Integer insertIngDetail(IngredientDetails ingredientDetails) {
		return sqlSession.insert("insertIngDetail",ingredientDetails);
	}

	@Override
	public Integer deleteIngDetail(Integer ING_ID) {
		return sqlSession.delete("deleteIngDetail",ING_ID);
	}

	@Override
	public Integer updateIngDetail(IngredientDetails ingredientDetails) {
		return sqlSession.update("updateIngDetail",ingredientDetails);
	}

}
