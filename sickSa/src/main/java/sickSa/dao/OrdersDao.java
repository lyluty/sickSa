package sickSa.dao;

import java.util.List;

import sickSa.domain.Orders;

public interface OrdersDao {

	List<Orders> getOrders();
	void selectOrders(Orders order);
	void insertOrders(Orders order);
	void updateOrders(Orders order);
	void deleteOrders(Orders ord_no);
}
