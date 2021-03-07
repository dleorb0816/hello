package db.ceans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.beans.DBConnection;

public class QueryCean {

	Connection conn;
	Statement stmt;
	ResultSet rs;
	
	public QueryCean()
	{
		conn = null;
		stmt = null;
		rs = null;
	}
	
	public void getConnection() {
		try {
			conn = DbConnection.getConnection();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void closeConnection()
	{
		if(stmt != null)
		{
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if (conn != null)
		{
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public int setUserInfo(String id, String name, String phone) {
		int result = 0;
		
		StringBuffer sb = new StringBuffer();
		PreparedStatement pstmt = null;
		
		sb.append(" INSERT INTO ");
		sb.append("		example (id, name, phone, reg_time) ") ;
		sb.append(" VALUES ");
		sb.append(" ('" + id + "' , '"+ name +"', '" + phone + "', now()) ");
		
		System.out.println(sb.toString());
		
		return result;
	}
	
	
}
