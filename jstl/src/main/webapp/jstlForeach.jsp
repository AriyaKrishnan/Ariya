<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:forEach var="i" begin="1" end="5">
<h1>Item:
<c:out value ="${i}"/>
</h1></c:forEach>