package sickSa.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ProductIngredients {
	
	private int pdt_id;
	private int ing_id;
	private int pdig_amount;
	
	public ProductIngredients() {}

	public ProductIngredients(int pdt_id, int ing_id, int pdig_amount) {
		super();
		this.pdt_id = pdt_id;
		this.ing_id = ing_id;
		this.pdig_amount = pdig_amount;
	}
	
	@Override
	public String toString() {
		return pdt_id+":"+ing_id+":"+pdig_amount;
	}
	
	public int getPdt_id() {
		return pdt_id;
	}

	public void setPdt_id(int pdt_id) {
		this.pdt_id = pdt_id;
	}

	public int getIng_id() {
		return ing_id;
	}

	public void setIng_id(int ing_id) {
		this.ing_id = ing_id;
	}

	public int getPdig_amount() {
		return pdig_amount;
	}
	
	public void setPdig_amount(int pdig_amount) {
		this.pdig_amount = pdig_amount;
	}
}
