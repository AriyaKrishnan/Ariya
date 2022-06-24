package jdbcpack;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.Statement;


public class JdbcDemo7 {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/behindtech","root","root");
		
		System.out.println(con);
		DatabaseMetaData dbmd=con.getMetaData();
		System.out.println(dbmd.getDatabaseProductName());
		System.out.println(dbmd.getDatabaseProductVersion());
		
		System.out.println(dbmd.getUserName());
		
	}
		
	}


