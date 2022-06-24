package jdbcpack;
import java.sql.Connection;
import java.sql.DriverManager;
	public class JdbcDemo {
		public static void main(String[] args) throws Exception{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/behindtech","root","root");
			
			System.out.println(con);
			
		
	}
	}
	


