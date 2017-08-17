package sickSa.dao;

import java.util.List;

import sickSa.domain.Order;

public interface OrderDao {

	List<Order> getOrders();
	int selectOrder(Order order);
	int insertOrder(Order order);
	int updateOrder(Order order);
	int deleteOrder(Order ord_no);
}
