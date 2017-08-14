package sickSa.domain;

/*
**********************************
* Table Name: 재료 
**********************************
CREATE TABLE INGREDIENTS(
		ING_ID                        		NUMBER(6)		 NULL ,
		ING_NAME                      		VARCHAR2(20)		 NOT NULL,
		ING_STOCK                     		NUMBER(6)		 DEFAULT 0		 NOT NULL,
		ING_MEASURE                   		VARCHAR2(2)		 NOT NULL
);

COMMENT ON TABLE INGREDIENTS is '재료';
COMMENT ON COLUMN INGREDIENTS.ING_ID is '재료번호';
COMMENT ON COLUMN INGREDIENTS.ING_NAME is '재료명';
COMMENT ON COLUMN INGREDIENTS.ING_STOCK is '재료재고량';
COMMENT ON COLUMN INGREDIENTS.ING_MEASURE is '재료재고단위';


ALTER TABLE INGREDIENTS ADD CONSTRAINT IDX_INGREDIENTS_PK PRIMARY KEY (ING_ID);
*/


public class Ingredients {
	/* Variable */
	private int ing_id;
	private String ing_name;
	private int ing_stocknumber;
	private String ing_measure;
	
	
	/* Construcotr */
	public Ingredients(int ing_id, String ing_name, int ing_stock, String ing_measure) {
		super();
		this.ing_id = ing_id;
		this.ing_name = ing_name;
		this.ing_stocknumber = ing_stock;
		this.ing_measure = ing_measure;
	}
	
	@Override
	public String toString() {
		return "["+ing_id+"]"+ing_name+","+ing_stocknumber+","+ing_measure;
	}
	
	/* Method */
	// Getter, Setter
	public int getIng_id() {
		return ing_id;
	}


	public void setIng_id(int ing_id) {
		this.ing_id = ing_id;
	}


	public String getIng_name() {
		return ing_name;
	}
	


	public void setIng_name(String ing_name) {
		this.ing_name = ing_name;
	}


	public int getIng_stock() {
		return ing_stocknumber;
	}


	public void setIng_stock(int ing_stock) {
		this.ing_stocknumber = ing_stock;
	}


	public String getIng_measure() {
		return ing_measure;
	}


	public void setIng_measure(String ing_measure) {
		this.ing_measure = ing_measure;
	}
	
}
