package sickSa.service;

/*
 * 대기자 등록
 * 대기 취소
 * 대기자 호출
 * 입실
 * 퇴실
 */
public interface QueueService {
	public void queueUp(String qlog_contact);
	public void enter(Integer qlog_id);
	public void leave(Integer qlog_id);
	public void callAwaiter(Integer qlog_id);
}
