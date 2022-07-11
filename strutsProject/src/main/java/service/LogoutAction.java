package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbconn.DbConnection;
public class LogoutAction extends Action{
	
	public LogoutAction() {
		
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		String name=request.getSession().getAttribute("uname").toString();
		
		DbConnection con=new DbConnection();
		
		boolean a=con.updateFlag(name, 0);
		
		if(a) {
			
			return "logout.Success";
			
		}else {
		
		return "Logout.Fail";
		
		}
		
	}
}
