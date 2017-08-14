package sickSa.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import sickSa.domain.QueueAwaiter;


public class QueueAwaiterDaoImpl implements QueueAwaiterDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		System.out.println("sqlSession: " + sqlSession);
		this.sqlSession = sqlSession;
	}
	
	public QueueAwaiterDaoImpl() {
		System.out.println("QueueAwaiterDaoImpl Constructor(): " + this);
	}
	
	@Override
	public List<QueueAwaiter> selectQueueAwaiterList() {
		return sqlSession.selectList("selectQueueAwaiterList");
	}

	@Override
	public QueueAwaiter selectQueueAwaiterById(Integer qawtId) {
		return sqlSession.selectOne("selectQueueAwaiterById", qawtId);
	}

	@Override
	public QueueAwaiter selectNextAwaiter() {
		return sqlSession.selectOne("selectNextAwaiter");
	}

	@Override
	public void deleteQueueAwaiter(QueueAwaiter awaiter) {
//		int qwatId = awaiter.getQawt_id();
//		sqlSession.delete("deleteQueueAwaiter", qwatId);
	}

}
