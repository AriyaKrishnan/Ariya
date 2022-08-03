<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1>Vegetable Shop</h1>
<hr>
<form:form action="/form/shop" method="POST">
<input type="hidden" name="shop" value="shop3">
<input type="radio" name="cucumber" value="rs30">Cucumber
<input type="radio" name="tomato" value="rs10">Tomato
<input type="radio" name="onions" value="rs25">Onions
<input type="submit" value="Next">
</form:form><hr>

<jsp:include page="logout.jsp" />
