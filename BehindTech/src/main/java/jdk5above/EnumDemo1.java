package jdk5above;

public class EnumDemo1 {
	public static void main(String[] args) {
		Days day=Days.TUESDAY;
		System.out.println(day);
		
	}
	enum Days{
		MONDAY,TUESDAY,WEDNESDAY;
	}
	

}
