package sickSa.domain;

import java.util.Map;


public class ProductIngredients {
	
	private int pdt_id;
	//Map<ING_ID,PDIG_AMOUNT>
	private Map<Integer, Integer> pdig_amount;
	
	public ProductIngredients() {}
	
	public ProductIngredients(int pdt_id, Map<Integer, Integer> pdig_amount) {
		super();
		this.pdt_id = pdt_id;
		this.pdig_amount = pdig_amount;
	}

	@Override
	public String toString() {
		return pdt_id+":"+pdig_amount;
	}

	public int getPdt_id() {
		return pdt_id;
	}

	public void setPdt_id(int pdt_id) {
		this.pdt_id = pdt_id;
	}

	public Map<Integer, Integer> getPdig_amount() {
		return pdig_amount;
	}

	public void setPdig_amount(Map<Integer, Integer> pdig_amount) {
		this.pdig_amount = pdig_amount;
	}
	
}
