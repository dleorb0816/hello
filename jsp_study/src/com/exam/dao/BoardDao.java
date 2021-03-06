package com.exam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.exam.vo.BoardVo;

public class BoardDao {
	// 싱글톤
	private static BoardDao instance = new BoardDao();

	public static BoardDao getInstance() {
		return instance;
	}
	/////////////

	private BoardDao() {
	}

	private Connection getConnection() throws Exception {
		// 헤로쿠 MySQL DB
		// mysql://bec477009e8b36:112f7808@us-cdbr-east-02.cleardb.com/heroku_2a9d67c8b09e7af?reconnect=true&useUnicode=true&characterEncoding=utf8&allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=Asia/Seoul

		// 헤로쿠DB id : bec477009e8b36
		// 헤로쿠DB pw : 112f7808
		// 헤로쿠DB hostname : us-cdbr-east-02.cleardb.com
		// 헤로쿠DB 스키마이름 : heroku_2a9d67c8b09e7af

		// DB접속정보
		String dbUrl = "jdbc:mysql://localhost:3306/jspdb?useUnicode=true&characterEncoding=utf8&allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=Asia/Seoul";
		String dbId = "myid";
		String dbPwd = "mypwd";

		Connection con = null;

		// 1단계. DB드라이버 클래스 로딩
		Class.forName("com.mysql.cj.jdbc.Driver");
		// 2단계. DB에 연결 시도. 연결후 Connection객체를 리턴함.
		con = DriverManager.getConnection(dbUrl, dbId, dbPwd);
		return con;
	} // getConnection()

	private void close(Connection con, PreparedStatement pstmt) {
		close(con, pstmt, null);
	}

	private void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (pstmt != null) {
				pstmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} // close()

	public int getNextNum() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		int nextNum = 0;
		String sql = "";

		try {
			con = getConnection();

			sql = "SELECT IFNULL(MAX(num), 0) + 1 AS next_num ";
			sql += "FROM board ";

			pstmt = con.prepareStatement(sql);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				nextNum = rs.getInt("next_num");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return nextNum;
	} // getNextNum()

	public void addBoard(BoardVo boardVo) {
		Connection con = null;
		PreparedStatement pstmt = null;

		String sql = "";

		try {
			con = getConnection();

			sql = "INSERT INTO board (num, name, passwd, subject, content, readcount, reg_date, ip, file, re_ref, re_lev, re_seq) ";
			sql += "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, boardVo.getNum());
			pstmt.setString(2, boardVo.getName());
			pstmt.setString(3, boardVo.getPasswd());
			pstmt.setString(4, boardVo.getSubject());
			pstmt.setString(5, boardVo.getContent());
			pstmt.setInt(6, boardVo.getReadcount());
			pstmt.setTimestamp(7, boardVo.getRegDate());
			pstmt.setString(8, boardVo.getIp());
			pstmt.setString(9, boardVo.getFile());
			pstmt.setInt(10, boardVo.getReRef());
			pstmt.setInt(11, boardVo.getReLev());
			pstmt.setInt(12, boardVo.getReSeq());
			// 실행
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
	} // addBoard()

	public BoardVo getBoardByNum(int num) {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		BoardVo boardVo = null;
		String sql = "";

		try {
			con = getConnection();

			sql = "SELECT * FROM board WHERE num = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				boardVo = new BoardVo();

				boardVo.setNum(rs.getInt("num"));
				boardVo.setName(rs.getString("name"));
				boardVo.setPasswd(rs.getString("passwd"));
				boardVo.setSubject(rs.getString("subject"));
				boardVo.setContent(rs.getString("content"));
				boardVo.setReadcount(rs.getInt("readcount"));
				boardVo.setRegDate(rs.getTimestamp("reg_date"));
				boardVo.setIp(rs.getString("ip"));
				boardVo.setFile(rs.getString("file"));
				boardVo.setReRef(rs.getInt("re_ref"));
				boardVo.setReLev(rs.getInt("re_lev"));
				boardVo.setReSeq(rs.getInt("re_seq"));

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}

		return boardVo;
	}

	public void updateReadcount(int num) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		int rs;
		
		BoardVo boardVo = null;
		String sql = "";

		try {
			con = getConnection();
			sql = "UPDATE board ";
			sql += "SET readcount = readcount + 1 ";
			sql += "WHERE num = ? ";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			rs=pstmt.executeUpdate();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con,pstmt);
		}
		
		return;

	} // updateReadcount()

}
