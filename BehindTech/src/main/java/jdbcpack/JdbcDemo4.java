package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo4 {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/behindtech","root","root");
		
		System.out.println(con);
		String sql="select * from users";
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(rs.getInt("Uid")+" | "+rs.getString("uname")+" | "+rs.getString("city"));
		}
		

}
}
