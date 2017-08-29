package sickSa.domain;

public class ProductCategory {

	private int pdct_id;
	private String pdct_name;

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("pdct_id: ").append(pdct_id).append("\n");
		sb.append("pdct_name: ").append(pdct_name).append("\n");
		return sb.toString();
	}

	public int getPdct_id() {
		return pdct_id;
	}

	public void setPdct_id(int pdct_id) {
		this.pdct_id = pdct_id;
	}

	public String getPdct_name() {
		return pdct_name;
	}

	public void setPdct_name(String pdct_name) {
		this.pdct_name = pdct_name;
	}
}
