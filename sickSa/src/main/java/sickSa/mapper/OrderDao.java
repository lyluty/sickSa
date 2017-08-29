package sickSa.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import sickSa.domain.OrderDetail;
import sickSa.domain.Order;

@Mapper
public interface OrderDao {

	List<Order> selectOrderList();

	List<Order> selectOrderListByDate(Map<String, String> dateMap);

	List<Order> selectOrderListByState(char ord_state);

	int insertOrder(Order order);

	int insertOrderDetail(OrderDetail orderDetail);

	int updateOrder(Order order);
	
	int selectOrderSequence();
	//
	// int delete(int ord_id);
}
