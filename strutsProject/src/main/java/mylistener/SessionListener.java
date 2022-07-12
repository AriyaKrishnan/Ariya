package mylistener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import dbconn.DbConnection;

@WebListener
public class SessionListener implements HttpSessionListener {


    public void sessionCreated(HttpSessionEvent se)  { 
    	System.out.println("Session Created...");
    }

    public void sessionDestroyed(HttpSessionEvent se)  {
    	System.out.println("Session Destroyed...");
    	DbConnection dbcon=new DbConnection();
    	HttpSession session=se.getSession();
    	Object obj=session.getAttribute("uname");
    	if(obj!=null) {
    		String uname=obj.toString();
    		dbcon.updateFlag(uname, 0);
    	}
    }
	
}
