package com.iu.notice;

import java.sql.Connection;

import com.iu.util.DBConnector;

public class NoticeDAO {

	private DBConnector dbConnector;
	
	public NoticeDAO() {
		dbConnector = new DBConnector();
	}
	
	public int insert() throws Exception {
		Connection con = dbConnector.getConnect();
		System.out.println(con);
		return 0;
	}
	
	public static void main(String[] args) {
		try {
			new NoticeDAO().insert();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
}
