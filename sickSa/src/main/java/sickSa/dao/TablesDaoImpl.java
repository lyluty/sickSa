package sickSa.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import sickSa.domain.Tables;

public class TablesDaoImpl implements TablesDao{

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<Tables> getTables() {
	return sqlSession.selectList("getTables");
	}
	
	@Override
	public void selectTables(Tables table) {
	sqlSession.selectOne("selectTables");
	}

	@Override
	public void insertTables(Tables table) {
		sqlSession.insert("insert",table);
	}

	@Override
	public void updateTables(int tbl_no) {
		sqlSession.update("updateTables");
		
	}

	@Override
	public void deleteTables(int tbl_no) {
		sqlSession.delete("deleteTables",tbl_no);
	}
	
}
