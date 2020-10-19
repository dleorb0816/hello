
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class CustomerList {

	Customer customer1_arr[];
	
	// 1.멤버변수
	Connection con = null; // 멤버변수
	Statement stmt;
	ResultSet rs;

	// ④객체배열


	public CustomerList() {
		// 4번 객체배열용 초기화
		customer1_arr = new Customer[5];

		for (int i = 0; i < customer1_arr.length; i++) {
			customer1_arr[i] = new Customer(); // customer1_arr의 배열 길이만큼 Customer객체를 만들어라
		}
	}

	// 3.메소드 - 연결(Connetcion)을 얻어온다
	public void getCon() {
		// url은 연결 문자열이다!
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "madang"; // c##추가
		String pwd = "madang"; // c##추가

		// 1.드라이버 로드를 위한 (파일 안에 클래스 임포트)
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// 2.DB 연결 (오라클)
		try {
			System.out.println("데이터베이스 연결 준비 .....");
			// 1.db 연결
			con = DriverManager.getConnection(url, userid, pwd);
			System.out.println("데이터베이스 연결 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	// 3.메소드1
	public void selectCustomerList() {
		String query = "SELECT * FROM customer";
		try {
			stmt = con.createStatement(); // 2
			rs = stmt.executeQuery(query); // 3
			System.out.println("고객 아이디 \t 고객이름 \t주소 \t\t전화번호");

			int index = 0;
			while (rs.next()) {
				// 4객체 배열
				customer1_arr[index].setCustid(rs.getInt(1));
				customer1_arr[index].setname(rs.getString(2));
				customer1_arr[index].setAddress(rs.getString(3));
				customer1_arr[index].setPhone(rs.getString(4));
				index++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void closeDB() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
