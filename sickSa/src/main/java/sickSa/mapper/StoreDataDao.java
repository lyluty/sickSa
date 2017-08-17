package sickSa.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StoreDataDao {

	public int selectAdminPin();

	public int selectRest();

	public int selectWaiting();

	public int updateAdminPin(int adminPin);

	public int updateRest(int rest);

	public int updateWaiting(int waiting);
}
