package anoud;
import static java.lang.Float.sum;  
import java.util.Scanner; 
public class AvgOfN {

	public static void main(String[] args) {
		
		      int n, count = 1;   
		      float  xF, averageF, sumF = 0;   
		      Scanner sc = new Scanner(System.in);     
		      System.out.println("Enter the value of N : ");  
		      n = sc.nextInt();  
		      while (count <= n)   
		             {   
		                  System.out.println("Enter the "+count+" Number: ");  
		                  xF = sc.nextInt();  
		                  sumF += xF;   
		                  ++count;   
		             }   
		                  averageF = sumF/n;   
		        System.out.println("The Average Value is"+averageF);  
		    }    
		 

	}


