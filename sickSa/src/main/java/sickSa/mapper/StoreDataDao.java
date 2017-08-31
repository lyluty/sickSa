package sickSa.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StoreDataDao {

	public String selectAdminPin();

	public int selectRest();

	public int selectWaiting();
	
	public int selectCapacity();

	public String updateAdminPin(String adminPin);

	public int updateRest(int rest);

	public int updateWaiting(int waiting);
}
