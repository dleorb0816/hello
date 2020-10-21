<%@page import="com.exam.dao.MemberDao"%>
<%@page import="com.exam.vo.MemberVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//세션값 id 가져오기
String id = (String) session.getAttribute("id");
//세션값 id 없으면  loginForm.jsp 이동
if (id == null) {
	response.sendRedirect("loginForm.jsp");
	return;
}

// post 파라미터값 한글처리
request.setCharacterEncoding("utf-8");

// VO 객체 준비
MemberVo memberVo = new MemberVo();

// 파라미터값 가져와서 VO에 저장
memberVo.setId(request.getParameter("id"));
memberVo.setPasswd(request.getParameter("passwd"));
memberVo.setName(request.getParameter("name"));
memberVo.setAge(Integer.parseInt(request.getParameter("age")));
memberVo.setGender(request.getParameter("gender"));
memberVo.setEmail(request.getParameter("email"));

// DAO 객체 준비
// MemberDao memberDao = new MemberDao();
MemberDao memberDao = MemberDao.getInstance();//싱글톤 패턴 주소값만 참조해서 디도스 공격에 안전함

// 회원수정
memberDao.update(memberVo);

// main.jsp 이동
//response.sendRedirect("main.jsp");
%>
<script>
	alert('회원수정 완료');
	location.href = 'main.jsp';
</script>




