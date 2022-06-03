package anoud;

public class InheritanceDemo5 {

	public static void main(String[] args) {
		School highschool = new MathsBiology();
		System.out.println("Total Strength of MathsBiology..: "+highschool.total());
		highschool = new ComputerScience(highschool);
		System.out.println("Total Strength of MathsBiology and Computer Science..: "+highschool.total());
		School myscl = new ComputerScience(new History());
		System.out.println("Total Strength of Computer Science and History Department..: "+myscl.total());
		

	}

}
abstract class School{
	public abstract int total();
	}

abstract class HSC extends School{
	
}
class MathsBiology extends HSC{
	School scl;
	public MathsBiology() {
		
	}
	@Override
	public int total() {
		if(scl==null) {
		return 30;
	}
		else {
		return 30+scl.total();
		}
	}
	
}
class ComputerScience extends HSC{
	School scl;
	public ComputerScience() {
		
	}
	public ComputerScience(School scl) {
		this.scl=scl;
	}
	@Override
	public int total() {
		if(scl==null) {
		return 35;
	}
		else {
		return 35+scl.total();
		}
	}
	
	
}
class History extends HSC{
	School scl;
	public History() {
		
	}
	public History(School scl) {
		this.scl=scl;
	}
	@Override
	public int total() {
		if(scl==null) {
		return 36;
	}
		else {
		return 36+scl.total();
	}
}
	
}
