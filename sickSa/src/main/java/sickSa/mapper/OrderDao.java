package sickSa.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import sickSa.domain.Order;
import sickSa.domain.OrderVO;

@Mapper
public interface OrderDao {

	List<Order> selectList();
	
	List<OrderVO> selectListByDate(Map<String, String> dateMap);
	
	List<OrderVO> selectListByState(char ord_state);

	Order selectOne(int ord_id);

	int insert(Order order);

	int update(Order order);

	int delete(int ord_id);
	
	List<OrderVO> list();
}
