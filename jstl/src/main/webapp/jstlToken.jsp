<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:forTokens items="Ariya-Rama-Krishnan" delims="-" var="name">
<h1>Tokens :
<c:out value="${name}"/></h1>
</c:forTokens>