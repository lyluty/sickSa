package sickSa.domain;

/*
 		**********************************
 			* Table Name: 테이블 *
 		**********************************
CREATE TABLE TABLES(
		TBL_ID                        		NUMBER(3)		 NOT NULL,
		TBL_IS_EMPTY                  		CHAR(1)		 DEFAULT 'Y'		 NULL 
);

DROP SEQUENCE TABLES_TBL_ID_SEQ;

CREATE SEQUENCE TABLES_TBL_ID_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

COMMENT ON TABLE TABLES is '테이블';
COMMENT ON COLUMN TABLES.TBL_ID is '테이블번호';
COMMENT ON COLUMN TABLES.TBL_IS_EMPTY is '공석여부';
 */


public class Table {

	private  int tbl_id;
	private char tbl_isEmpty;
	
	
	public Table(){
		
	}
	
  public Table(int tbl_id, char tbl_isEmpty){
		this.tbl_id=tbl_id;
		this.tbl_isEmpty=tbl_isEmpty;
	}

public int getTbl_id() {
	return tbl_id;
}

public void setTbl_id(int tbl_id) {
	this.tbl_id = tbl_id;
}

public char getTbl_isEmpty() {
	return tbl_isEmpty;
}

public void setTbl_isEmpty(char tbl_isEmpty) {
	this.tbl_isEmpty = tbl_isEmpty;
}
	
  @Override
  
  public String toString(){
	  return tbl_id+"\t/+\t"+tbl_isEmpty;
	  
  }
  
}
