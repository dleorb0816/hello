
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class BookList 
{
	//
	Book book1_arr[];
	
	//1.멤버변수
	Connection con=null; // 멤버변수
	Statement stmt;
	ResultSet rs;
	
	//2.생성자 - 용도: 배열 초기화
	public BookList()
	{
		book1_arr = new Book[11];
		
		for(int i=0; i<book1_arr.length; ++i)
		{
			book1_arr[i] = new Book();
		}
	}

	//3.메소드 - 연결(Connetcion)을 얻어온다
	public void getCon() 
	{
		//url은 연결 문자열이다! 
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "madang"; // c##추가
		String pwd = "madang"; // c##추가

		//1.드라이버 로드를 위한 (파일 안에 클래스 임포트)
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		//2.DB 연결 (오라클)
		try {
			System.out.println("데이터베이스 연결 준비 .....");
			//1.db 연결
			con = DriverManager.getConnection(url, userid, pwd);
			System.out.println("데이터베이스 연결 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	//3.메소드1
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
				//④객체배열
				book1_arr[index].setBookid(rs.getInt(1));
				book1_arr[index].setBookname(rs.getString(2));
				book1_arr[index].setPublisher(rs.getString(3));
				book1_arr[index].setPrice(rs.getInt(4));
				index++;
			}
			
//			con.close();//db연결을 닫음!
			
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
