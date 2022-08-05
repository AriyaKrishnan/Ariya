<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form action="/form/reg" method="POST" modelAttribute="userObj">
<style>
body{
background-image:url("https://www.elegantthemes.com/blog/wp-content/uploads/2013/09/bg-10-full.jpg");
background-size:cover;
}
</style>
<h1>Register</h1>
<center><hr>
	
	UserName:<form:input path="uname"/><br>
	<form:errors path="uname"></form:errors><br>
	PassWord:<input type="password" name="upass"/><br>
	Re-Enter PassWord:<input type="password" name="pass2"/><br>
	City:<form:input path="city"/><br>
	Flag:<form:input path="flag"/><br>	
	Address:<form:input path="address"/><br>	
	PhoneNumber:<form:input path="phno"/><br>		
	<input type="submit" value="Register"></center>
</form:form>

	