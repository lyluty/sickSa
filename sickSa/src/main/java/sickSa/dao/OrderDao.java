package sickSa.dao;

import java.util.List;

import sickSa.domain.Order;

public interface OrderDao {

	List<Order> getOrders();
	Order selectOrder(Integer ord_no);
	int insertOrder(Order order);
	int updateOrder(Order order);
	int deleteOrder(Integer ord_no);
}
