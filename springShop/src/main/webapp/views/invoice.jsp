<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body{
background-image:url("https://th.bing.com/th/id/R.30f92ef7f29fc9281fd2d9094cd9af06?rik=s537yIS25zTJ%2bw&riu=http%3a%2f%2fcreativity103.com%2fcollections%2fGraphic%2fshipping.jpg&ehk=sNF0STarU8vgtaYdGwk12mcHEkTITld%2b5u5N%2f9r1x3Y%3d&risl=&pid=ImgRaw&r=0");
background-size:cover;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:include page="logout.jsp" />
<body><center><h1>Cart Items</h1></center>
	<%
Enumeration em=session.getAttributeNames();
while(em.hasMoreElements()){
	String a=em.nextElement().toString();
	String b=session.getAttribute(a).toString();
	if(a.equals("shop"))
	{
		
	}else{
	out.println("<h1>"+a+":"+b+"<h1>");
	}
}
%>
</body>
</html>