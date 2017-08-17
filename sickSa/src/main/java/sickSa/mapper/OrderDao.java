package sickSa.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import sickSa.domain.Order;

@Mapper
public interface OrderDao {

	List<Order> selectList();

	Order selectOne(int ord_id);

	int insert(Order order);

	int update(Order order);

	int delete(int ord_id);
}
