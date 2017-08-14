package sickSa.dao;

import java.util.ArrayList;

import sickSa.domain.Orders;

public interface OrdersDao {

	ArrayList<Orders> getOrders();
	void insertOrders(Orders order);
	void updateOrders(Orders order);
	void deleteOrders(int ord_no);
}
