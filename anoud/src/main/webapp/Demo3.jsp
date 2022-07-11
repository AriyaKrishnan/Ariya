<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/WEB-INF/mytags.tld" prefix="mytaglib" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Demo</title>
</head>
<body>
<%-- <%
	String str=request.getParameter("number");
	int num=Integer.parseInt(str);
	if(num%2==0){
		out.println("Even Number....");
	}
	else{
		out.println("Odd Number......");
	}
%> --%>
<mytaglib:checkNumber number="<%=request.getParameter(\"num\") %>"/>
</body>
</html>