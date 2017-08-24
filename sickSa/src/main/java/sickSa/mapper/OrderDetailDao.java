package sickSa.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import sickSa.domain.OrderDetailVO;

@Repository
public interface OrderDetailDao {

	@Select("select * from ORDER_DETAILS")
	public List<OrderDetailVO> list();
}
