<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	//post 요청 파라미터 한글 처리
	request.setCharacterEncoding("utf-8");
	
	
	//파라미터 name age 가져와서 변수에 저장(get으로 넘어올떄 사용)
	String strNum = request.getParameter("name");
	String strAge = request.getParameter("age");
	
	// 문자열 ->정수형
	int age = Integer.parseInt(strAge);
//	int age = Integer.parseInt(request.getParameter("strAge"));

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

이름 : <%=strNum %> <br> 
나이 : <%=age %><br>

<%
if(age >=20){
	out.println(strNum +"님의 나이는 20살 이상입니다");
}else if(age <20){
	out.println(strNum +"님은 미성년자 입니다.");
}

%>

<hr>

<%
if(age >=20){
 	%>
 		<%=strNum %>님의 나이는 20살 이상입니다 <br>
 	<% 
}else if(age <20){
	%>
		<%=age %>님은 미성년자 입니다. <br>
	<% 	
}
%>
</body>
</html>