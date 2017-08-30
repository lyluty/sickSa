package sickSa.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import sickSa.domain.IngredientCategories;

public interface IngredientCategoriesMapper {
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
	
	// list 한개 반환
	public List<IngredientCategories> ingredientCategoriesList();
	// id로 카테고리 검색
	public IngredientCategories selectIngredientCategoriesById(String igct_name);
	// 카테고리 추가
	public Integer insertIngredientCategories(IngredientCategories ingredientCategories);
	// id로 카테고리 삭제
	public Integer deleteIngredientCategories(Integer igct_id);
	// 카테고리 수정
	public Integer updateIngredientCategories(IngredientCategories ingredientCategories);
	
	public IngredientCategories selectIngredientCategoryById(int igct_id);
}
