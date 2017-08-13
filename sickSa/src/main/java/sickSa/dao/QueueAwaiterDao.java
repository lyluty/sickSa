package sickSa.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import sickSa.domain.QueueAwaiter;

/*
**********************************
* Table Name: 대기자정보 *
**********************************
CREATE TABLE QUEUE_AWAITERS(
		QAWT_ID                       		NUMBER(6)		 NULL ,
		QAWT_CONTACT                  		VARCHAR2(16)		 NULL 
);

COMMENT ON TABLE QUEUE_AWAITERS is '대기자정보';
COMMENT ON COLUMN QUEUE_AWAITERS.QAWT_ID is '대기자번호';
COMMENT ON COLUMN QUEUE_AWAITERS.QAWT_CONTACT is '대기자연락처';


ALTER TABLE QUEUE_AWAITERS ADD CONSTRAINT IDX_QUEUE_AWAITERS_PK PRIMARY KEY (QAWT_ID);
*/
public interface QueueAwaiterDao {
	public List<QueueAwaiter> selectQueueAwaiterList();
	public QueueAwaiter selectQueueAwaiterById(Integer qawtId);
	public QueueAwaiter selectNextAwaiter();
	public void deleteQueueAwaiter(QueueAwaiter awaiter);
//	public String selectQueueAwaiterById(@Param("qawtId") Integer qawtId);
//	public void insertQueueAwaiter(QueueAwaiter queueAwaiter);
//	public void updateQueueAwaiter(QueueAwaiter queueAwaiter);
//	public void deleteQueueAwaiter(int qawt_id);
}
