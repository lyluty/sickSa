package sickSa.domain;
/*
**********************************
* Table Name: 재료정보 
**********************************
CREATE TABLE INGREDIENT_DETAILS(
		ING_ID                        		NUMBER(6)		 NULL ,
		IGDT_IN                       		DATE		 DEFAULT SYSDATE		 NOT NULL,
		IGDT_OUT                      		DATE		 DEFAULT SYSDATE		 NOT NULL,
		IGDT_PRICE                    		NUMBER(6)		 NOT NULL,
		IGDT_CONTACT                  		VARCHAR2(16)		 NULL ,
		IGCT_ID                       		NUMBER(6)		 NULL 
);

COMMENT ON TABLE INGREDIENT_DETAILS is '재료정보';
COMMENT ON COLUMN INGREDIENT_DETAILS.ING_ID is '재료번호';
COMMENT ON COLUMN INGREDIENT_DETAILS.IGDT_IN is '재료입고일시';
COMMENT ON COLUMN INGREDIENT_DETAILS.IGDT_OUT is '재료출고일시';
COMMENT ON COLUMN INGREDIENT_DETAILS.IGDT_PRICE is '재료단가';
COMMENT ON COLUMN INGREDIENT_DETAILS.IGDT_CONTACT is '거래처연락처';
COMMENT ON COLUMN INGREDIENT_DETAILS.IGCT_ID is '재고카테고리번호';

ALTER TABLE INGREDIENT_DETAILS ADD CONSTRAINT IDX_INGREDIENT_DETAILS_PK PRIMARY KEY (ING_ID);
ALTER TABLE INGREDIENT_DETAILS ADD CONSTRAINT IDX_INGREDIENT_DETAILS_FK0 FOREIGN KEY (IGCT_ID) REFERENCES INGREDIENT_CATEGORIES (IGCT_ID);
ALTER TABLE INGREDIENT_DETAILS ADD CONSTRAINT IDX_INGREDIENT_DETAILS_FK1 FOREIGN KEY (ING_ID) REFERENCES INGREDIENTS (ING_ID);

*/

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class IngredientDetails {
	/* Variable */
	private int ing_id;
	private Date igdt_in;
	private Date igdt_out;
	private int igdt_price;
	private String igdt_contact;
	private int igct_id;

	/* Constructor */
	public IngredientDetails() {
		// TODO Auto-generated constructor stub
	}
	
	public IngredientDetails(int ing_id, Date igdt_in, Date igdt_out, int igdt_price, String igdt_contact,
			int igct_id) {
		super();
		this.ing_id = ing_id;
		this.igdt_in = igdt_in;
		this.igdt_out = igdt_out;
		this.igdt_price = igdt_price;
		this.igdt_contact = igdt_contact;
		this.igct_id = igct_id;
	}
	
	@Override
	public String toString() {
		return "["+ing_id+"]"+igdt_in+"-"+igdt_out+":"+igdt_price+"$ :"+igdt_contact;
	}
	
	/* Method */
	// Getter, Setter
	public int getIng_id() {
		return ing_id;
	}

	public void setIng_id(int ing_id) {
		this.ing_id = ing_id;
	}

	public Date getIgdt_in() {
		return igdt_in;
	}

	public void setIgdt_in(Date igdt_in) {
		this.igdt_in = igdt_in;
	}

	public Date getIgdt_out() {
		return igdt_out;
	}

	public void setIgdt_out(Date igdt_out) {
		this.igdt_out = igdt_out;
	}

	public int getIgdt_price() {
		return igdt_price;
	}

	public void setIgdt_price(int igdt_price) {
		this.igdt_price = igdt_price;
	}

	public String getIgdt_contact() {
		return igdt_contact;
	}

	public void setIgdt_contact(String igdt_contact) {
		this.igdt_contact = igdt_contact;
	}

	public int getIgct_id() {
		return igct_id;
	}

	public void setIgct_id(int igct_id) {
		this.igct_id = igct_id;
	}
	

	
}
