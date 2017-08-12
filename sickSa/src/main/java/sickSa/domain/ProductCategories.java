package sickSa.domain;

/*
**********************************
* Table Name: 상품카테고리 *
/**********************************
CREATE TABLE PRODUCT_CATEGORIES(
		PDCT_ID                       		NUMBER(6)		 NULL ,
		PDCT_NAME                     		VARCHAR2(20)		 NOT NULL
);

COMMENT ON TABLE PRODUCT_CATEGORIES is '상품카테고리';
COMMENT ON COLUMN PRODUCT_CATEGORIES.PDCT_ID is '상품카테고리번호';
COMMENT ON COLUMN PRODUCT_CATEGORIES.PDCT_NAME is '상품카테고리명';


ALTER TABLE PRODUCT_CATEGORIES ADD CONSTRAINT IDX_PRODUCT_CATEGORIES_PK PRIMARY KEY (PDCT_ID);
*/

public class ProductCategories {
	
	/* Variable */
	private int pdct_id;
	private String pdct_name;
	
	/* Constructor */
	public ProductCategories(int pdct_id, String pdct_name) {
		this.pdct_id = pdct_id;
		this.pdct_name = pdct_name;
	}

	/* Method */
	// Getter, Setter
	
	public int getPdct_id() {
		return pdct_id;
	}
	
	public void setPdct_id(int pdct_id) {
		this.pdct_id = pdct_id;
	}
	
	public String getPdct_name() {
		return pdct_name;
	}
	
	public void setPdct_name(String pdct_name) {
		this.pdct_name = pdct_name;
	}
	
	
}
