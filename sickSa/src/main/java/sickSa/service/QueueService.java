package sickSa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sickSa.domain.QueueLog;
import sickSa.mapper.QueueLogDao;

@Service
public class QueueService {

	@Autowired
	private QueueLogDao queueLogDao;
	
	public List<QueueLog> list() {
		return queueLogDao.selectList();
	}
	
	public QueueLog get(int qlog_id) {
		return queueLogDao.selectOne(qlog_id);
	}
	
	public int add(QueueLog queueLog) {
		return queueLogDao.insert(queueLog);
	}
	
	public int set(QueueLog queueLog) {
		return queueLogDao.update(queueLog);
	}
	
	public int delete(int qlog_id) {
		return queueLogDao.delete(qlog_id);
	}

	public void queueUp(String qlog_contact) {
		QueueLog queueLog = new QueueLog();
		queueLog.setQlog_contact(qlog_contact);
		queueLog.setQlst_code(QueueLog.STATE_PROGRESS);
		queueLogDao.insert(queueLog);
	}

	public void enter(Integer qlog_id) {
		QueueLog queueLog = queueLogDao.selectOne(qlog_id);
		queueLog.setQlst_code(QueueLog.STATE_COMPLETE);
		queueLogDao.update(queueLog);
	}

	public void leave(Integer qlog_id) {
		// QueueLog queueLog = queueLogDao.selectQueueLog(qlog_id);
		// queueLog.setQlst_code(QueueLog.STATE_LEAVE);
		// queueLogDao.updateQueueLog(queueLog);
	}

	public void callAwaiter(Integer qlog_id) {
		QueueLog queueLog = queueLogDao.selectOne(qlog_id);
		if (queueLog == null)
			return;

		// call()
	}

	/* Getter, Setter */
	public QueueLogDao getQueueLogDao() {
		return queueLogDao;
	}
}
