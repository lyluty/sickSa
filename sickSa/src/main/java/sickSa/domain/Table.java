package sickSa.domain;

public class Table {

	private  int tbl_id;
	private char tbl_isEmpty;
	
	
	public Table(){
		
	}
	
  public Table(int tbl_id, char tbl_isEmpty){
		this.tbl_id=tbl_id;
		this.tbl_isEmpty=tbl_isEmpty;
	}

public int getTbl_id() {
	return tbl_id;
}

public void setTbl_id(int tbl_id) {
	this.tbl_id = tbl_id;
}

public char getTbl_isEmpty() {
	return tbl_isEmpty;
}

public void setTbl_isEmpty(char tbl_isEmpty) {
	this.tbl_isEmpty = tbl_isEmpty;
}
	
  @Override
  
  public String toString(){
	  return tbl_id+"\t/+\t"+tbl_isEmpty;
	  
  }
  
}
