<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="salary" scope="session" value="${3000*5}"/>
<h1>
	Your Income is:
	<c:out value="${salary}" />
</h1>
<c:choose>
	<c:when test="${salary <= 1000}">
		<h1>Income is Not Good</h1>
	</c:when>

	<c:when test="${salary > 10000}">
		<h1>Income is Good</h1>
	</c:when>
	<c:otherwise>
		<h1>Income is Undetermined</h1>
	</c:otherwise>
</c:choose>
