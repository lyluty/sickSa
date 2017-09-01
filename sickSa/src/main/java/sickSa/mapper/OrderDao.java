package sickSa.mapper;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import sickSa.domain.Order;
import sickSa.domain.OrderDetail;

@Mapper
public interface OrderDao {

	int selectOrderSequence();

	List<Order> selectOrderList();

	List<Order> selectOrderListByDate(Map<String, String> dateMap);

	List<Order> selectOrderListByState(char ord_state);

	@Select("select ORD_DATE from ORDERS where ORD_ID = #{ord_id}")
	Date selectOrderDate(int ord_id);
	
	Order selectOrderById(int ord_id);

	int insertOrder(Order order);

	int insertOrderDetail(OrderDetail orderDetail);

	int updateOrder(Order order);
	
	@Update("update ORDER_DETAILS set ORDT_AMOUNT = #{ordt_amount}, ORDT_STATE = #{ordt_state} where ORD_ID = #{ord_id} and PDT_ID = #{pdt_id}")
	int updateOrderDetail(OrderDetail orderDetail);
	
	List<Map<String, Object>> selectOrderMapListBySalesVolume();
	
	List<Order> selectOrderListByProductId(int productId);
}
