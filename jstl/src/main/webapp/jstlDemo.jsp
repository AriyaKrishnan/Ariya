<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<c:out value="${\"hello world..hello..hello world...\"}"></c:out>
	<c:set var="num" scope="session" value="10000"/>
	<c:set var="str" scope="page" value="hello world..."/>
	
	 <%
		request.setAttribute("myname", "anound technologies...");
	
		
	%>
	
	<h1>
		<c:out value="The value is...${myname}"/>
	</h1>
	
	<h1>
		<c:out value="The value is...${num}"/>
	</h1>
	
	
	<a href="test2.jsp">Click here...</a>
	
	<%-- <jsp:forward page="test2.jsp"/>--%>