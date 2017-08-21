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
	private int ING_ID;
	private String ING_NAME;
	private int ING_STOCK;
	private String ING_MEASURE;
	private IngredientDetails ingredientDetails;
	private IngredientCategories ingredientCategories;
	
	/* Construcotr */
	public Ingredients() {
		// TODO Auto-generated constructor stub
	}
	
	public Ingredients(int iNG_ID, String iNG_NAME, int iNG_STOCK, String iNG_MEASURE) {
		super();
		ING_ID = iNG_ID;
		ING_NAME = iNG_NAME;
		ING_STOCK = iNG_STOCK;
		ING_MEASURE = iNG_MEASURE;
	}
	
	public Ingredients(
			int iNG_ID, String iNG_NAME, int iNG_STOCK, 
			String iNG_MEASURE, IngredientDetails ingredientDetails) {
		super();
		ING_ID = iNG_ID;
		ING_NAME = iNG_NAME;
		ING_STOCK = iNG_STOCK;
		ING_MEASURE = iNG_MEASURE;
		this.ingredientDetails = ingredientDetails;
	}

	public Ingredients(
			int iNG_ID, String iNG_NAME, int iNG_STOCK, String iNG_MEASURE,
			IngredientDetails ingredientDetails, IngredientCategories ingredientCategories) {
		super();
		ING_ID = iNG_ID;
		ING_NAME = iNG_NAME;
		ING_STOCK = iNG_STOCK;
		ING_MEASURE = iNG_MEASURE;
		this.ingredientDetails = ingredientDetails;
		this.ingredientCategories = ingredientCategories;
	}
	
	
	/* toString */
	@Override
	public String toString() {
		return "["+ING_ID+"]"+ING_NAME+","+ING_STOCK+","+ING_MEASURE;
	}
	
	public IngredientDetails getIngredientDetails() {
		return ingredientDetails;
	}

	public void setIngredientDetails(IngredientDetails ingredientDetails) {
		this.ingredientDetails = ingredientDetails;
	}

	public IngredientCategories getIngredientCategories() {
		return ingredientCategories;
	}

	public void setIngredientCategories(IngredientCategories ingredientCategories) {
		this.ingredientCategories = ingredientCategories;
	}

	
	/* Method */
	// Getter, Setter
	public int getIng_id() {
		return ING_ID;
	}


	public void setIng_id(int ING_ID) {
		this.ING_ID = ING_ID;
	}


	public String getIng_name() {
		return ING_NAME;
	}


	public void setIng_name(String ING_NAME) {
		this.ING_NAME = ING_NAME;
	}


	public int getIng_stock() {
		return ING_STOCK;
	}


	public void setIng_stock(int ING_STOCK) {
		this.ING_STOCK = ING_STOCK;
	}


	public String getIng_measure() {
		return ING_MEASURE;
	}


	public void setIng_measure(String ING_MEASURE) {
		this.ING_MEASURE = ING_MEASURE;
	}
	
}
