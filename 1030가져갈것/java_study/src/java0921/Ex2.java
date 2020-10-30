package java0921;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Ex2 {

	public static void main(String[] args) {
		
		//insert할 값 
		String firstName = "순신";
		String lastName = "이";
		
		// DB접속정보
		String url = "jdbc:mysql://localhost:3306/sakila?useUnicode=true&characterEncoding=utf8&allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=Asia/Seoul";
		String dbId = "myid";
		String dbPwd = "mypwd";
		
		String sql = "";
		Connection con = null;
		PreparedStatement pstmt = null;
		
		//INSERT
		
		try {
			//1단계. DB드라이버 클래스 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2단계. DB에 연결 시도. 연결후 Connection객체를 리턴함.
			con = DriverManager.getConnection(url, dbId, dbPwd );//로그인 시도
			
			// sql문 준비
			sql="INSERT INTO actor (first_name, last_name,last_update) ";
			sql +="VALUES(?,?, now())";
			
			//3단계 sql문장객체 준비
			pstmt = con.prepareStatement(sql);
			//값 설정
			pstmt.setString(1,firstName);
			pstmt.setString(2,lastName);
			
			//sql문장실행
			int count = pstmt.executeUpdate();// INSERT,UPDATE,DELETE문장 실행시 호출
			System.out.println( count +"개 행이 추가됨.");
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
			
		}
		
		
		
		
		
		
		
	} // main

}
