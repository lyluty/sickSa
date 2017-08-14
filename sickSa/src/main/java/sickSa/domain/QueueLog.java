package sickSa.domain;

import java.util.Date;

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
public class QueueLog {
	/* Variable */
	public static final int STATE_PROGRESS = 10;
	public static final int STATE_COMPLETE = 20;
	public static final int STATE_CANCELED = 90;
	
	private int qlog_id;
	private int qlog_number;
	private String qlog_contact;
	private Date qlog_date;
	
	/* Constructor */
	public QueueLog() {}
	public QueueLog(int qlog_id, int qlog_number, String qlog_contact, Date qlog_date) {
		this.qlog_id = qlog_id;
		this.qlog_number = qlog_number;
		this.qlog_contact = qlog_contact;
		this.qlog_date = qlog_date;
	}

	/* Method */
	// Getter, Setter
	public int getQlog_id() {
		return qlog_id;
	}

	public void setQlog_id(int qlog_id) {
		this.qlog_id = qlog_id;
	}

	public int getQlog_number() {
		return qlog_number;
	}

	public void setQlog_number(int qlog_number) {
		this.qlog_number = qlog_number;
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
}
