package sickSa.dao;

import java.util.ArrayList;

import sickSa.domain.Tables;

public interface TablesDao{
	
ArrayList<Tables> getTables();
void insertTables(Tables table);
void updateTables(int tbl_no);
void deleteTables(int tbl_no);
		  
	
}
