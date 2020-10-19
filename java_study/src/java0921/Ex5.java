package java0921;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex5 {

	public static void main(String[] args) {
	//DELETE�� �����ϱ�
		
		// DB��������
		String url = "jdbc:mysql://localhost:3306/sakila?useUnicode=true&characterEncoding=utf8&allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=Asia/Seoul";
		String dbId = "myid";
		String dbPwd = "mypwd";
		
		//delete�� ���� actorId
		int actorid = 203; //�������(where ����)
		
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
			sql="delete from actor ";
			sql +="where actor_id = ?";
			
			//3�ܰ� sql���尴ü �غ�
			pstmt = con.prepareStatement(sql);
			//�� ����			
			pstmt.setInt(1,actorid);
			
			//sql�������
			int count = pstmt.executeUpdate();// INSERT,UPDATE,DELETE���� ����� ȣ��
			
			System.out.println( count +"�� ���� ������.");
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
			
		}
	}//main
	
}
