package sickSa.service;

import org.springframework.stereotype.Service;

import sickSa.dao.QueueAwaiterDao;
import sickSa.dao.QueueLogDao;
import sickSa.domain.QueueAwaiter;
import sickSa.domain.QueueLog;

@Service("queueService")
public class QueueServiceImpl implements QueueService {
	
	private QueueAwaiterDao queueAwaiterDao;
	private QueueLogDao queueLogDao;
	
	public void setQueueAwaiterDao(QueueAwaiterDao queueAwaiterDao) {
		this.queueAwaiterDao = queueAwaiterDao;
	}
	
	@Override
	public void queueUp(String qlog_contact) {
		QueueLog queueLog = new QueueLog();
		queueLog.setQlog_contact(qlog_contact);
		queueLog.setQlst_code(QueueLog.STATE_PROGRESS);
		queueLogDao.insertQueueLog(queueLog);
	}
	
	@Override
	public void enter(Integer qlog_id) {
		QueueLog queueLog = queueLogDao.selectQueueLog(qlog_id);
		queueLog.setQlst_code(QueueLog.STATE_COMPLETE);
		queueLogDao.updateQueueLog(queueLog);
	}
	
	@Override
	public void leave(Integer qlog_id) {
	}
	
//	@Override
//	public List<QueueAwaiter> getQueueAwaiterList() {
//		return queueAwaiterDao.selectQueueAwaiterList();
//	}
//
//	@Override
//	public QueueAwaiter getQueueAwaiterById(Integer qawtId) {
//		return queueAwaiterDao.selectQueueAwaiterById(qawtId);
//	}

	@Override
	public QueueAwaiter callAwaiter() {
		QueueAwaiter awaiter = queueAwaiterDao.selectNextAwaiter();
		if (awaiter != null) {
			// call()
			queueAwaiterDao.deleteQueueAwaiter(awaiter);
		}
		return awaiter;
	}

	public void setQueueLogDao(QueueLogDao queueLogDao) {
		System.out.println("QueueLogDao Setter");
		this.queueLogDao = queueLogDao;
	}

}
