package sickSa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sickSa.domain.Order;
import sickSa.mapper.OrderDao;

@Service
public class OrderService {

	@Autowired
	private OrderDao orderDao;

	/* 결제 완료 - 레코드 생성 */
	public int createOrder(Order order) {
		return orderDao.insert(order);
	}

	/* 테이블 번호 수정 */
	public int updateByTblNo(Integer ord_no, Integer tbl_id) {
		Order tmpOrder = orderDao.selectOne(ord_no);
		tmpOrder.setTbl_id(tbl_id);
		return orderDao.update(tmpOrder);
	}
	/* find List by id */
	public Order getById(Integer ord_id){
		return orderDao.selectOne(ord_id);
	}
	/* 전체목록 불러오기 */
	public List<Order> getList(){
		return orderDao.selectList();
	}

	public OrderDao getOrderDao() {
		return orderDao;
	}

}
