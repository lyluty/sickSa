package sickSa.dao;

import java.util.List;

import sickSa.domain.QueueAwaiter;
import sickSa.domain.QueueLog;

/*
**********************************
* Table Name: 대기로그 *
********************************** 
CREATE TABLE QUEUE_LOGS(
		QLOG_ID                       		NUMBER(6)		 NULL ,
		QLOG_RECORD                   		DATE		 DEFAULT SYSDATE		 NOT NULL,
		QAWT_ID                       		NUMBER(6)		 NULL 
);

COMMENT ON TABLE QUEUE_LOGS is '대기로그';
COMMENT ON COLUMN QUEUE_LOGS.QLOG_ID is '대기번호';
COMMENT ON COLUMN QUEUE_LOGS.QLOG_RECORD is '대기발생일시';
COMMENT ON COLUMN QUEUE_LOGS.QAWT_ID is '대기자번호';


ALTER TABLE QUEUE_LOGS ADD CONSTRAINT IDX_QUEUE_LOGS_PK PRIMARY KEY (QLOG_ID);
ALTER TABLE QUEUE_LOGS ADD CONSTRAINT IDX_QUEUE_LOGS_FK0 FOREIGN KEY (QAWT_ID) REFERENCES QUEUE_AWAITERS (QAWT_ID);
*/
public interface QueueLogDao {
	public List<QueueLog> selectAllQueueLogs();
	public void insertQueueLog(QueueLog queueLog);
	public void updateQueueLog(QueueLog queueLog);
	public void deleteQueueLog(int qlog_id);
}
