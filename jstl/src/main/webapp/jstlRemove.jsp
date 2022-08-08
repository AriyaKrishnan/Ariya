<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="income" scope="session" value=" ${4000*4}"/>
<c:set var="income1" scope="session" value=" ${2000*4}"/>
<h1>Before Removal:</h1>
<c:out value="${income}" /><br>
<c:out value="${income1}" />
<c:remove var="income" />
<h1>After Removal:</h1>
<c:out value="${income}" /><br>
<c:out value="${income1}" />
