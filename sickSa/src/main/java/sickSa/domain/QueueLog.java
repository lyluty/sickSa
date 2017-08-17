package sickSa.domain;

import java.util.Date;

/*
**********************************
* Table Name: 대기로그 *
**********************************
CREATE TABLE QUEUE_LOGS(
		QLOG_ID                       		NUMBER(6)		 NULL ,
		QLOG_CONTACT                  		VARCHAR2(16)		 NULL ,
		QLOG_DATE                     		DATE		 DEFAULT SYSDATE		 NULL ,
		QLST_CODE                     		NUMBER(2)		 DEFAULT 10		 NULL 
);

CREATE SEQUENCE QUEUE_LOGS_QLOG_ID_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

COMMENT ON TABLE QUEUE_LOGS is '대기로그';
COMMENT ON COLUMN QUEUE_LOGS.QLOG_ID is '대기ID';
COMMENT ON COLUMN QUEUE_LOGS.QLOG_CONTACT is '대기자연락처';
COMMENT ON COLUMN QUEUE_LOGS.QLOG_DATE is '대기발생일시';
COMMENT ON COLUMN QUEUE_LOGS.QLST_CODE is '대기상태코드';

ALTER TABLE QUEUE_LOGS ADD CONSTRAINT IDX_QUEUE_LOGS_PK PRIMARY KEY (QLOG_ID);
ALTER TABLE QUEUE_LOGS ADD CONSTRAINT IDX_QUEUE_LOGS_FK0 FOREIGN KEY (QLST_CODE) REFERENCES QUEUE_LOG_STATES (QLST_CODE);
*/

public class QueueLog {
	/* Variable */
	public static final int STATE_PROGRESS = 10;
	public static final int STATE_COMPLETE = 20;
	public static final int STATE_CANCELED = 90;
	
	private int qlog_id;
	private String qlog_contact;
	private Date qlog_date;
	private int qlst_code;
	
	/* Constructor */
	public QueueLog() {}
	public QueueLog(int qlog_id, String qlog_contact, Date qlog_date, int qlst_code) {
		super();
		this.qlog_id = qlog_id;
		this.qlog_contact = qlog_contact;
		this.qlog_date = qlog_date;
		this.qlst_code = qlst_code;
	}

	/* Method */
	// Getter, Setter
	public int getQlog_id() {
		return qlog_id;
	}

	public void setQlog_id(int qlog_id) {
		this.qlog_id = qlog_id;
	}


	public String getQlog_contact() {
		return qlog_contact;
	}

	public void setQlog_contact(String qlog_contact) {
		this.qlog_contact = qlog_contact;
	}

	public Date getQlog_date() {
		return qlog_date;
	}

	public void setQlog_date(Date qlog_date) {
		this.qlog_date = qlog_date;
	}
	
	public int getQlst_code() {
		return qlst_code;
	}
	public void setQlst_code(int qlst_code) {
		this.qlst_code = qlst_code;
	}
}
