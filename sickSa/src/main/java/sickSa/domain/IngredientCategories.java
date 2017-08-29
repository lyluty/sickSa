package sickSa.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class IngredientCategories {
	private int igct_id;
	private String igct_name;
	
	public IngredientCategories() {
		// TODO Auto-generated constructor stub
	}
	
	public IngredientCategories(int igct_id, String igct_name) {
		super();
		this.igct_id = igct_id;
		this.igct_name = igct_name;
	}

	@Override
	public String toString() {
		return igct_id+":"+igct_name;
	}

	public int getIgct_id() {
		return igct_id;
	}

	public void setIgct_id(int igct_id) {
		this.igct_id = igct_id;
	}

	public String getIgct_name() {
		return igct_name;
	}

	public void setIgct_name(String igct_name) {
		this.igct_name = igct_name;
	}
	
}
