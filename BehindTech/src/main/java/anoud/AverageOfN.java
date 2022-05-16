package anoud;

public class AverageOfN {

	public static void main(String[] args) {
		int n =10,result = 0;
		int a[]= new int[10];
		a[0]=1;
		a[1]=3;
		a[2]=5;
		a[3]=7;
		a[4]=8;
		a[5]=9;
		a[6]=10;
		a[7]=12;
		a[8]=14;
		a[9]=16;
		for(int i=0;i<n;i++)
			result=result+a[i];
		System.out.println("Average of ("+a[0]+","+a[1]+","+a[2]+","+a[4]+","+a[5]+","+a[6]+","+a[7]+","+a[8]+","+a[9]+")is = " +result/n);
		

	}

}
