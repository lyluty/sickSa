package sickSa.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sickSa.dao.QueueAwaiterDao;
import sickSa.dao.QueueLogDao;
import sickSa.domain.QueueAwaiter;
import sickSa.domain.QueueLog;

@Service("queueService")
public class QueueServiceImpl implements QueueService {
	
	@Autowired
	private QueueAwaiterDao queueAwaiterDao;
	private QueueLogDao queueLogDao;
	
	public void setQueueAwaiterDao(QueueAwaiterDao queueAwaiterDao) {
		this.queueAwaiterDao = queueAwaiterDao;
	}
	
	@Override
	public void queueUp(String contact) {
		QueueLog queueLog = new QueueLog();
		queueLog.setQlog_contact(contact);
		queueLogDao.insert(queueLog);
	}
	
	@Override
	public List<QueueAwaiter> getQueueAwaiterList() {
		return queueAwaiterDao.selectQueueAwaiterList();
	}

	@Override
	public QueueAwaiter getQueueAwaiterById(Integer qawtId) {
		return queueAwaiterDao.selectQueueAwaiterById(qawtId);
	}

	@Override
	public QueueAwaiter callAwaiter() {
		QueueAwaiter awaiter = queueAwaiterDao.selectNextAwaiter();
		if (awaiter != null) {
			// call()
			queueAwaiterDao.deleteQueueAwaiter(awaiter);
		}
		return awaiter;
	}
}
