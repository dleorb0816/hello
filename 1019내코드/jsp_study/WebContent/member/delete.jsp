<%@page import="com.exam.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//세션값 id 가져오기  //  로그인 검증코드
String id = (String) session.getAttribute("id");
//세션값 id 없으면  loginForm.jsp 이동
if (id == null) {
	response.sendRedirect("loginForm.jsp");
	return;
}

// post 파라미터값 한글처리
request.setCharacterEncoding("utf-8");

// 파라미터값 passwd 가져오기
String passwd = request.getParameter("passwd");

//DAO객체 준비
// MemberDao memberDao = new MemberDao();
MemberDao memberDao = MemberDao.getInstance();//싱글톤 패턴 주소값만 참조해서 디도스 공격에 안전함

//패스워드 일치여부 확인
int check = memberDao.userCheck(id, passwd);

if(check ==0){//	패스워드 불일치 check == 0
	%>
	<script>
		alert('패스워드 틀림');
		history.back();
	</script>
	<%
	return;
}

//패스워드 일치 check == 1

//회원정보 삭제하기
memberDao.deleteById(id);
%>
<script>
	alert('회원 탈퇴 완료');
	location.href ='loginForm.jsp';
</script>



