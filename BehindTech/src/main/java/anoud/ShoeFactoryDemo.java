package anoud;

public class ShoeFactoryDemo  implements ShoeManufacturer1 {

	public static void main(String[] args) {
		Shoe1.shoebrand();
		SalesMan.delivershoes();
		ShoeShop1.sellshoe();

	}

}
class ShoeFactory1{
	static void makeshoe() {
		
		System.out.println("Shoes are Manufactured here....");
		
}
}
class ShoeShop1{
	
	static void sellshoe() {
		Customer1.buyshoe();
		ShoeFactory1.makeshoe();
	System.out.println("--This is Shoe Shop--");	
	}
}

class Customer1{
	static void buyshoe() {
		
		System.out.println("Customer wants Leather shoes...");
	}
}
class Shoe1{
	static void shoebrand() {
		String name = "VKC"	;
		System.out.println("This is "+ name +" Shoes...");
	}
}
class SalesMan{
	static void delivershoes() {
		System.out.println("Salesman delivers shoes to the customer....");
	}
}
interface ShoeManufacturer1{
	
}

