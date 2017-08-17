package sickSa.dao;

import java.util.List;

import sickSa.domain.Table;

public interface TableDao{
	
List<Table> getTables();
int selectTable(Table table);
int insertTable(Table table);
int updateTable(int tbl_no);
int deleteTable(int tbl_no);
		  
	
}
