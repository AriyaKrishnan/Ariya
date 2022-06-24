package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class JdbcDemo6 {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/behindtech","root","root");
		
		System.out.println(con);
		String sql="select * from users where uname=?";
		PreparedStatement stmt=con.prepareStatement(sql);
		stmt.setString(1, "Nandhu");
		ResultSet rs=stmt.executeQuery();
		
		ResultSetMetaData rsmd=rs.getMetaData();
		int colcount=rsmd.getColumnCount();
		for(int i=1;i<=colcount;i++) {
			System.out.println(rsmd.getColumnName(i)+"\t");
			
		}
		System.out.println("\n==============================\n");
		
		if(rs.next()) {
			for(int i=1;i<=colcount;i++) {
				System.out.println(rs.getString(i)+"\t");
			}
		


}
	}
}
