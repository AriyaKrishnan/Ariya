package dbConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class DBConnection {
	public DBConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public boolean checkUser(String uname, String upass) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/behindtech", "root", "root");
			PreparedStatement ps = con.prepareStatement("Select * from details Where uname=? and upass=?");
			ps.setString(1, uname);
			ps.setString(2, upass);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean checkFlag(String uname) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/behindtech", "root", "root");
			PreparedStatement ps = con.prepareStatement("Select flag from details Where uname=?");
			ps.setString(1, uname);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				int flag = rs.getInt(1);
				if (flag == 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean updateFlag(String uname, int flag) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/behindtech", "root", "root");
			PreparedStatement ps = con.prepareStatement("update details set flag=? where uname=?");
			ps.setInt(1, flag);
			ps.setString(2, uname);
			int i=ps.executeUpdate();
			if(i!=0) {
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
public boolean registerUser(UserDTO user) {
	try {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/behindtech", "root", "root");
		PreparedStatement ps = con.prepareStatement("Insert into details values(?,?,?,?,?,?");
		
		ps.setString(1, user.getUname());
		ps.setString(1, user.getUpass());
		
		
		ps.setInt(1, user.getFlag());
		ResultSet rs = ps.executeQuery();
		int i=ps.executeUpdate();
		if(i>0) {
			return true;
		}else {
			return false;
		}
	} catch (Exception e) {
		e.printStackTrace();
		return false;
	}
}
	public static void main(String[] args) {
		DBConnection dbcon = new DBConnection();
		
	}
	}



