package interjava;

import java.net.URL;
import java.net.URLConnection;

public class CallServlet {

	public static void main(String[] args) throws Exception{
		URL ur=new URL("http://localhost:8080/anoud/ServletDemo");
		URLConnection con=ur.openConnection();
		con.getInputStream();
		
	}

}
