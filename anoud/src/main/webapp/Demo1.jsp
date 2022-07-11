<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    buffer="14kb"
    autoFlush="false"
    errorPage="ErrPage.jsp"%>
    <hr>
    <%@include file="Headr.jsp" %>
    <hr>
    <jsp:include page="Headr.jsp">
    <jsp:param name="cname" value="Anoud Technologies.."/>
    </jsp:include>
    <hr>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
காலை வணக்கம்
<% 
for(int i=0;i<1000;i++){
	out.println("Hai");
	
	
}
%>


</body>
</html>
<hr>
<%@include file="Footr.jsp" %><hr>