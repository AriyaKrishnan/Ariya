package anoud;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		System.out.println("Before Exception");
		try {
			int i=1/0;
		}catch(ArithmeticException e) {
			System.out.println(e);
			new Handler().handle(e);

		}
		System.out.println("After Exception");
	}
}

class Handler{
	public void handle(ArithmeticException ae) {
		System.out.println("Please dont Divide the Number by Zero");
	}
}
