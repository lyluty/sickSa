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
		int[] cntList={0,};			

		for (Order cook : cookList) {
			int index=0;
			for (int i = 0; i < cntList.length; i++) {
				if(cook.getTbl_id()==0){
					break;
				}
				else if (cntList[i]== cook.getTbl_id()) {
					break;
				}else{
					cntList[index]=cook.getTbl_id();
					index++;
				}
			}
			System.out.println("cook: "+index);
		}
			
			for (Order serving : servingList) {
				int index=0;
				for (int i = 0; i < cntList.length; i++) {
					if(serving.getTbl_id()==0){
						break;
					}
					else if (cntList[i]== serving.getTbl_id()) {
						break;
					}else{
						cntList[index]=serving.getTbl_id();
						index++;
					}
				}
				System.out.println("serv: "+index);
			}
		int capacity=storeDataDao.selectCapacity();
			
		return storeDataDao.updateRest(capacity-cntList.length);
	}
	// Progress / 
	public int setWaiting() {
		return storeDataDao.updateWaiting(queueLogDao.selectList().size());
	}
	
	
	
}
