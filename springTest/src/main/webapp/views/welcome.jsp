<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<h1>Welcome...</h1>
${myuser.uname}
<form action="/test/tes1" method="get">
<input type="submit" value="Logout"></form>
<jsp:include page="q1.jsp" />
