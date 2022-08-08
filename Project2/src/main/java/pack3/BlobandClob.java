package pack3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.Reader;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class BlobandClob {
	public static void main(String args[]) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/behindtech", "root", "root");
		System.out.println("Entered.");
		String query = "insert into images(name, article, image) values (?, ?, ?)";
		PreparedStatement pstmt = con.prepareStatement(query);

		pstmt.setString(1, "Footer1");
		FileReader fileReader = new FileReader("C:/Images/Footer1.txt");
		pstmt.setClob(2, fileReader);
		InputStream inputStream = new FileInputStream("C:/Images/Footer1.png");
		pstmt.setBlob(3, inputStream);
		pstmt.execute();
		System.out.println("Record inserted......");
		// Retrieving the results
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * from images");
				while (rs.next()) {
					String name = rs.getString("name");
					Clob clob = rs.getClob("article");
					Blob blob = rs.getBlob("image");
					System.out.println("Name: " + name);
					System.out.println("Clob value: " + clob);
					System.out.println("Blob value: " + blob);
					System.out.println("");
					System.out.print("Clob data is stored at: ");
					// Storing clob to a file
					int i, j = 0;
					Reader r = clob.getCharacterStream();
					String filePath = "C:/output/" + name + "Header1.txt";
					FileWriter writer = new FileWriter(filePath);
					while ((i = r.read()) != -1) {
						writer.write(i);
					}
					writer.close();
					System.out.println(filePath);
					j++;
					System.out.print("Blob data is stored at: ");
					InputStream is = blob.getBinaryStream();
					byte byteArray[] = new byte[is.available()];
					is.read(byteArray);
					filePath = "C:/output/" + name + "Header1.png";
					FileOutputStream outPutStream = new FileOutputStream(filePath);
					outPutStream.write(byteArray);
					System.out.println(filePath);
				}
	}

}
