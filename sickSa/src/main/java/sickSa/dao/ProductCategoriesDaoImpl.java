package sickSa.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import sickSa.domain.Product;
import sickSa.domain.ProductCategory;


public  class ProductCategoriesDaoImpl implements ProductCategoriesDao {

	public static final String namespace = "com.mybatis3.mapper.ProductCategoriesMapper.";
	private SqlSession sqlSession;
	
	public ProductCategoriesDaoImpl(){
		
	}
	
	public void setSqlSession(SqlSession sqlSession) {
		System.out.println("2.### ProductCatecoriesDaoImpl.setSqlSession("+sqlSession+")");
		this.sqlSession = sqlSession;
	}

	
	@Override
	public int insertCategories(ProductCategory addPC) {
		int insertCate = sqlSession.insert("insertCategories", addPC);
		return insertCate;
	}


	@Override
	public int updateCategories(ProductCategory updatePC) {
		int updateCate = sqlSession.update("updateCategories", updatePC);
		return updateCate;
	}


	@Override
	public List<ProductCategory> selectAllProductCategories() {
		List<ProductCategory> categoriesList = sqlSession.
		selectList("selectAllProductCategories");
		return categoriesList;
	}
}
	
	