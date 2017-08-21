package sickSa.domain;

/***************************************
  STDT_ADMIN_PIN ====> VARCHAR2로 바꿔야 함
  추후 ERD & Table 수정..
 ***************************************/

/*
**********************************
* Table Name: 매장정보 *
**********************************
CREATE TABLE STORE_DATA(
		STDT_ADMIN_PIN                		NUMBER(6)		 DEFAULT 000000		 NOT NULL,
		STDT_CAPACITY                 		NUMBER(3)		 NULL ,
		STDT_REST                     		NUMBER(3)		 NULL ,
		STDT_WAITING                  		NUMBER(2)		 DEFAULT 0		 NULL 
);

COMMENT ON TABLE STORE_DATA is '매장정보';
COMMENT ON COLUMN STORE_DATA.STDT_ADMIN_PIN is '관리자PIN';
COMMENT ON COLUMN STORE_DATA.STDT_CAPACITY is '전체좌석수';
COMMENT ON COLUMN STORE_DATA.STDT_REST is '잔여좌석수';
COMMENT ON COLUMN STORE_DATA.STDT_WAITING is '대기인원수';
*/

public class StoreData {

	/* Variable */
	private String stdt_admin_pin;
	private int stdt_capacity;
	private int stdt_rest;
	private int stdt_waiting;

	/* Constructor */
	public StoreData() {
	}

	public StoreData(String stdt_admin_pin, int stdt_capacity, int stdt_rest, int stdt_waiting) {
		this.stdt_admin_pin = stdt_admin_pin;
		this.stdt_capacity = stdt_capacity;
		this.stdt_rest = stdt_rest;
		this.stdt_waiting = stdt_waiting;
	}

	/* Getter, Setter */
	public String getStdt_adminPin() {
		return stdt_admin_pin;
	}

	public void setStdt_adminPin(String stdt_admin_pin) {
		this.stdt_admin_pin = stdt_admin_pin;
	}

	public int getStdt_capacity() {
		return stdt_capacity;
	}

	public void setStdt_capacity(int stdt_capacity) {
		this.stdt_capacity = stdt_capacity;
	}

	public int getStdt_rest() {
		return stdt_rest;
	}

	public void setStdt_rest(int stdt_rest) {
		this.stdt_rest = stdt_rest;
	}

	public int getStdt_waiting() {
		return stdt_waiting;
	}

	public void setStdt_waiting(int stdt_waiting) {
		this.stdt_waiting = stdt_waiting;
	}

}
