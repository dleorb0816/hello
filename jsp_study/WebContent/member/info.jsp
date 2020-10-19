<%@page import="com.exam.vo.MemberVo"%>
<%@page import="java.util.List"%>
<%@page import="com.exam.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//세션값 가져오기
String id = (String) session.getAttribute("id");
//세션값 없으면 loginForm.jsp이동
if(id == null){//순서가 바뀌면 아이디가 null일때 nullpointexception 에러남
	%>
<!-- 	<script> -->
// 		alert('aa');
// 		location.href = 'loginForm.jsp';
<!-- 	</script> -->
	<%
	response.sendRedirect("loginForm.jsp");
	return;
} //  (⌐■_■) ( •_•)>⌐■-■
// DAO 객체 준비
// MemberDao memberDao = new MemberDao();
MemberDao memberDao = MemberDao.getInstance();//싱글톤 패턴 주소값만 참조해서 디도스 공격에 안전함
// 현재 로그인된 회원정보 한개 가져오기메소드가 이미 있음 VO참조
MemberVo memberList = memberDao.getMemberById(id);

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원 정보 조회</h1>
	<hr>

	아이디: <%=memberList.getId() %><br>
	패스워드: <%=memberList.getPasswd() %><br>
	이름: <%=memberList.getName() %><br>
	나이: <%=memberList.getAge() %><br>
	성별: <%=memberList.getGender() %><br>
	이메일: <%=memberList.getEmail() == null ? "" : memberList.getEmail() %><br>
	가입날짜: <%=memberList.getRegDate() %><br>
	
	<h3><a href="main.jsp">메인화면</a></h3>
</body>
</html>