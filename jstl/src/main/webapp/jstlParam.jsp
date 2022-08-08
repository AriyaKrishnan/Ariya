<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="param.jsp" var="completeURL">  
 <c:param name="trackingId" value="786"/>  
 <c:param name="user" value="Nakul"/>  
</c:url> 
<c:out value="${completeURL}"/>