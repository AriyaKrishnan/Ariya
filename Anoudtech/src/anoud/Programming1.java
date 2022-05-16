package anoud;

public class Programming1 {
	public static void main(String[] args) {
		
		String result=(4%2==0)?"Even Number ...":"Odd Number...";
		String result1=(5%2==0)?"Even Number ...":"Odd Number...";
		System.out.println(result);
		System.out.println(result1);
		System.out.println((10<20)?"yes it is lesser than 20":"no it is not lesser than 20");
		System.out.println((10>20)?"yes it is lesser than 20":"no it is not lesser than 20");
		
		if(3%2==0) {
			System.out.println("Even number...");
		}
		else {
			System.out.println("Odd number....");
		}
		String name="johny";
		if(name.equals("riya")) {
			System.out.println("Your name is Riya....");
		}
		else if(name.equals("ram")) {
			System.out.println("Your name is Ram....");
		}
		else if(name.equals("john")) {
			System.out.println("Your name is John....");
		}
		else {
			System.out.println("Name not found....");
		}
	}
}