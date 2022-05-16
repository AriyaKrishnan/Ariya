package anoud;
import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = reader.nextInt();
		if(num % 2 ==0)
		
		System.out.println(num +" is Even");
		
		else
		System.out.println(num +"is Odd");
			
		

	}

}
