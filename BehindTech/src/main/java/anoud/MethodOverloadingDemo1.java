package anoud;

public class MethodOverloadingDemo1 {

	public static void main(String[] args) {
		Dog Tiger=new Dog();
		Tiger.play(new Stick());

	}

}
class Dog{
	public void play(Biscuit b) {
		System.out.println("Tiger Vaalattum..");
	}
	public void play(Stick s) {
		System.out.println("Tiger Odi Pogum..");
	}
	public void play(Stone s) {
		System.out.println("Tiger Kadikkum..");
	}
}
class Biscuit{

}
class Stick{
	
}
class Stone{
	
}