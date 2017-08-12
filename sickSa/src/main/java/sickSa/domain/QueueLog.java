package sickSa.domain;

import java.util.Date;

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
public class QueueLog {
	/* Variable */
	private int qlog_id;
	private Date qlog_record;
	private int qawt_id;
	
	/* Constructor */
	public QueueLog(int qlog_id, Date qlog_record, int qawt_id) {
		this.qlog_id = qlog_id;
		this.qlog_record = qlog_record;
		this.qawt_id = qawt_id;
	}

	/* Method */
	// Getter, Setter
	public int getQlog_id() {
		return qlog_id;
	}

	public void setQlog_id(int qlog_id) {
		this.qlog_id = qlog_id;
	}

	public Date getQlog_record() {
		return qlog_record;
	}

	public void setQlog_record(Date qlog_record) {
		this.qlog_record = qlog_record;
	}

	public int getQawt_id() {
		return qawt_id;
	}

	public void setQawt_id(int qawt_id) {
		this.qawt_id = qawt_id;
	}
}
