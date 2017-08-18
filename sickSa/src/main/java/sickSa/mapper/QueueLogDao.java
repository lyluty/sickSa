package sickSa.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import sickSa.domain.QueueLog;

@Mapper
public interface QueueLogDao {
	
	public List<QueueLog> selectList();
	
	public QueueLog selectOne(int qlog_id);
	
	public int insert(QueueLog queueLog);

	public Integer update(QueueLog queueLog);
	
	public int delete(int qlog_id);
}
