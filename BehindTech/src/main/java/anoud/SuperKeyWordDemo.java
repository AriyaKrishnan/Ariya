package anoud;

public class SuperKeyWordDemo {

	public static void main(String[] args) {
		Four4 F4 = new Four4();
		F4.MetOne();
		

	}

}
abstract class One1{
	public void MetOne() {
		System.out.println("MetOne called One1");
	}
}
abstract class Two2 extends One1{
	public void MetOne() {
		super.MetOne();
		System.out.println("MetOne called Two2");
	}
	
}
abstract class Three3 extends Two2{
	final public void MetOne() {
		super.MetOne();
		System.out.println("MetOne called Three3");
	}
}
class Four4 extends Three3{
	
}
