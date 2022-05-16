package anoud;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
					System.out.println("Enter the Radius:");
			double radius = scanner.nextDouble();
			double area = Math.PI*(radius*radius);
			System.out.println("The Area of Circle is:" + area);
			double circumference=Math.PI* 2*radius;
			System.out.println("The circumference of the Circle is:"+circumference);
		

	}

}
