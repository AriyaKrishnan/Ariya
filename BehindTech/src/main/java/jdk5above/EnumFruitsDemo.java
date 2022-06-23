package jdk5above;

public class EnumFruitsDemo {
	public static void main(String[] args) {
		System.out.println(Fruits.apple.colors);
		met(Fruits.mango);
		System.out.println(Fruits.valueOf("apple").colors);
		for(Fruits f:Fruits.values()) {
			System.out.println(f.colors);
			
		}
		Fruits f=Fruits.orange;
		switch(f) {
		case apple:{
			System.out.println("Tis is Red Apple");
			break;
		}
		case orange:{
			System.out.println("Tis is Orange Orange");
			break;
		}
		case pineapple:{
			System.out.println("Tis is Pine Pineapple");
			break;
		}
		default:{
			System.out.println("This is Default....");
		}
		}
		
	}
	public static void met(Fruits fruit) {
		System.out.println(fruit);
	}
	

}
