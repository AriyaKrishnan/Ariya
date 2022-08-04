<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<style>
body{
background-image:url("https://th.bing.com/th/id/R.b79d937b0ace94b45ff87e5445ce9a58?rik=mx3bW0%2fGDzvwDA&riu=http%3a%2f%2fwww.machax.com%2fwp-content%2fuploads%2f2015%2f05%2fCans-1024x768.jpg&ehk=CQhYT3saLg6PrlBBLi3KpKEFO0kHqMf5lPyBSbWlixY%3d&risl=&pid=ImgRaw&r=0");
background-size:cover;
}
</style>
<jsp:include page="logout.jsp" />
<hr>
<center>
<h1>Cool Drinks</h1>
<hr>
<form:form action="/form/shop" method="POST">
<input type="hidden" name="shop" value="invoice">
<input type="radio" name="Cola" value="rs30">Cola
<input type="radio" name="Frooti" value="rs10">Frooti
<input type="radio" name="7Up" value="rs25">7Up
<input type="submit" value="Next">
</form:form></center>
<hr>

