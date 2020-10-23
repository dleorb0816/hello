<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> <!-- page는 페이지 지시어,  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스터디 - 로그인</title>
</head>
<body>
	<h1>로그인</h1>
	<hr>
	<form action="loginProcess.jsp" method="post">
		아이디: <input type="text" name = "id" required><br><!-- name이 필수인 이유 : 서버에서 인식하기위해? required를 붙이면 입력하지 않으면 입력하라는 경고메세지가 뜬다-->
		패스워드 : <input type="password" name = "passwd" required><br>
		<input type="submit" value="로그인">
		<input type="button" value="회원가입" onclick="location.href='joinForm.jsp'"> 
	</form>
</body>
</html>