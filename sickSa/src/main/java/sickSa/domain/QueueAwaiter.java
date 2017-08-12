package sickSa.domain;

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
public class QueueAwaiter {
	/* Variable */
	private int qawt_id;
	private String qawt_contact;
	
	/* Constructor */
	public QueueAwaiter(int qawt_id, String qawt_contact) {
		this.qawt_id = qawt_id;
		this.qawt_contact = qawt_contact;
	}

	/* Method */
	// Getter, Setter
	public int getQawt_id() {
		return qawt_id;
	}

	public void setQawt_id(int qawt_id) {
		this.qawt_id = qawt_id;
	}

	public String getQawt_contact() {
		return qawt_contact;
	}

	public void setQawt_contact(String qawt_contact) {
		this.qawt_contact = qawt_contact;
	}
}
