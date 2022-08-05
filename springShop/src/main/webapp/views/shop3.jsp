<%@page import="java.sql.ResultSet"%>
<%@page import="com.example.demo.DBconn" %>
<%@page import="java.io.OutputStream"%>

<html><body>
<style>
body{
background-image:url("https://th.bing.com/th/id/R.b79d937b0ace94b45ff87e5445ce9a58?rik=mx3bW0%2fGDzvwDA&riu=http%3a%2f%2fwww.machax.com%2fwp-content%2fuploads%2f2015%2f05%2fCans-1024x768.jpg&ehk=CQhYT3saLg6PrlBBLi3KpKEFO0kHqMf5lPyBSbWlixY%3d&risl=&pid=ImgRaw&r=0");
background-size:cover;
}
</style>
<center>
<h1>Fruit Shop</h1>
<hr>

<%! ResultSet rs ;
DBconn im ;
    public void jspInit() {
        im = new DBconn();
    }
%>
<form action="/form/shop" method="post">
<input type="hidden" name="shop" value="invoice">
<% rs=im.checkTable("cooldrinks");
while(rs.next()){ %>
<span><input type="checkbox" name=<%=rs.getString(1) %> value=<%=rs.getString(2) %> >
	<%=rs.getString(1) %>
	<img alt="Image not found......" src=/form/shopimg?shopname=cooldrinks&name=<%=rs.getString(1) %> width="100px" height="100px">
	 <% } %></span>
    <input class="sub" type="submit" value="Next">
</form>
</body>
</html>

