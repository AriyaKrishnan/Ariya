package anoud;

public class OperatorsDemo {
	public static void main(String[] args) {
		
		int n1=10;
		int n2=2;
		
		System.out.println(n1+n2);
		
		System.out.println(n1-n2);
		
		System.out.println(n1*n2);
		
		System.out.println(n1/n2);
		
		System.out.println(n1%n2);
		
		
		int i=n1++;
		i=++n1;
		System.out.println(i);
		
		int x=20;
		
		System.out.println(x++);
		System.out.println(x);
		
		x=20;
		System.out.println(x--);
		System.out.println(x);
		
		x=20;
		
		System.out.println(++x);
		System.out.println(x);
		
		x=20;
		System.out.println(--x);
		System.out.println(x);
		
		x=20;
		
		x+=4;
		System.out.println(x);
		
		x=20;
		
		x-=5;
		System.out.println(x);
		
		x=20;
		
		x*=2;
		System.out.println(x);
		
		x=20;
		
		x/=3;
		System.out.println(x);
		
		x=20;
		
		x%=3;
		System.out.println(x);
		
		
		
		
		int num1=100;
		int num2=200;
		System.out.println(num1==num2);
		System.out.println(num1!=num2);
		System.out.println(num1<num2);
		System.out.println(num1>num2);
		System.out.println(num1<=num2);
		System.out.println(num1>=num2);
		
		System.out.println(!(num1>=num2));
		
		
		System.out.println(num1<num2 || num1==100);
		System.out.println(num1<num2 || num1==101);
		
        System.out.println(num1<num2 && num1==100);
        System.out.println(num1<num2 && num1==101);
	}
}