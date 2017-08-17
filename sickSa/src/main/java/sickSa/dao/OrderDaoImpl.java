package sickSa.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import sickSa.domain.Order;


public class OrderDaoImpl implements OrderDao{

	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<Order> getOrders() {
		return sqlSession.selectList("getOrders");
	}
	
	@Override
	public int selectOrder(Order order) {
		return sqlSession.selectOne("selectOrder");
	}
	
	@Override
	public int insertOrder(Order order) {
		return sqlSession.insert("insertOrder",order);
	}


	@Override
	public int updateOrder(Order order) {
		return sqlSession.update("updateOrder");
	}

	@Override
	public int deleteOrder(Order ord_no) {
		return sqlSession.delete("deleteOrder",ord_no);
		
	}

}
