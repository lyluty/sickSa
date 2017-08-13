package sickSa.dao;

import sickSa.domain.QueueLog;

/*
**********************************
* Table Name: 대기로그 *
**********************************
CREATE TABLE QUEUE_LOGS(
		QLOG_ID                       		NUMBER(6)		 NULL ,
		QLOG_NUMBER                   		NUMBER(2)		 NOT NULL,
		QLOG_CONTACT                  		VARCHAR2(16)		 NULL ,
		QLOG_DATE                     		DATE		 DEFAULT SYSDATE		 NULL 
);

CREATE SEQUENCE QUEUE_LOGS_QLOG_ID_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

COMMENT ON TABLE QUEUE_LOGS is '대기로그';
COMMENT ON COLUMN QUEUE_LOGS.QLOG_ID is '대기ID';
COMMENT ON COLUMN QUEUE_LOGS.QLOG_NUMBER is '대기순번';
COMMENT ON COLUMN QUEUE_LOGS.QLOG_CONTACT is '대기자연락처';
COMMENT ON COLUMN QUEUE_LOGS.QLOG_DATE is '대기발생일시';


ALTER TABLE QUEUE_LOGS ADD CONSTRAINT IDX_QUEUE_LOGS_PK PRIMARY KEY (QLOG_ID);
*/
public interface QueueLogDao {
	public void insert(QueueLog queueLog);
	public Integer getStateCount(Integer qstd_id);
}
