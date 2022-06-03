package anoud;

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		MethodOverloadingDemo obj=new MethodOverloadingDemo();
		obj.met(12,10);
	
	}
	public void met(int i,int j) {
		System.out.println("int param met method called..");
		
	}
	int met() {
		System.out.println("No param met method called..");
		return 1;
	}
	void met(float f) {
		System.out.println("Float param method called..");
	}
	

}
