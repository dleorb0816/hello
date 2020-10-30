package java0921;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Ex2 {

	public static void main(String[] args) {
		
		//insert�� �� 
		String firstName = "����";
		String lastName = "��";
		
		// DB��������
		String url = "jdbc:mysql://localhost:3306/sakila?useUnicode=true&characterEncoding=utf8&allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=Asia/Seoul";
		String dbId = "myid";
		String dbPwd = "mypwd";
		
		String sql = "";
		Connection con = null;
		PreparedStatement pstmt = null;
		
		//INSERT
		
		try {
			//1�ܰ�. DB����̹� Ŭ���� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2�ܰ�. DB�� ���� �õ�. ������ Connection��ü�� ������.
			con = DriverManager.getConnection(url, dbId, dbPwd );//�α��� �õ�
			
			// sql�� �غ�
			sql="INSERT INTO actor (first_name, last_name,last_update) ";
			sql +="VALUES(?,?, now())";
			
			//3�ܰ� sql���尴ü �غ�
			pstmt = con.prepareStatement(sql);
			//�� ����
			pstmt.setString(1,firstName);
			pstmt.setString(2,lastName);
			
			//sql�������
			int count = pstmt.executeUpdate();// INSERT,UPDATE,DELETE���� ����� ȣ��
			System.out.println( count +"�� ���� �߰���.");
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
			
		}
		
		
		
		
		
		
		
	} // main

}
