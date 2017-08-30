package sickSa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sickSa.mapper.StoreDataDao;

@Service
public class StoreService {

	/* Variable */
	@Autowired
	StoreDataDao storeDataDao;
	
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
	
	public int setRest(int rest) {
		return storeDataDao.updateRest(rest);
	}
	
	public int setWaiting(int waiting) {
		return storeDataDao.updateWaiting(waiting);
	}
}
