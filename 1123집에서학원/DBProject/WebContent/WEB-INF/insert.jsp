<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="db.ceans.*,java.sql.*,java.util.*,java.io.*" %>

<jsp:useBean id="QueryCean" scope="page" class="db.ceans.QueryCean" />
<jsp:setProperty name="QueryCean" property="*" />
<%
	//캐쉬 제거
	response.setHeader("Cache-Control", "no-store");
	response.setHeader("Pragma", "no-cache");
	response.setDateHeader("Expires", 0);
	
	request.setCharacterEncoding("UTF-8");
	
	String id = request.getParameter("id")== null ? "" : request.getParameter("id").trim();
	String name = request.getParameter("name")==null ? "" : request.getParameter("name").trim();
	String phone = request.getParameter("phone")==null ? "" : request.getParameter("phone").trim();

	QueryCean.getConnection();
	
	int res =0;
	
	try{
		res= QueryCean.setUserInfo(id,name,phone);
	}
	catch(Exception e)
	{
		out.print(e.toString());
	}
	finally
	{
		QueryCean.closeConnection();
	}
	
	out.print("[");
	out.print("{ ");
	out.print("\"RESULT_OK: \"" + res + "\" ");
	out.print("} ");
	out.print("]");
	
	System.out.println("res: " + res);
	
%>
