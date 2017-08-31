package sickSa.mapper;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import sickSa.domain.OrderDetail;
import sickSa.domain.Order;

@Mapper
public interface OrderDao {

	int selectOrderSequence();

	List<Order> selectOrderList();

	List<Order> selectOrderListByDate(Map<String, String> dateMap);

	List<Order> selectOrderListByState(char ord_state);

	@Select("select ORD_DATE from ORDERS where ORD_ID = #{ord_id}")
	Date selectOrderDate(int ord_id);

	int insertOrder(Order order);

	int insertOrderDetail(OrderDetail orderDetail);

	int updateOrder(Order order);
}
