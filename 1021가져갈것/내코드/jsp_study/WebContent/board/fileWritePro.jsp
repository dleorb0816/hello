<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="com.exam.dao.BoardDao"%>
<%@page import="com.exam.vo.BoardVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 파일 업로드 위해서 cos.jar 라이브러리를 프로젝트 빌드패스에 추가.

// 업로드 객체 생성할때 필요한 인자값
// 1. request
// 2. 업로드 할 폴더의 물리적 경로(realPath)
// 3. 업로드 최대 파일 크기 제한
// 4. 파일명 한글처리 utf-8
// 5. 파일명 중복될때 이름변경 규칙 가진 객체를 전달

//업로드할 실제 물리적 경로 구하기
String realPath = application.getRealPath("/upload");// /는 Webcontent를 의미함
System.out.println("realPath : " + realPath);

//파일 업로드 하기
MultipartRequest multi = new MultipartRequest(
		request, //파일정보가 있고
		realPath, //이 정보를 이 경로에 업로드함
		1024 * 1024 * 20, // 최대 업로드 20MB로 제한
		"utf-8",//파일이름이 안깨지도록 유니코드로함
		new DefaultFileRenamePolicy());//파일명 중복될때 숫자추가하고올려주는 기능
		
// enctype="multipart/form-data" 로 전송받으면
// 기본내장객체인 request에서 파라미터값을 바로 찾을수 없음!
// MultipartRequest 객체로부터 파라미터값을 찾아야 함!


// post 파라미터값 한글처리는 위에 생성자에서 처리하기 때문에 할필요 없음
//request.setCharacterEncoding("utf-8");

// VO 객체 준비
BoardVo boardVo = new BoardVo();

// 파라미터값 가져와서 VO에 저장. MultipartRequest로 찾음, request.getParameter하면 널값이 나오기 때문에 multi로 바꾼다
boardVo.setName(multi.getParameter("name"));
boardVo.setPasswd(multi.getParameter("passwd"));
boardVo.setSubject(multi.getParameter("subject"));
boardVo.setContent(multi.getParameter("content"));

//업로드한 원본 파일이름 가져오기
System.out.println("원본파일명 : " + multi.getOriginalFileName("filename"));//form태그에서 넘어오는 name속성값

//업로드한 실제 파일이름 가져오기
System.out.println("실제파일명 : " + multi.getFilesystemName("filename"));//form태그에서 넘어오는 name속성값
boardVo.setFile(multi.getFilesystemName("filename"));

// DAO 객체 준비
BoardDao boardDao = BoardDao.getInstance();

// 글번호 가져와서 VO에 저장
int nextNum = boardDao.getNextNum();
boardVo.setNum(nextNum);

// ip  regDate  readcount  값 저장
boardVo.setIp(request.getRemoteAddr()); //ip주소는 MultipartRequest파라미터?가 아니라서 똑같이 request로 받아올수 있음
boardVo.setRegDate(new Timestamp(System.currentTimeMillis()));
boardVo.setReadcount(0);  // 조회수

// re_ref  re_lev  re_seq
boardVo.setReRef(nextNum); // 주글일때는 글번호가 그룹번호가 됨
boardVo.setReLev(0); // 주글일때는 들여쓰기 레벨이 0 (들여쓰기 없음)
boardVo.setReSeq(0); // 주글일때는 글그룹 내에서 순번이 0 (첫번째)

// 주글 등록하기
boardDao.addBoard(boardVo);

// 글내용 상세보기 화면 content.jsp로 이동
response.sendRedirect("content.jsp?num=" + boardVo.getNum());
%>




