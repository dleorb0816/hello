package java0921;

import java.sql.*;

public class Ex3 {

	public static void main(String[] args) {

		// DB��������
		String url = "jdbc:mysql://localhost:3306/sakila?useUnicode=true&characterEncoding=utf8&allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=Asia/Seoul";
		String dbId = "myid";
		String dbPwd = "mypwd";
		
		
		// SELECT�� ���࿡ �ʿ��� JDBC��ü 3����
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		String sql="";
		//1�ܰ�
		try {
			//1�ܰ�. DB����̹� Ŭ���� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2�ܰ�. DB�� ���� �õ�. ������ Connection��ü�� ������.
			con = DriverManager.getConnection(url, dbId, dbPwd );//�α��� �õ�
			
			// 3�ܰ� SQL���尴ü �غ�
			sql ="SELECT * FROM actor WHERE first_name like '%B' ORDER BY actor_id DESC";
			pstmt = con.prepareStatement(sql);
			
			
			//select�� ������ select����� ResultSet���� ����.
			rs = pstmt.executeQuery();//SELECT�� ����� ȣ����.
			
			//4�ܰ�. ResultSet������ ������  ���
			while(rs.next()/*���������� ȭ��ǥ ��ü�� �ٸ��ٷ� �̵���Ű�� ����*/) {

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
