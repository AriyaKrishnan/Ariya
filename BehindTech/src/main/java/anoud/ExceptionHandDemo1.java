package anoud;

public class ExceptionHandDemo1 {
	public static void main(String[] args) {// throws Exception {
		Race race=new Race();
		System.out.println("race started.....");
		//race.driveBike(150);
		try {
			race.driveBike(150);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("race finished...");
		
		
	}
}
class Race{
	public void driveBike(int speed) throws Exception{
		if(speed>100) {
			throw new Exception();
		}
	}
}
	
