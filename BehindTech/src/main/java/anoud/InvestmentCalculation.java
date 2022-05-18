package anoud;

public class InvestmentCalculation {

	public static void main(String[] args) {
		float total = 14000;
		System.out.println("Initial investment : $"+total);
		total = total+(total+.12f);
		System.out.println("After One Year : $"+total);
		total =total-1500f;
		System.out.println("After Two Years : $"+total);
		total = total+(total+.12f);
		System.out.println("After Three Years : $"+total);
	}

}
