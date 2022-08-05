<%@page import="java.sql.ResultSet"%>
<%@page import="com.example.demo.DBconn" %>
<%@page import="java.io.OutputStream"%>

<html><body>
<style>
body{
background-image:url("https://th.bing.com/th/id/OIP.RXWE5k-gCzijp_XiUDqtbwHaFA?pid=ImgDet&rs=1");
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
<input type="hidden" name="shop" value="shop3">
<% rs=im.checkTable("vegetableshop");
while(rs.next()){ %>
<span><input type="checkbox" name=<%=rs.getString(1) %> value=<%=rs.getString(2) %> >
	<%=rs.getString(1) %>
	<img alt="Image not found......" src=/form/shopimg?shopname=vegetableshop&name=<%=rs.getString(1) %> width="100px" height="100px">
	 <% } %></span>
    <input class="sub" type="submit" value="Next">
</form>
</body>
</html>



