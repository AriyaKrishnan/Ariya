<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:catch var="catchtheException">
<% int x=2/0; %>
</c:catch>
<c:if test="${catchtheException!=null}">
<h1> The type of Exception is :${catchtheException}<br>
There is an Exception :${catchtheException.message}</h1>
</c:if>