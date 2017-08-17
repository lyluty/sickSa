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
	public boolean checkPin(int pin) {
		return pin == getAdminPin();
	}
	
	public int getAdminPin() {
		return storeDataDao.selectAdminPin();
	}
	
	public int getRest() {
		return storeDataDao.selectRest();
	}
	
	public int getWaiting() {
		return storeDataDao.selectWaiting();
	}
	
	public int setAdminPin(int adminPin) {
		return storeDataDao.updateAdminPin(adminPin);
	}
	
	public int setRest(int rest) {
		return storeDataDao.updateRest(rest);
	}
	
	public int setWaiting(int waiting) {
		return storeDataDao.updateWaiting(waiting);
	}
}
