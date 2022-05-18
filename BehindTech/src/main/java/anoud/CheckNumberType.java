package anoud;
import java.util.Scanner;
public class CheckNumberType {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter a Number of Max 9 digits :");
		int num = Input.nextInt();
		System.out.println("Enter Your Choice  : ");
		int a = Input.nextInt();
		switch(a)
		{
		case 1:
			int n = num;
			int res = 0,remainder;
			while(num>0) {
				remainder = num % 10;
				res = res+(remainder*remainder*remainder);
				num = num/10;
			}
			if(res==n)
				System.out.println(n+" is a Amstrong Number");
			else
				System.out.println(n+" is not a Amstrong Number");
			break;
		case 2:
			int k =num;
			int reverse = 0,rem;
			while(num>0)
			{
				rem = num%10;
				reverse = reverse*10+rem;
				num= num/10;
			}
			if(reverse==k)
				System.out.println(k+"Palindrome number");
			else
				System.out.println(k+"Not a Palindrome number");
			break;
		case 3:
			int PerfectNo = 0;
			int i;
			System.out.println("Factors are :");
			for(i=1;i<num;i++)
			{
				if (num%i==0)
				{
					PerfectNo+=i;
					System.out.println(i);
				}
			}
			if(PerfectNo==num)
				
			{
				System.out.println("Number is Perfect Number..");
			}
			else
			{
				System.out.println("Number is not a Perfect Number..");
			}
			default :
				System.out.println("None of this..");
				
				
				}
				
					
			}
		
		
		
		

	}


