package revision;

public class Class3 {
	public static void main(String[] args) {
		Bank bk=new Bank();
		boolean b=bk.depositCash(2000);
		long l=bk.getMoney();
		String s=bk.getName();
		System.out.println(b);
		System.out.println(l);
		System.out.println(s);
	}

}
class Bank{
	
	boolean depositCash(int amt) {
	
		if(amt>1000) {
			return true;
		
		}else {
			return false;
			
		}
		
	}
	long getMoney() {
		return 10L;
		
	}
	String getName() {
		return "ram";
	}
}
