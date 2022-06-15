package jdk5above;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo1 {

	public static void main(String[] args)throws Exception {
		Politician diamond=new Politician();
		PoliceStation p1=new PoliceStation();
		Barber barber=new Barber();
		p1.arrest(diamond);		

	}

}
class PoliceStation{
	public void arrest(Object obj) throws Exception{
		Class c=obj.getClass();
		Field f=c.getField("name");
		System.out.println(f.get(obj));
		
		Method m =c.getMethod("service");
		m.invoke(obj);
		singamIntrogation(obj);
		
	}
	public void singamIntrogation(Object obj)throws Exception{
		Class c=obj.getClass();
		Field f=c.getDeclaredField("secretName");
		f.setAccessible(true);
		System.out.println(f.get(obj));
		
		Method m=c.getDeclaredMethod("secretService");
		m.setAccessible(true);
		m.invoke(obj);
		
	}
	
}
class Barber{
	public String name="I am a good Barber...";
	private String secretName="I am a Non Imcometax Payer...";
	
}
class Politician{
	public String name="I am a good Man...";
	private String secretName="I am a Theif...";
	
	public void service() {
		System.out.println("I do Social Service...");
		
	}
	private void secretService() {
		System.out.println("I does Nothing...");
	}
	
	
}