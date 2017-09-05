package sickSa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sickSa.domain.Table;
import sickSa.mapper.TableDao;

@Service
public class TestService {

	@Autowired
	TableDao tableDao;
	
	public void test(int tableNo) {
		Table table = tableDao.selectTable(tableNo);
		table.setTbl_is_empty("TRUE");
		tableDao.updateTable(table);
	}
}
