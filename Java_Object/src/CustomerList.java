
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class CustomerList {

	Customer customer1_arr[];
	
	// 1.�������
	Connection con = null; // �������
	Statement stmt;
	ResultSet rs;

	// �갴ü�迭


	public CustomerList() {
		// 4�� ��ü�迭�� �ʱ�ȭ
		customer1_arr = new Customer[5];

		for (int i = 0; i < customer1_arr.length; i++) {
			customer1_arr[i] = new Customer(); // customer1_arr�� �迭 ���̸�ŭ Customer��ü�� ������
		}
	}

	// 3.�޼ҵ� - ����(Connetcion)�� ���´�
	public void getCon() {
		// url�� ���� ���ڿ��̴�!
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "madang"; // c##�߰�
		String pwd = "madang"; // c##�߰�

		// 1.����̹� �ε带 ���� (���� �ȿ� Ŭ���� ����Ʈ)
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// 2.DB ���� (����Ŭ)
		try {
			System.out.println("�����ͺ��̽� ���� �غ� .....");
			// 1.db ����
			con = DriverManager.getConnection(url, userid, pwd);
			System.out.println("�����ͺ��̽� ���� ����");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	// 3.�޼ҵ�1
	public void selectCustomerList() {
		String query = "SELECT * FROM customer";
		try {
			stmt = con.createStatement(); // 2
			rs = stmt.executeQuery(query); // 3
			System.out.println("�� ���̵� \t ���̸� \t�ּ� \t\t��ȭ��ȣ");

			int index = 0;
			while (rs.next()) {
				// 4��ü �迭
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
