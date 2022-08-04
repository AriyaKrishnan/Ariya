<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<center>
<h1>Fruit Shop</h1>
<hr>
<form:form action="/form/shop" method="POST">
<input type="hidden" name="shop" value="shop2">
<input type="radio" name="apple" value="rs50">Apple
<input type="radio" name="mango" value="rs30">Mango
<input type="radio" name="banana" value="rs20">Banana
<input type="submit" value="Next">
</form:form></center>
