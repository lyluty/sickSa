package sickSa.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import sickSa.domain.Table;

@Mapper
public interface TableDao {

	@Select("select * from TABLES")
	List<Table> selectTableList();

	@Select("select count(*) from TABLES where TBL_IS_EMPTY = 'TRUE'")
	int selectRestTableCount();
	
	@Select("select * from TABLES where TBL_ID = #{tbl_id}")
	Table selectTable(int tbl_id);
	
	@Update("update TABLES set TBL_IS_EMPTY = #{tbl_is_empty} where TBL_ID = #{tbl_id}")
	int updateTable(Table table);
}
