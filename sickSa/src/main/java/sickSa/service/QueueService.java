package sickSa.service;

import java.util.List;

import sickSa.domain.QueueAwaiter;

public interface QueueService {
	public void queueUp(String contact);
	public List<QueueAwaiter> getQueueAwaiterList();
	public QueueAwaiter getQueueAwaiterById(Integer qawtId);
	public QueueAwaiter callAwaiter();
//	public String selectContactById(Integer id);
	
	/*
	 * 대기자 리스트 조회
	 * 특정 대기자 찾기(번호, 연락처)
	 * 번호 가장 빠른사람 찾기
	 * 취소(대기번호 삭제)
	 * 대기번호 발급
	 */
}
