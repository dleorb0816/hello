<%@page import="java.io.File"%>
<%@page import="com.exam.vo.BoardVo"%>
<%@page import="com.exam.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// post 방식 파라미터값 한글처리
request.setCharacterEncoding("utf-8");

// 파라미터값 pageNum num passwd 가져오기
String pageNum = request.getParameter("pageNum");
int num = Integer.parseInt(request.getParameter("num"));//request.getParameter로 받아오는 값은 String 값으로 넘어옴 -> 그래서 int 형으로 변환해줌
String passwd = request.getParameter("passwd");

//DAO 객체 준비
BoardDao boardDao = BoardDao.getInstance();

//본인확인용 글 패스워드 비교
boolean isPasswdOk = boardDao.isPasswdOk(num, passwd);

//글 패스워드 일치하면 글 삭제하고 글 목록으로 이동
if(isPasswdOk){
	//글번호에 해당하는 글내용 가져오기(첨부파일 정보 확인 위해서)
	BoardVo boardVo = boardDao.getBoardByNum(num);
	//첨부파일이름
	String filename = boardVo.getFile();
	
	if(filename != null){
		String realPath = application.getRealPath("/upload");
		//File 객체 준비
		File file =new File(realPath, filename);
		if(file.exists()){	//해당경로에 파일이 존재하면
			file.delete();	//파일 삭제하기
		}
	}
	
	boardDao.deleteBoardBynum(num);	//DB테이블 내용 삭제
	response.sendRedirect("list.jsp?pageNum="+ pageNum);
}else{
	%>
	<script>
		alert('글 패스워드 틀림');
		history.back();
	</script>
	<%
}

%>