<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body  bgcolor="Grey">
<h1>Vegetable Shop</h1>
<form action="shop.do" method="post">
<input type="hidden" name="action" value="purchase">
<input type="hidden" name="nextshop" value="shop3">
<input type="radio" name="cucumber" value="rs30">Cucumber
<input type="radio" name="tomato" value="rs10">Tomato
<input type="radio" name="onions" value="rs25">Onions
<input type="submit" value="Next">
</form>
</body>
</html>