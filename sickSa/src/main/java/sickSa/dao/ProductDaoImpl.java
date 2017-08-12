package sickSa.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import sickSa.domain.Product;


public class ProductDaoImpl implements ProductDao {
	private SqlSession sqlSession;
	
	
	public void setSqlSession(SqlSession sqlSession) {
		System.out.println("2.### HelloDaoImpl.setSqlSession("+sqlSession+")");
		this.sqlSession = sqlSession;
	}


	@Override
	public ArrayList<Product> list() {
		
		ArrayList<Product> ProductList = new ArrayList<Product>();
		
		return ProductList;
	}

}
