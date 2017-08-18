package sickSa.mapper;

import java.util.List;

import sickSa.domain.Ingredients;

public interface IngredientsMapper {
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
	/*
		-재료 카테고리와 하위 재료재고정보 조회
		 (재료명, 단위, 단가, 거래처연락처)
 		
		-재료 추가/삭제
		
	 */
	public List<Ingredients> ingredientList();
	public Ingredients selectIngredientById(Integer ING_ID);
	public Integer insertIngredient(Ingredients ingredient);
	public Integer deleteIngredient(Integer ING_ID);
	public Integer updateIngredient(Ingredients ingredient);
}
