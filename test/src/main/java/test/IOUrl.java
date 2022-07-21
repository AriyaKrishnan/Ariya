package test;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class IOUrl {
	public static void main(String[] args) {
		URLConnection urlcon=null;
		try {
			URL url=new URL("http://www.google.com/index.html");
			urlcon=url.openConnection();
		}catch(Exception e){
			e.printStackTrace();
		}
		try(
				BufferedReader fis=new BufferedReader(new InputStreamReader(urlcon.getInputStream()));
				FileWriter fos=new FileWriter("newfilebyte.html");
				){
			char[] b=new char[128];
			int bytesread=0;
			while((bytesread=fis.read(b))!=-1) {
				
				fos.write(b,0,bytesread);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
				
	}

}
