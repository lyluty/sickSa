package sickSa.service;

import org.springframework.stereotype.Service;

import sickSa.dao.QueueAwaiterDao;
import sickSa.dao.QueueLogDao;
import sickSa.domain.QueueLog;

@Service("queueService")
public class QueueServiceImpl implements QueueService {

	private QueueAwaiterDao queueAwaiterDao;
	private QueueLogDao queueLogDao;

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
		// QueueLog queueLog = queueLogDao.selectQueueLog(qlog_id);
		// queueLog.setQlst_code(QueueLog.STATE_LEAVE);
		// queueLogDao.updateQueueLog(queueLog);
	}

	@Override
	public void callAwaiter(Integer qlog_id) {
		QueueLog queueLog = queueLogDao.selectQueueLog(qlog_id);
		if (queueLog == null)
			return;
		
		// call()
	}

	public void setQueueAwaiterDao(QueueAwaiterDao queueAwaiterDao) {
		this.queueAwaiterDao = queueAwaiterDao;
	}

	public void setQueueLogDao(QueueLogDao queueLogDao) {
		this.queueLogDao = queueLogDao;
	}
}
