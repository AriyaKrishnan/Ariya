package anoud;
import java.util.Scanner;
public class WhileloopDemo {

	public static void main(String[] args) {
		int Number, Sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter any integer Value below 10: ");
		Number =sc.nextInt();
		
		while (Number <= 10) {
			Sum = Sum + Number;
			Number++;
		}
		System.out.format("Sum of the Numbers From the While Loop is: %d",Sum);
		
			
		}
		

	}


