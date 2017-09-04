package sickSa.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import sickSa.domain.Table;

@Mapper
public interface TableDao {

    @Select("select * from TABLES")
	List<Table> selectList();
    
    @Select("select count(*) from tables where tbl_is_empty = 'TRUE'")
    int selectRestTableCount();

	int selectOne(int tbl_no);

	int insert(Table table);

	int update(Table table);

	int delete(int tbl_no);
}
