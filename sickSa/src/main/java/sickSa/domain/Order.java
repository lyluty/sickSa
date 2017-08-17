package sickSa.domain;
import java.sql.Date;

public class Order {
	
	private int ord_id;
	private int pdt_id;	
	private int ord_pdtAmount;
	private int ord_total;
	private String ord_paymentMethod;
	private  Date ord_date;
	private char ord_state;
	private int tbl_id;

	
	
	public Order(){
		
	}
	
public Order(int ord_id, int pdt_id, int ord_pdtAmount, int ord_total, String ord_paymentMethod, Date ord_date,  char ord_state, int tbl_id){
		
	this.ord_id=ord_id;
	this.pdt_id=pdt_id;
	this.ord_pdtAmount=ord_pdtAmount;
	this.ord_total=ord_total;
	this.ord_paymentMethod=ord_paymentMethod;
	this.ord_date=ord_date;
	this.ord_state=ord_state;
	this.tbl_id=tbl_id;		
	
	}

// Getter / Setter

public int getOrd_id() {
	return ord_id;
}

public void setOrd_id(int ord_id) {
	this.ord_id = ord_id;
}

public int getPdt_id() {
	return pdt_id;
}

public void setPdt_id(int pdt_id) {
	this.pdt_id = pdt_id;
}

public int getOrd_pdtAmount() {
	return ord_pdtAmount;
}

public void setOrd_pdtAmount(int ord_pdtAmount) {
	this.ord_pdtAmount = ord_pdtAmount;
}

public int getOrd_total() {
	return ord_total;
}

public void setOrd_total(int ord_total) {
	this.ord_total = ord_total;
}

public String getOrd_paymentMethod() {
	return ord_paymentMethod;
}

public void setOrd_paymentMethod(String ord_paymentMethod) {
	this.ord_paymentMethod = ord_paymentMethod;
}

public Date getOrd_date() {
	return ord_date;
}

public void setOrd_date(Date ord_date) {
	this.ord_date = ord_date;
}

public char getOrd_state() {
	return ord_state;
}

public void setOrd_state(char ord_state) {
	this.ord_state = ord_state;
}

public int getTbl_id() {
	return tbl_id;
}

public void setTbl_id(int tbl_id) {
	this.tbl_id = tbl_id;
}

// Show toString

@Override

public String toString(){
	
	return  ord_id + "\t/\t" + pdt_id+ "\t/\t" +ord_pdtAmount+ "\t/\t" + ord_total+ "\t/\t" + ord_paymentMethod+ "\t/\t" + ord_date+ "\t/\t" + ord_state+ "\t/\t" + tbl_id; 
	
}
	
}