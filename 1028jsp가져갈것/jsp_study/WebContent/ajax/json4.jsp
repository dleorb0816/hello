<%@page import="com.google.gson.Gson"%>
<%@page import="com.exam.vo.MemberVo"%>
<%@page import="java.util.List"%>
<%@page import="com.exam.dao.MemberDao"%>
<%@ page language="java" contentType="application/json; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//DAO 객체 준비
MemberDao memberDao = MemberDao.getInstance();

//전체 회원정보 가져오기
List<MemberVo> memberList = memberDao.getAllMembers();

// Gson 라이브러리 사용해서
// memberList 객체를 JSONArray, JSONObject 객체로 변환

//Gson 객체 준비
Gson gson = new Gson();

//memerList 객체를 JSON문자열로 변환하기
String strJson = gson.toJson(memberList);//toJson으로 바꾸겟다

//웹서버 콘솔에 출력
System.out.println(strJson);

//웹 브라우저로 출력
//out.println(strJson);


%>
<%-- 웹브라우저로 출력 --%>
<%=strJson %>