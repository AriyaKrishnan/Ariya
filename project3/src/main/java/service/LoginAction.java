package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbConn.DBConnection;
import dbConn.UserDTO;


public class LoginAction extends Action {
	private UserDTO userDTO;
	private DBConnection dbConn;
	public LoginAction() {
		
	}
	public DBConnection getDbcon() {
		return dbConn;
	}
	public void setDbcon(DBConnection dbcon) {
		this.dbConn = dbcon;
	}
	public UserDTO getUserDTO() {
		return userDTO;
	}
	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}
	@Override
	public String execute(HttpServletRequest request,HttpServletResponse response) {
		userDTO=new UserDTO();
		dbConn=new DBConnection();
		userDTO.setUname(request.getParameter("uname"));
		userDTO.setUpass(request.getParameter("upass"));
		
		boolean user=dbConn.checkUser(userDTO.getUname(), userDTO.getUpass());
		if(user) {
			boolean valid=dbConn.checkFlag(userDTO.getUname());
		    if(valid) {
		    	dbConn.updateFlag(userDTO.getUname(), 1);
		      request.getSession().setAttribute("uname",userDTO.getUname());
			  return "login.welcome";
		    }
		    else {
		    	return "next";
		    }
		}
		else {
		return "login.invaliduser" ;
		}
	}
}

