package sickSa.domain;

public class Product {

	private int pdt_id;
	private String pdt_name;
	private int pdt_price;
	private String pdt_imgsrc_l;
	private String pdt_imgsrc_s;
	private String pdt_description;
	private int pdct_id;

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("pdt_id: ").append(pdt_id).append("\n");
		sb.append("pdt_name: ").append(pdt_name).append("\n");
		sb.append("pdt_price: ").append(pdt_price).append("\n");
		sb.append("pdt_imgsrc_l: ").append(pdt_imgsrc_l).append("\n");
		sb.append("pdt_imgsrc_s: ").append(pdt_imgsrc_s).append("\n");
		sb.append("pdt_description: ").append(pdt_description).append("\n");
		sb.append("pdct_id: ").append(pdct_id).append("\n");
		return sb.toString();
	}

	public int getPdt_id() {
		return pdt_id;
	}

	public void setPdt_id(int pdt_id) {
		this.pdt_id = pdt_id;
	}

	public String getPdt_name() {
		return pdt_name;
	}

	public void setPdt_name(String pdt_name) {
		this.pdt_name = pdt_name;
	}

	public int getPdt_price() {
		return pdt_price;
	}

	public void setPdt_price(int pdt_price) {
		this.pdt_price = pdt_price;
	}

	public String getPdt_imgsrc_l() {
		return pdt_imgsrc_l;
	}

	public void setPdt_imgsrc_l(String pdt_imgsrc_l) {
		this.pdt_imgsrc_l = pdt_imgsrc_l;
	}

	public String getPdt_imgsrc_s() {
		return pdt_imgsrc_s;
	}

	public void setPdt_imgsrc_s(String pdt_imgsrc_s) {
		this.pdt_imgsrc_s = pdt_imgsrc_s;
	}

	public String getPdt_description() {
		return pdt_description;
	}

	public void setPdt_description(String pdt_description) {
		this.pdt_description = pdt_description;
	}

	public int getPdct_id() {
		return pdct_id;
	}

	public void setPdct_id(int pdct_id) {
		this.pdct_id = pdct_id;
	}
}
