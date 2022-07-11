<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page 2</title>
</head>
<body>
	<%@ page language="java"%>
	<%!String name = "";%>
	<%
	name = request.getParameter("thename");
	session.putValue("thename", name);
	%>

	The name is
	<%=name%>
	<p>
	<form method=post action="Q3.jsp">
		What i syour Favorite Food?
		 <input type=text name="food">
		<p>
			<input type=submit value="submit">
	</form>



</body>
</html>