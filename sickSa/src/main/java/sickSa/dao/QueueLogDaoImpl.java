package sickSa.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import sickSa.domain.QueueLog;

public class QueueLogDaoImpl implements QueueLogDao {
	
	SqlSession sqlSession;

	@Override
	public Integer insertQueueLog(QueueLog queueLog) {
		return sqlSession.insert("insertQueueLog", queueLog);
	}
	
	@Override
	public QueueLog selectQueueLog(Integer qlog_id) {
		return sqlSession.selectOne("selectQueueLog", qlog_id);
	}
	
	@Override
	public Integer updateQueueLog(QueueLog qlst_code) {
		return sqlSession.update("updateQueueLog", qlst_code);
	}
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
}
