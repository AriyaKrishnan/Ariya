<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello</title>
</head>
<body>
<%
	Date d;
	List li;
	ArrayList al;
	
%>
	<h1>
		<%
		out.println("Hello World");
		%>
		<%=application.getRealPath("") %>
	</h1>
	<%
		String uname=request.getParameter("uname");
	%>
	<h1>
		<%out.println(uname);met();%>
	</h1>
	<h2>	<%=uname %> <%=value %> 	</h2>
		
	<%!
		String value="hello world...";
		void met(){
			System.out.println("called....");
		}
	%>
</body>
</html>