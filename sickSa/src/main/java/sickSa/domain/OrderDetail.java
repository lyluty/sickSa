package sickSa.domain;

public class OrderDetail {

	private int ord_id;
	private int ordt_amount;
	private int pdt_id;
	private char ordt_state;
	private Product product;

	public OrderDetail() {
	}

	public OrderDetail(Product product) {
		this.ordt_amount = 1;
		this.pdt_id = product.getPdt_id();
		this.product = product;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("ord_id: ").append(ord_id).append("\n");
		sb.append("ordt_amount: ").append(ordt_amount).append("\n");
		sb.append("pdt_id: ").append(pdt_id).append("\n");
		sb.append("ordt_state: ").append(ordt_state).append("\n");
		sb.append("product: ").append(product).append("\n");
		return sb.toString();
	}

	public int getOrd_id() {
		return ord_id;
	}

	public void setOrd_id(int ord_id) {
		this.ord_id = ord_id;
	}

	public int getOrdt_amount() {
		return ordt_amount;
	}

	public void setOrdt_amount(int ordt_amount) {
		this.ordt_amount = ordt_amount;
	}

	public int getPdt_id() {
		return pdt_id;
	}

	public void setPdt_id(int pdt_id) {
		this.pdt_id = pdt_id;
	}

	public char getOrdt_state() {
		return ordt_state;
	}

	public void setOrdt_state(char ordt_state) {
		this.ordt_state = ordt_state;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
}
