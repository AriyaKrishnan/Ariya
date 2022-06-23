package iopack;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class FileDemo2 {
	
		public static void main(String[] args) {
			URLConnection urlcon=null;
			//urlcon.getInputStream();
			try {
			URL url=new URL("http://www.google.com/index.html");
			 urlcon=url.openConnection();
			}catch(Exception e) {
				e.printStackTrace();
			}
			//try with resources...
			try(
					
					BufferedInputStream fis=new BufferedInputStream(urlcon.getInputStream());
					FileOutputStream fos=new FileOutputStream("newfilebyte.html");
				){		
				
			byte[] b=new byte[128];
			int bytesread=0;
			while((bytesread=fis.read(b))!=-1) {
				//String s=new  String(b,0,bytesread);
				fos.write(b,0, bytesread);
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

}
