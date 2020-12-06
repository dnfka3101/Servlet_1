package com.choa.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector {

	
	public Connection getConnect() throws Exception {
		
		String user="hr";
		String pw ="tiger";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		//2. driver를 메모리에 로딩(객체로 만드는 작업)
		Class.forName(driver);
		
		System.out.println("드라이버 로딩 성공");
		//3. DB로그인 Connection 객체 반환
		Connection con = DriverManager.getConnection(url,user,pw);
		
		return con;
		
		
	}
}
