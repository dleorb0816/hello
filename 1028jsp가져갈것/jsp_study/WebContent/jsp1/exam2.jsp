<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//변수선언 문자열 myid 문자열 passwd 정수형 age
	// 	변수에 값넣기  "testid"   "testpass"       27
	String myid = "testid";
	String passwd = "testpass";
	int age = 27;
	String tagline1 = "님의 비밀번호는 ";
	
	
	
	//body태그 안에서브라우저 출력
	//myid 님의 비밀번호는 passwd이고,
	//나이는 age입니다.<br>
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= myid %> 님의 비밀번호는 <%=passwd %>이고,
나이는 <%= age %> 입니다.<br>

<%
	//out - jsp 기본 출력 객체(요청받은 브라우저 쪽으로 출력)
	out.println(myid + " 님의 비밀번호는" + passwd+"이고, ");
	out.println("나이는"+age+"입니다");
%>

</body>
</html>