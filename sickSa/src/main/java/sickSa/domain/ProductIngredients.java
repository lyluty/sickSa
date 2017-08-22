package sickSa.domain;

import java.util.Map;


public class ProductIngredients {
	
	private int PDT_ID;
	//Map<ING_ID,PDIG_AMOUNT>
	private Map<Integer, Integer> PDIG_AMOUNTS;
	
	public ProductIngredients() {}
	
	public ProductIngredients(int PDT_ID, Map<Integer, Integer> PDIG_AMOUNT) {
		super();
		this.PDT_ID = PDT_ID;
		this.PDIG_AMOUNTS = PDIG_AMOUNT;
	}
	
	@Override
	public String toString() {
		return PDT_ID+":"+PDIG_AMOUNTS;
	}
	
	public int getPDT_ID() {
		return PDT_ID;
	}

	public void setPDT_ID(int PDT_ID) {
		this.PDT_ID = PDT_ID;
	}

	public Map<Integer, Integer> getPDIG_AMOUNT() {
		return PDIG_AMOUNTS;
	}

	public void setPDIG_AMOUNT(Map<Integer, Integer> PDIG_AMOUNT) {
		this.PDIG_AMOUNTS = PDIG_AMOUNT;
	}

}
