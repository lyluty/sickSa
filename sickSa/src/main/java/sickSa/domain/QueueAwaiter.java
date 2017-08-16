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
	private int qlogId;
	private String contact;
	
	/* Constructor */
	public QueueAwaiter() {}
	public QueueAwaiter(int qlogId, String contact) {
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
