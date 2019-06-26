package com.iu.notice;

public class NoticeService {

	private NoticeDAO noticeDAO;
	
	public NoticeService() {
		noticeDAO = new NoticeDAO(); 
		// 의존성 주입(Dependency Injection=DI)
		//IOC =Inversion of Control =제ㅔ어의 역전
	}
	
	public int insert() throws Exception {
		noticeDAO.insert();
		return 0;
	}
}
