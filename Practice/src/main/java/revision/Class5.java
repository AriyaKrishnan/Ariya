package revision;

public class Class5 {
	public Class5() {
		System.out.println("cons with default called...");
		}
	public Class5(int i) {
		System.out.println("cons with i value called..");
		
	}
	public Class5(Employee e) {
		System.out.println("employee cons called..");
		
	}
	public static void main(String[] args) {
		new Class5();
		new Class5(20);
		new Class5(new Employee());
	}

}
class Employee{
	
}
