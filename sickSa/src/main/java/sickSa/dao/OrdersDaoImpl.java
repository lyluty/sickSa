package sickSa.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import sickSa.domain.Orders;


public class OrdersDaoImpl implements OrdersDao{

	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<Orders> getOrders() {
		return sqlSession.selectList("getOrders");
	}
	
	@Override
	public void selectOrders(Orders order) {
		sqlSession.selectOne("selectOrders");
	}
	
	@Override
	public void insertOrders(Orders order) {
		sqlSession.insert("insertOrders",order);
	}


	@Override
	public void updateOrders(Orders order) {
		sqlSession.update("updateOrders");
	}

	@Override
	public void deleteOrders(Orders ord_no) {
		sqlSession.delete("deleteOrders",ord_no);
		
	}

}
