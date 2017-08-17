package sickSa.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import sickSa.domain.Table;

public class TableDaoImpl implements TableDao{

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<Table> getTables() {
	return sqlSession.selectList("getTables");
	}
	
	@Override
	public int selectTable(Table table) {
	return sqlSession.selectOne("selectTable");
	}

	@Override
	public int insertTable(Table table) {
		return sqlSession.insert("insertTable",table);
	}

	@Override
	public int updateTable(int tbl_no) {
		return sqlSession.update("updateTable");
		
	}

	@Override
	public int deleteTable(int tbl_no) {
		return sqlSession.delete("deleteTable",tbl_no);
	}
	
}
