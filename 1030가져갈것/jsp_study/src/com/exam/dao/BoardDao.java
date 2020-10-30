package com.exam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

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

	

	public int getNextNum() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		int nextNum = 0;
		String sql = "";

		try {
			con =  JdbcUtils.getConnection();

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
			 JdbcUtils.close(con, pstmt, rs);
		}
		return nextNum;
	} // getNextNum()

	public void addBoard(BoardVo boardVo) {
		Connection con = null;
		PreparedStatement pstmt = null;

		String sql = "";

		try {
			con =  JdbcUtils.getConnection();

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
			 JdbcUtils.close(con, pstmt);
		}
	} // addBoard()

	public BoardVo getBoardByNum(int num) {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		BoardVo boardVo = null;
		String sql = "";

		try {
			con =  JdbcUtils.getConnection();

			sql = "SELECT * FROM board WHERE num = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				boardVo = new BoardVo();

				boardVo.setNum(rs.getInt("num"));//여기서 "?"은 컬럼명임
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
			e.printStackTrace();
		} finally {
			 JdbcUtils.close(con, pstmt, rs);
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
			con =  JdbcUtils.getConnection();
			sql = "UPDATE board ";
			sql += "SET readcount = readcount + 1 ";
			sql += "WHERE num = ? ";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			rs=pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			 JdbcUtils.close(con,pstmt);
		}
		
//		 return;

	} // updateReadcount()
	
	//전체 글갯수 가져오기
	public int getCount() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		int count = 0;
		String sql = "";
		
		try {
			con = JdbcUtils.getConnection();
			
			sql = "SELECT COUNT(*) FROM board";
			
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				count = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.close(con, pstmt, rs);
		}
		return count;
	} // getCount()
	
	
	public List<BoardVo> getBoards(int startRow, int pageSize) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		List<BoardVo> list = new ArrayList<>();
		String sql ="";
		
		try {
			con = JdbcUtils.getConnection();
			sql="SELECT * ";
			sql += "FROM board ";
			sql += "order by re_ref DESC, re_seq ASC ";
			sql += "LIMIT ?, ? ";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, pageSize);
			
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				BoardVo boardVo = new BoardVo();
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
				
				list.add(boardVo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JdbcUtils.close(con, pstmt, rs);
		}
		return list;
	} //getBoards()
	//글번호에 해당하는 패스워드 일치 여부 확인하기
	public boolean isPasswdOk(int num, String passwd){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		boolean isPasswdOk = false;
		String sql = "";
		
		try {
			con = JdbcUtils.getConnection();
			
			sql  = "SELECT COUNT(*) ";
			sql += "FROM board ";
			sql += "WHERE num = ? ";
			sql += "AND passwd = ? ";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.setString(2, passwd);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int count = rs.getInt(1);
				if(count ==1) {
					isPasswdOk=true;
				}else {
					isPasswdOk = false;
				}
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.close(con, pstmt, rs);
		}
		return isPasswdOk;
	} // isPasswdOk()
	
	public void updateBoard(BoardVo boardVo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String sql ="";
		
		try {
			con= JdbcUtils.getConnection();
			
			sql ="update board ";
			sql += "set name = ?, subject = ?, content = ?, file = ? ";
			sql += "where num = ? ";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, boardVo.getName());
			pstmt.setString(2, boardVo.getSubject());
			pstmt.setString(3, boardVo.getContent());
			pstmt.setString(4, boardVo.getFile());
			pstmt.setInt(5, boardVo.getNum());
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.close(con, pstmt);
		}
		
		
	}//updateBoard
	
	public void deleteBoardBynum(int num) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql="";
		
		try {
			con = JdbcUtils.getConnection();
			
			sql = "DELETE FROM board WHERE num = ?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.close(con, pstmt);
		}
		
		
	}//deleteBoard
	
	public boolean updateAndAddReply(BoardVo boardVo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "";//null로 초기화 해도 됨
		
		try {
			con = JdbcUtils.getConnection();
			//re머시기 변수들의 값을 설정하는것(주글에 답글)
			con.setAutoCommit(false); 	//오토 커밋을 수동으로 바꾸는 작엄
			
			sql  = "UPDATE board ";
			sql += "SET re_seq = re_seq + 1 ";
			sql += "WHERE re_ref = ? ";
			sql += "AND re_seq > ? ";
			
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, boardVo.getReRef());
			pstmt.setInt(2, boardVo.getReSeq());
			// update 수행
			pstmt.executeUpdate();
			
			//update문장을 가진 pstmt 객체 닫기
			pstmt.close();
			
			/////////답글에 답글쓰기(실제로 답글 달기)
			sql  = "INSERT INTO board (num, name, passwd, subject, content, readcount, reg_date, ip, file, re_ref, re_lev, re_seq) ";
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
			pstmt.setInt(10, boardVo.getReRef());// 같은 그룹
			pstmt.setInt(11, boardVo.getReLev() +1 );// 답글쓰는 대상글의 들여쓰기 +1
			pstmt.setInt(12, boardVo.getReSeq() +1 );// 답글쓰는 대상글의 그룹내 순번 +1
			//insert문 실행
			pstmt.executeUpdate();
			
			con.commit();// 커밋하기
			
			con.setAutoCommit(true);// 자동 커밋은 기본값인 true로 수정
			
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			
			try {
				con.rollback();//단위 작업에 문제가 생기면 롤백(전체 취소)하기
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return false;
		} finally {
			JdbcUtils.close(con, pstmt);
		}
	} // updateAndAddReply
	
	
	
	
	public static void main(String[] args) {
		
		BoardDao boardDao = BoardDao.getInstance();
		
		for(int i=0;i<100; i++) {//글 100개 입력하기
			BoardVo boardVo = new BoardVo();
			
			int num = boardDao.getNextNum();
			boardVo.setNum(num);
			boardVo.setName("홍길동"+num);
			boardVo.setPasswd("1234");
			boardVo.setSubject("글제목"+num);
			boardVo.setContent("글내용"+num);
			boardVo.setReadcount(0);
			boardVo.setRegDate(new Timestamp(System.currentTimeMillis()));
			boardVo.setIp("127.0.0.1");
			boardVo.setReRef(num);
			boardVo.setReLev(0);
			boardVo.setReSeq(0);
			
			System.out.println(boardVo);
			
			boardDao.addBoard(boardVo);	//값을 넣어주는 역할
			
		}//for
		
	}// main()

}
