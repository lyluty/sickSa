package sickSa.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class IngredientCategories {
	private int IGCT_ID;
	private String IGCT_NAME;
	
	public IngredientCategories() {
		// TODO Auto-generated constructor stub
	}
	
	public IngredientCategories(int IGCT_ID, String IGCT_NAME) {
		super();
		this.IGCT_ID = IGCT_ID;
		this.IGCT_NAME = IGCT_NAME;
	}
	
	@Override
	public String toString() {
		return IGCT_ID+":"+IGCT_NAME;
	}

	public int getIgct_id() {
		return IGCT_ID;
	}

	public void setIgct_id(int IGCT_ID) {
		this.IGCT_ID = IGCT_ID;
	}

	public String getIgct_name() {
		return IGCT_NAME;
	}

	public void setIgct_name(String IGCT_NAME) {
		this.IGCT_NAME = IGCT_NAME;
	}
	
}
