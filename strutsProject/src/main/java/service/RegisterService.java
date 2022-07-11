package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbconn.DbConnection;
import dbconn.UserDTO;
public class RegisterService extends Action {	
		
		private UserDTO user;
		
		private DbConnection con;
		public UserDTO getUser() {
			return user;
		}
		public void setUser(UserDTO user) {
			this.user = user;
		}
		public DbConnection getCon() {
			return con;
		}
		public void setCon(DbConnection con) {
			this.con = con;
		}
		@Override
		public String execute(HttpServletRequest request, HttpServletResponse response) {
			
			user=new UserDTO();
			
			con=new DbConnection();
			
			user.setUname(request.getParameter("uname"));
			
			user.setUpass(request.getParameter("upass"));
			
			boolean a=con.registerUser(user);
			
			if(a) {
					
					return "Logout-Success";
					
				}
				
			else {
			
			return "Logout-Fail";
			
			}
		
	}
}
