<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<hr>

<h1>Cool Drinks</h1>
<hr>
<form:form action="/form/shop" method="POST">
<input type="hidden" name="shop" value="invoice">
<input type="radio" name="Cola" value="rs30">Cola
<input type="radio" name="Frooti" value="rs10">Frooti
<input type="radio" name="7Up" value="rs25">7Up
<input type="submit" value="Next">
</form:form>
<hr>

