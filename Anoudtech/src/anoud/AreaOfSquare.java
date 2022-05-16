package anoud;
import java.util.Scanner;
public class AreaOfSquare {

	public static void main(String[] args) {
		System.out.println("Enter the Side of Square:");
		Scanner scanner = new Scanner(System.in);
		double side = scanner.nextDouble();
		double area =side*side;
		System.out.println("Area of Square is:" +area);

	}

}
