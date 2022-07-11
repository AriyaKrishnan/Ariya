<%@page import="anoudtec.DbConn"%>
<%@page import="java.sql.ResultSet"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<H3>Employee Details</H3>
	<%!
    ResultSet rs ;
	DbConn db ;
    String sConn;
    public void jspInit() {
        db = new DbConn();
        sConn = db.DBConnect();
        rs = null;
    }
%>
	<a href="Exam9.jsp">Home</a>
	<%
    String sID = request.getParameter("ID");
    if(sID.equals("Insert")) {
        String name = request.getParameter("name");
        int age = (new Integer(request.getParameter("age"))).intValue();
        String sInsState = null;
        if(sConn.equals("")) {
            sInsState = db.setData(name, age);
        }
%>
	<H1><%=sInsState%></H1>
	<%
    } else {
        rs = db.getData();
%>
	<table border="1">
		<tr>
			<th>Name</th>
			<th>Age</th>
		</tr>
		<%
        while(rs.next()){
%>
		<tr>
			<td><%=rs.getString(1)%></td>
			<td><%=rs.getInt(2)%></td>
		</tr>
		<%
        }
%>
	</table>
	<%
    }
%>
</body>
</html>