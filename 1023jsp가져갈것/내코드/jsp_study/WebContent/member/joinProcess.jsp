<%@page import="com.exam.dao.MemberDao"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="com.exam.vo.MemberVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- post 파라미터값 한글처리--%>
<%request.setCharacterEncoding("utf-8"); %>


<%--//VO객체 준비  //  (⌐■_■) ( •_•)>⌐■-■ --%>
<%//MemberVo memberVo = new MemberVo();//빈바구니 %>
<%-- 액션태그 useBean으로 Vo 객체 준비 --%>
<jsp:useBean id="memberVo"class="com.exam.vo.MemberVo"/><%--useBean은 기본생성자로만 만듬 --%>
		<%--밑에서 참조할때 사용 --%>	


<%-- 파라미터 찾기	세터메소드로 데이터 꽉꽉채우기 --%>
<%
// memberVo.setId(request.getParameter("id"));
// memberVo.setPasswd(request.getParameter("passwd"));
// memberVo.setName(request.getParameter("name"));
// memberVo.setAge(Integer.parseInt(request.getParameter("age")));
// memberVo.setGender(request.getParameter("gender"));
//memberVo.setEmail(request.getParameter("email")); 
%>

<jsp:setProperty property="*" name="memberVo"/><%--위에 useBean id값을 가져와서 name에 넣음 --%>


<%--회원가입(날짜시간) 정보 설정 --%>
<%memberVo.setRegDate(new Timestamp(System.currentTimeMillis())); %>
<%
// DAO 객체 준비
//MemberDao memberDao = new MemberDao();	//기존 패턴
MemberDao memberDao = MemberDao.getInstance();//싱글톤 패턴 주소값만 참조해서 디도스 공격에 안전함

//회원가입 처리 수행
memberDao.addMember(memberVo);//11번째 줄에서 만들어진 memberVo를가리킴

%>
<script>
	alert('회원가입 성공!');
	location.href='loginForm.jsp';
	//자바스크립트도 html문서의 일부이다
</script>
<!-- 입력받은값 처리하는 코드 -->
<!--이런코드는 서버공격의 빌미가 될수도 있다 새로고침이 안되서 -->