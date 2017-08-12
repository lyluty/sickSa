package sickSa.domain;

public class Tables {

	private int tbl_no;
	private char tbl_isEmpty;
	
	
	public Tables(){
	
	}
	
	// Getter / Setter
	
	public Tables(int tbl_no,char tbl_isEmpty){
		this.tbl_no=tbl_no;
		this.tbl_isEmpty=tbl_isEmpty;
	}

	public int getTbl_no() {
		return tbl_no;
	}

	public void setTbl_no(int tbl_no) {
		this.tbl_no = tbl_no;
	}

	public char getTbl_isEmpty() {
		return tbl_isEmpty;
	}

	public void setTbl_isEmpty(char tbl_isEmpty) {
		this.tbl_isEmpty = tbl_isEmpty;
	}
	
	// Show toString
	
	@Override
	public  String toString(){
		
		return tbl_no+"\t/\t"+tbl_isEmpty;
	}
	
	
}
