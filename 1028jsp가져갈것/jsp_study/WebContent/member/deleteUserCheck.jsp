<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//세션값 id 가져오기  //  (⌐■_■) ( •_•)>⌐■-■
String id = (String) session.getAttribute("id");
//세션값 id 없으면  loginForm.jsp 이동
if (id == null) {
	response.sendRedirect("loginForm.jsp");
	return;
}
//이까지 로그인 했는지 안했는지 검사해줌

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원정보 삭제 전 사용자 패스워드 확인</h1>
	<hr>
	<form action="delete.jsp" method="post" id ="frm">
		아이디: <input type="text" value="<%=id %>" readonly=><br>
		패스워드: <input type="password" name ="passwd"><br>
		<input type ="submit" value="패스워드 확인">
	</form>
	
<script src="../js/jquery-3.5.1.js"></script><!-- src는 라이브러리를 로딩할떄 사용함 -->
<script>
	$('form#frm').submit(function (event) {
		let isDelete = confirm('정말 탈퇴 하시겠습니까?');//true/false 리턴
		if (!isDelete) {//isDelete == false
// 			event.preventDefault();	//기본 기능 막기
// 			return;
			
			return false;//자신의 기본동작을 취소한다 다음 이벤트로 넘어가게 해줌
		}
// 		return true; //리턴이 false만 아니면 실행한다.
		});
	
</script>
</body>
</html>