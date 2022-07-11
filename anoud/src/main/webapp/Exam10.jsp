<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body bgcolor="white">
<font color="orange">
<p>Static Include :
<%@ include file="Exam2.jsp" %>
<p>Dynamic Include :
</font>
<jsp:include page="Exam3.jsp" flush="true"/>
</body>
</html>