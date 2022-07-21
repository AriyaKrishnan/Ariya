package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcDemo1 {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/behindtech","root","root");
		
		
		String sql="update users set flag=0";
		Statement stmt=con.createStatement();
		int noofrowschanged=stmt.executeUpdate(sql);
		System.out.println("No of Rows Updated...:"+noofrowschanged);
	}

}
