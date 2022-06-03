package anoud;
class X{
	void callme() {
		System.out.println("Inside X's callme method");
	}
}
class Y extends X{
	void callme() {
		System.out.println("Inside Y's callme method");
	}
}
class Z extends Y{
	void callme() {
		System.out.println("Inside Z's callme method");
	}
}


public class Dispatch {
public static void main(String[] args) {
	X a = new X();
	Y b = new Y();
	Z c = new Z();
	X r;
	
	r = a;
	r.callme();
	r = b;
	r.callme();
	r = c;
	r.callme();
}
}
