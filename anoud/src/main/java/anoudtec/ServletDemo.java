package anoudtec;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/ServletDemo")
@WebServlet(
		urlPatterns = "/ServletDemo",
		initParams = {
				@WebInitParam(name="driver",value="my sql driver...."),
				@WebInitParam(name="url",value="my sql driver urlllllll....")
				}
	)
public class ServletDemo extends HttpServlet {
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init called.....");
		String mydrivervalue=config.getInitParameter("driver");
		System.out.println(mydrivervalue);
		System.out.println(config.getInitParameter("url"));
		ServletContext application=config.getServletContext();
		application.setAttribute("myglobal","sun.....");
	}
		
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		String name=request.getParameter("uname");
		String password=request.getParameter("upass");
		PrintWriter out=response.getWriter();
		if(name.equals("ramu")) {
			out.println("<h1>Welcome page.........................</h1>");
		}
		else {
			//response.sendRedirect("Welcome.html");
			RequestDispatcher rd=request.getRequestDispatcher("Welcome.html");
			rd.forward(request, response);
		}
		System.out.println("service method called...");
		System.out.println("Init Called....");
		
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	@Override
	public void destroy() {
		System.out.println("Destroy Called...");
	}

}
