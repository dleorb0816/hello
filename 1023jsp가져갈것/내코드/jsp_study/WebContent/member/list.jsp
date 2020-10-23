<%@page import="java.sql.Timestamp"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.exam.vo.MemberVo"%>
<%@page import="java.util.List"%>
<%@page import="com.exam.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
//세션값 가져오기  //  (⌐■_■) ( •_•)>⌐■-■
//1) 로그인 안한경우 null 리턴
//2) 로그인 했는데 관리자 "admin"가 아닌경우
//   ->main.jsp로 이동
String id = (String) session.getAttribute("id");//로그인 했나 안했나 확인?

//!(id == null || !id.equals("admin"))
// id != null && id.equals("admin")//문자열이 admin이다
		if(id == null ||id.equals("admin") ){//순서가 바뀌면 아이디가 null일때 nullpointexception 에러남
	response.sendRedirect("main.jsp");
	return;
}

// DAO 객체 준비
// MemberDao memberDao = new MemberDao();
MemberDao memberDao = MemberDao.getInstance();//싱글톤 패턴 주소값만 참조해서 디도스 공격에 안전함
// 전체회원정보 List로 가져오기
List<MemberVo> memberList = memberDao.getAllMembers();

SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 mm분 ss초");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>전체회원 목록 조회</h1>
	<hr>
	<table border ="1">
		<thead>
			<tr>
				<th>아이디</th>
				<th>패스워드</th>
				<th>이름</th>
				<th>성별</th>
				<th>나이</th>
				<th>이메일</th>
				<th>가입일자</th>
			</tr>
		</thead>
		<tbody>
			<%
			for( MemberVo memberVo :memberList ) {
// 				Timestamp timestamp= memberVo.getRegDate();
// 				Date date = new Date();		//timestamp를 date형식으로 형변환
				%>
				<tr>
					<td><%=memberVo.getId() %></td>
					<td><%=memberVo.getPasswd() %></td>
					<td><%=memberVo.getName() %></td>
					<td><%=memberVo.getGender() %></td>
					<td><%=memberVo.getAge() %></td>
					<td><%=(memberVo.getEmail() == null) ? "" : memberVo.getEmail() %></td>
					<td><%=sdf.format(memberVo.getRegDate()) %></td>
				</tr>
				<%
			}
			%>
		</tbody>	
	</table>
	
	<h3><a href="main.jsp">메인화면</a></h3>
		
</body>
</html>



