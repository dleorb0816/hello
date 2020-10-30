<%@page import="com.exam.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
//사용자 단위로 세션이 만들어짐  //  (⌐■_■) ( •_•)>⌐■-■
	// post 파라미터값 한글 처리
request.setCharacterEncoding("utf-8");

// 폼 파라미터 값 id  passwd  가져오기 
String id = request.getParameter("id");
String passwd = request.getParameter("passwd");

//DAO객체 준비
// MemberDao memberDao = new MemberDao();
MemberDao memberDao = MemberDao.getInstance();//싱글톤 패턴 주소값만 참조해서 디도스 공격에 안전함

//로그인 확인 메소드 호출 userCheck(id, passwd)아이디가 존재하는지 안하는지 확인
int check = memberDao.userCheck(id, passwd);
// check ==1 로그인 인증 main.jsp 이동
// check ==0 '패스워드 틀림' 뒤로이동
// check == -1 '아이디 없음' 뒤로이동
if (check == 1) {
	session.setAttribute("id",id);	//자바코드 (서버가 먼저 해석하고 처리) 이게 스크립트 밑에 와도 상관 없음
	%> 								//스크립트 영역에 출력 결과를 버퍼에 모아두고 있다가 끝까지 다 실행되면 한방에 보내기 때문에
	<script>						//브라우저 코드(자바스크립트)	(브라우저(클라이언트?)가 처리)
		alert('로그인 성공!');	
		location.href='main.jsp';	
	</script>
	<%
} else if (check == 0) {
	%>
	<script>
		alert('패스워드 틀림');
		history.back();
	</script>
	<%
} else { //check ==-1
	%>
	<script>
		alert('아이디 없음');
		history.back();
	</script>
	<%
	}
%>