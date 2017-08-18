package sickSa.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import sickSa.domain.Table;

@Mapper
public interface TableDao {

	List<Table> selectList();

	int selectOne(int tbl_no);

	int insert(Table table);

	int update(Table table);

	int delete(int tbl_no);
}
