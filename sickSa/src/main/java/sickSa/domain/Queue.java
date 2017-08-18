package sickSa.domain;

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


**********************************
* Table Name: 대기상태표 *
**********************************
CREATE TABLE QUEUE_LOG_STATES(
		QLST_CODE                     		NUMBER(2)		 NOT NULL,
		QLST_NAME                     		VARCHAR2(10)		 NOT NULL
);

COMMENT ON TABLE QUEUE_LOG_STATES is '대기상태표';
COMMENT ON COLUMN QUEUE_LOG_STATES.QLST_CODE is '대기상태코드';
COMMENT ON COLUMN QUEUE_LOG_STATES.QLST_NAME is '대기상태이름';

ALTER TABLE QUEUE_LOG_STATES ADD CONSTRAINT IDX_QUEUE_LOG_STATES_PK PRIMARY KEY (QLST_CODE);
*/

public class Queue {
	/* Variable */
	private int qlogId;
	private String contact;
	
	/* Constructor */
	public Queue() {}
	public Queue(int qlogId, String contact) {
		this.qlogId = qlogId;
		this.contact = contact;
	}
	
	/* Method */
	// Getter, Setter
	public int getQueueId() {
		return qlogId;
	}
	public void setQueueId(int qlogId) {
		this.qlogId = qlogId;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
}
