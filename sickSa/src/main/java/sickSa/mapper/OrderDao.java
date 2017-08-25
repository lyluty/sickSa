package sickSa.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import sickSa.domain.Order;
import sickSa.domain.OrderDetailVO;
import sickSa.domain.OrderVO;

@Mapper
public interface OrderDao {

	List<Order> selectOrderList();

	List<OrderVO> selectOrderListByDate(Map<String, String> dateMap);

	List<OrderVO> selectOrderListByState(char ord_state);

	int insertOrder(OrderVO order);

	int insertOrderDetail(OrderDetailVO orderDetail);

	int updateOrder(OrderVO order);
	//
	// int delete(int ord_id);
}
