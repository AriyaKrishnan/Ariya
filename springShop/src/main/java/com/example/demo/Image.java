package com.example.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Image {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/behindtech", "root", "root");
			System.out.println(con);
			String qury = "insert into Cooldrinks values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(qury);
			ps.setString(1, "7Up");
			FileInputStream fis = new FileInputStream("C:\\Users\\Ariya.Ramakrishnan\\Downloads\\7Up.png");
			ps.setBinaryStream(3, fis, fis.available());
			ps.setString(2, "50");
			int a = ps.executeUpdate();
			System.out.println(a);
		} catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
		}
	}

}
