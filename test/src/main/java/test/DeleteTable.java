package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DeleteTable {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "root");
		
		Statement st = con.createStatement();
		String crt = "delete from users where uname=?";
		PreparedStatement stmt = con.prepareStatement(crt);
		stmt.setString(1, "Anu");
		int rs = stmt.executeUpdate();
		
		System.out.println("table deleted...");
	}

}
