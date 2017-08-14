package sickSa.dao;

import java.util.List;

import sickSa.domain.Tables;

public interface TablesDao{
	
List<Tables> getTables();
void selectTables(Tables table);
void insertTables(Tables table);
void updateTables(int tbl_no);
void deleteTables(int tbl_no);
		  
	
}
