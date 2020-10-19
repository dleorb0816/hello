
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class BookList 
{
	//
	Book book1_arr[];
	
	//1.�������
	Connection con=null; // �������
	Statement stmt;
	ResultSet rs;
	
	//2.������ - �뵵: �迭 �ʱ�ȭ
	public BookList()
	{
		book1_arr = new Book[11];
		
		for(int i=0; i<book1_arr.length; ++i)
		{
			book1_arr[i] = new Book();
		}
	}

	//3.�޼ҵ� - ����(Connetcion)�� ���´�
	public void getCon() 
	{
		//url�� ���� ���ڿ��̴�! 
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "madang"; // c##�߰�
		String pwd = "madang"; // c##�߰�

		//1.����̹� �ε带 ���� (���� �ȿ� Ŭ���� ����Ʈ)
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		//2.DB ���� (����Ŭ)
		try {
			System.out.println("�����ͺ��̽� ���� �غ� .....");
			//1.db ����
			con = DriverManager.getConnection(url, userid, pwd);
			System.out.println("�����ͺ��̽� ���� ����");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	//3.�޼ҵ�1
	public void selectBookList() 
	{
		String query = "SELECT * FROM book";
		try {
			stmt = con.createStatement(); // 2
			rs = stmt.executeQuery(query); // 3
			System.out.println("BOOK ID \tBOOK NAME \t\tPUBLISHER \t\t\tPRICE");
			
			int index=0;
			while (rs.next()) 
			{
				//�갴ü�迭
				book1_arr[index].setBookid(rs.getInt(1));
				book1_arr[index].setBookname(rs.getString(2));
				book1_arr[index].setPublisher(rs.getString(3));
				book1_arr[index].setPrice(rs.getInt(4));
				index++;
			}
			
//			con.close();//db������ ����!
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

		public void closeDB()
		{
			try {
				con.close();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}


}
