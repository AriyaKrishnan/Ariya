<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<style>
body{
background-image:url("https://th.bing.com/th/id/OIP.AAwsQRjV9FYSi579whDW4gHaE7?pid=ImgDet&rs=1");
background-size:cover;
}
</style>
<form:form action="/form/forms1" method="POST"><center>
    User Name:
    <input type="text" name="uname" required="required"><br>
    Password:<input type="password" name="upass" required="required"><br>
    <input type="submit" value="click..."></center>
</form:form>