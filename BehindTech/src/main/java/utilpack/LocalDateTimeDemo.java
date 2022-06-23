package utilpack;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class LocalDateTimeDemo {
	public static void main(String[] args) {
		Date dt=new Date();
		 DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss a");
		 LocalDateTime now = LocalDateTime.now();
		 String dateTimeString = now.format(formatter);
		 
		 System.out.println(dateTimeString);
		  
		    Scanner in = new Scanner(System.in);
	        System.out.print("Please Enter speed: ");
	        int speed = in.nextInt();
	        System.out.print("Please Enter distance: ");
	        int distance = in.nextInt();
	        float time = (float)distance / speed;
	        System.out.println("Your time is: " + time);
	
	
	}
}


