package sickSa.dao;

public interface IngredientCategoriesDao {

}
package sickSa.dao;

import java.util.List;

import sickSa.domain.IngredientCategories;

public interface IngredientCategoriesDao {
	/*
	 메쏘드 이름은 StudentMapper.xml파일의 id 와일치
	 인자타입은 StudentMapper.xml 의  parameterType과일치
	 반환형 StudentMapper.xml 의 resultType,resultMap 과일치
	  
	 <select id="findStudentById" 
			parameterType="java.lang.Integer" 
			resultType="com.mybatis3.domain.Student">
		...
	 </select>
	  
	 */
	
	public List<IngredientCategories> selectIngredientCategoriesList();
	// list 한개 반환
	public IngredientCategories selectIngredientCategoriesById(Integer igct_id);
	// id로 카테고리 검색
	public Integer insertIngredientCategories(String igct_name);
	// 카테고리 추가
	public Integer deleteIngredientCategories(Integer igct_id);
	// id로 카테고리 삭제
	public Integer updateIngredientCategories(IngredientCategories ingredientCategories);
	// 카테고리 수정
	
}
