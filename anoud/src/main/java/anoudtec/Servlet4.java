package anoudtec;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Servlet4")
public class Servlet4 extends HttpServlet {
	Connection con;
	PreparedStatement st;
	
       @Override
    public void init(ServletConfig cofig) throws ServletException {
    	   try {
    	    	Class.forName("com.mysql.cj.jdbc.Driver");
    	    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud","root","root");
    	    	  st = con.prepareStatement("Insert into emp1 values(?,?)");
    	    	
    	    }catch(Exception e) {
    	    	System.out.println(e);
    	    }
    	    }
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   String s1=request.getParameter("name");
		String s2=request.getParameter("age");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h1> Inserted Record:</h1>");
		int x=Integer.parseInt(s2);
		try {
			
			st.setString(1,s1);
			st.setInt(2,x);
			st.executeUpdate();
			out.println("updated");
		}catch(Exception e){
		out.println("<h2> BYE </h2>");
		}
}
}