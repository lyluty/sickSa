package sickSa.domain;

import java.util.Date;
import java.util.List;

public class Order {

	private int ord_id;
	private int ord_total;
	private String ord_payment_method;
	private Date ord_date;
	private int tbl_id;
	private List<OrderDetailVO> orderDetailVOList;

	public Order() {
	}

	public Order(int ord_id, int ord_total, String ord_payment_method, Date ord_date, int tbl_id,
	    List<OrderDetailVO> orderDetailVOList) {
		super();
		this.ord_id = ord_id;
		this.ord_total = ord_total;
		this.ord_payment_method = ord_payment_method;
		this.ord_date = ord_date;
		this.tbl_id = tbl_id;
		this.orderDetailVOList = orderDetailVOList;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("ord_id: ").append(ord_id).append("\n");
		sb.append("ord_total: ").append(ord_total).append("\n");
		sb.append("ord_payment_method: ").append(ord_payment_method).append("\n");
		sb.append("ord_date: ").append(ord_date).append("\n");
		sb.append("tbl_id: ").append(tbl_id).append("\n");
		sb.append("orderDetailVOList: ").append(orderDetailVOList).append("\n");
		return sb.toString();
	}

	public int getOrd_id() {
		return ord_id;
	}

	public void setOrd_id(int ord_id) {
		this.ord_id = ord_id;
	}

	public int getOrd_total() {
		return ord_total;
	}

	public void setOrd_total(int ord_total) {
		this.ord_total = ord_total;
	}

	public String getOrd_payment_method() {
		return ord_payment_method;
	}

	public void setOrd_payment_method(String ord_payment_method) {
		this.ord_payment_method = ord_payment_method;
	}

	public Date getOrd_date() {
		return ord_date;
	}

	public void setOrd_date(Date ord_date) {
		this.ord_date = ord_date;
	}

	public int getTbl_id() {
		return tbl_id;
	}

	public void setTbl_id(int tbl_id) {
		this.tbl_id = tbl_id;
	}

	public List<OrderDetailVO> getOrderDetailVOList() {
		return orderDetailVOList;
	}

	public void setOrderDetailVOList(List<OrderDetailVO> orderDetailVOList) {
		this.orderDetailVOList = orderDetailVOList;
	}

}
