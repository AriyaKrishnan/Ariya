package anoud;

public class StaticComplexType {

	public static void main(String[] args) {
		Classroom newton = new Classroom();
		Classroom edision = new Classroom();
		System.out.println(newton.sanyo+":"+newton.sulab);
		System.out.println(edision.sanyo+":"+edision.sulab);
		
	}
	}
		
		class Classroom{
			Projector sanyo =new Projector();
			 static Toilet sulab = new Toilet();
			
		
	

}
		class Projector{
		
		}
		class Toilet{
		
		}