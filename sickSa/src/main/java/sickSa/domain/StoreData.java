package sickSa.domain;

public class StoreData {

	private int stdt_adminPin;
	private int stdt_capacity;
	private int stdt_rest;
	private int stdt_waiting;
	
	public StoreData(){
		
	}
	public StoreData(int stdt_adminPin,int stdt_capacity,int stdt_rest,int stdt_waiting){
		
			this.stdt_adminPin=stdt_adminPin;
			this.stdt_capacity=stdt_capacity;
			this.stdt_rest=stdt_rest;
			this.stdt_waiting=stdt_waiting;
		
	}
	
	
	public int getStdt_adminPin() {
		return stdt_adminPin;
	}
	public void setStdt_adminPin(int stdt_adminPin) {
		this.stdt_adminPin = stdt_adminPin;
	}
	public int getStdt_capacity() {
		return stdt_capacity;
	}
	public void setStdt_capacity(int stdt_capacity) {
		this.stdt_capacity = stdt_capacity;
	}
	public int getStdt_rest() {
		return stdt_rest;
	}
	public void setStdt_rest(int stdt_rest) {
		this.stdt_rest = stdt_rest;
	}
	public int getStdt_waiting() {
		return stdt_waiting;
	}
	public void setStdt_waiting(int stdt_waiting) {
		this.stdt_waiting = stdt_waiting;
	}
	
}
