package sickSa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sickSa.domain.Order;
import sickSa.mapper.OrderDao;
import sickSa.mapper.QueueLogDao;
import sickSa.mapper.StoreDataDao;

@Service
public class StoreService {

	/* Variable */
	@Autowired
	StoreDataDao storeDataDao;
	OrderDao orderDao;
	QueueLogDao queueLogDao; 
	
	/* Method */
	public boolean checkPin(String pin) {
		return pin == getAdminPin();
	}
	
	public String getAdminPin() {
		return storeDataDao.selectAdminPin();
	}
	
	public int getRest() {
		return storeDataDao.selectRest();
	}
	
	public int getWaiting() {
		return storeDataDao.selectWaiting();
	}
	
	public String setAdminPin(String adminPin) {
		return storeDataDao.updateAdminPin(adminPin);
	}
	
	public int setRest() {
		
		List<Order> cookList =orderDao.selectOrderListByState('B');
		List<Order> servingList = orderDao.selectOrderListByState('C');
		int[] cntList={};			

		for (Order cook : cookList) {
			for (int i = 0; i < cntList.length; i++) {
				if (cntList[i]== cook.getTbl_id()) {
					break;
				}else{
					cntList[i]=cook.getTbl_id();
				}
			}
			
			for (Order serving : servingList) {
				for (int i = 0; i < cntList.length; i++) {
					if (cntList[i]== serving.getTbl_id()) {
						break;
					}else{
						cntList[i]=serving.getTbl_id();
					}
				}
			}
		}		
		return storeDataDao.updateRest(cntList.length);
	}
	
	public int setWaiting() {
		return storeDataDao.updateWaiting(queueLogDao.selectList().size());
	}
}
