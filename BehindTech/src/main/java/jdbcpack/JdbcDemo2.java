package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JdbcDemo2 {
		public static void main(String[] args) throws Exception{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/behindtech","root","root");
			
			System.out.println(con);
			String sql="update users set flag=? where uid=?";
			PreparedStatement stmt=con.prepareStatement(sql);
			stmt.setInt(1, 1);
			stmt.setInt(2, 5);
			int noofrowschanged=stmt.executeUpdate();
			
			System.out.println("No of Rows Updated...:"+noofrowschanged);
		}
	}


