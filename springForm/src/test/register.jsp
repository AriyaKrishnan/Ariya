<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form action="/new/register" method="POST" modelAttribute="form">
	UserId:<form:input path="userId"/><br>
	UserName:<form:input path="username"/><br>
	PassWord:<form:input path="password"/><br>
	City:<form:input path="city"/><br>	
	Address:<form:input path="address"/><br>	
	PhoneNumber:<form:input path="phoneNumber"/><br>
	Image:<form:input path="image"/><br>		
	<input type="submit" value="click...">
</form:form>