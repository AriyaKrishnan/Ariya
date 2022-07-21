<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body  bgcolor="Grey">
<hr>
<jsp:include page="logout.jsp" />
<h1>Cool Drinks</h1>
<hr>
<form action="shop.do" method="post">
<input type="hidden" name="action" value="purchase">
<input type="hidden" name="nextshop" value="shop4">

<input type="radio" name="Cola" value="rs30">Cola
<input type="radio" name="Frooti" value="rs10">Frooti
<input type="radio" name="7Up" value="rs25">7Up
<input type="submit" value="Next">
</form>
</body>
</html>