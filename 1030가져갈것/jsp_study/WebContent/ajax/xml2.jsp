<%@page import="com.exam.vo.MemberVo"%>
<%@page import="java.util.List"%>
<%@page import="com.exam.dao.MemberDao"%>
<%@ page language="java" contentType="text/xml; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% 
// DAO 객체 준비
MemberDao memberDao= MemberDao.getInstance();

//전체 회원정보 가져ㅗㅇ기
List<MemberVo> memberList = memberDao.getAllMembers();
%>
<memberList><!-- 항상 전체를 감싸는 태그가 있어야됨 xml에는 -->
<%
for (MemberVo memberVo : memberList){
	%>
	<member>
		<id><%=memberVo.getId()%></id>
		<name><%=memberVo.getName()%></name>
		<age><%=memberVo.getAge()%></age>
	</member>
	<%
}
%>
</memberList>