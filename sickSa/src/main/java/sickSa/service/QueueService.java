package sickSa.service;

public interface QueueService {
	public void queueUp(String qlog_contact);
	public void enter(Integer qlog_id);
	public void leave(Integer qlog_id);
	public void callAwaiter(Integer qlog_id);
	
	/*
	 * 대기자 리스트 조회
	 * 특정 대기자 찾기(번호, 연락처)
	 * 번호 가장 빠른사람 찾기
	 * 취소(대기번호 삭제)
	 * 대기번호 발급
	 */
}
