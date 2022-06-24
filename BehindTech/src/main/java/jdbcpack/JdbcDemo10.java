package jdbcpack;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class JdbcDemo10 {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/behindtech","root","root");
		
		System.out.println(con);
String sql="{call proc3(?,?)}";
		
		CallableStatement cs=con.prepareCall(sql);
		cs.setString(1, "Nandhu");
		cs.registerOutParameter(2, Types.INTEGER);
		
		cs.execute();
		
		int flag=cs.getInt(2);
		System.out.println("Flag Status..:"+flag);
		
		

}
}
