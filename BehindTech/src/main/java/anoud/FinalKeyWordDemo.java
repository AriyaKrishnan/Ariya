package anoud;

public class FinalKeyWordDemo {

	public static void main(String[] args) {
		FinCla fc = new FinCla();
		//fc.x=30;//final variables are constant
		fc.s = 100;

	}

}
final class FinCla{
	final int x=100;//constant
	int s = 10;
	final void met() {
		
	}
	final void met(int i) {
		
	}
}
class SubFinCla extends FinCla{//final class cannot be inherited
	//void met() { Final method cannot be overridden
	//}	
	}
	

