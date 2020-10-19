package java0921;

import java.sql.*;

public class Ex3 {

	public static void main(String[] args) {

		// DB접속정보
		String url = "jdbc:mysql://localhost:3306/sakila?useUnicode=true&characterEncoding=utf8&allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=Asia/Seoul";
		String dbId = "myid";
		String dbPwd = "mypwd";
		
		
		// SELECT문 실행에 필요한 JDBC객체 3가지
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		String sql="";
		//1단계
		try {
			//1단계. DB드라이버 클래스 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2단계. DB에 연결 시도. 연결후 Connection객체를 리턴함.
			con = DriverManager.getConnection(url, dbId, dbPwd );//로그인 시도
			
			// 3단계 SQL문장객체 준비
			sql ="SELECT * FROM actor WHERE first_name like '%B' ORDER BY actor_id DESC";
			pstmt = con.prepareStatement(sql);
			
			
			//select문 실행후 select결과를 ResultSet으로 받음.
			rs = pstmt.executeQuery();//SELECT문 수행시 호출함.
			
			//4단계. ResultSet데이터 꺼내서  사용
			while(rs.next()/*내부적으로 화살표 객체를 다름줄로 이동시키는 역할*/) {

				int actorId = rs.getInt("actor_id");
				String firtstname= rs.getString("first_name");
				String lastname= rs.getString("last_name");
				Timestamp lastUpdate = rs.getTimestamp("last_update");
				
				System.out.print(actorId + "\t");
				System.out.print(firtstname + "\t");
				System.out.print(lastname + "\t");
				System.out.println(lastUpdate );
			}//while
		
			
		} catch(Exception e) {
			e.printStackTrace();
			
		}	
	
	}// main

}
