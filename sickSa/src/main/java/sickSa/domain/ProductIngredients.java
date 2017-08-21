package sickSa.domain;

import java.util.Map;

public class ProductIngredients {
	
	private int PDT_ID;
	//Map<ING_ID,PDIG_AMOUNT>
	private Map<Integer, Integer> PDIG_AMOUNT;
	
	public ProductIngredients() {}
	
	public ProductIngredients(int PDT_ID, Map<Integer, Integer> PDIG_AMOUNT) {
		super();
		this.PDT_ID = PDT_ID;
		this.PDIG_AMOUNT = PDIG_AMOUNT;
	}
	
	@Override
	public String toString() {
		return PDT_ID+":"+PDIG_AMOUNT;
	}
	
	public int getPDT_ID() {
		return PDT_ID;
	}

	public void setPDT_ID(int PDT_ID) {
		this.PDT_ID = PDT_ID;
	}

	public Map<Integer, Integer> getPDIG_AMOUNT() {
		return PDIG_AMOUNT;
	}

	public void setPDIG_AMOUNT(Map<Integer, Integer> PDIG_AMOUNT) {
		this.PDIG_AMOUNT = PDIG_AMOUNT;
	}

}
