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

  private int tbl_id;
  private String tbl_is_empty;

  public int getTbl_id() {
    return tbl_id;
  }

  public void setTbl_id(int tbl_id) {
    this.tbl_id = tbl_id;
  }

  public String getTbl_is_empty() {
    return tbl_is_empty;
  }

  public void setTbl_is_empty(String tbl_is_empty) {
    this.tbl_is_empty = tbl_is_empty;
  }
}
