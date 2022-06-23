package jdk5above;

interface Genric{
	
}
class Fruit {
	
}
class Melon extends Fruit implements Genric{
	
}
class Berry extends Fruit implements Genric{
	
}
class Apple extends Fruit {
	
}

class MyGeneric<T extends Genric> {
	
}
public class GenericDemo3 {
	 public static void main(String[] args) {
	        MyGeneric<Melon> a;
	        MyGeneric<Berry> b;
	        
	        // can't make MyGeneric of Apple
	        //  MyGeneric<Apple> c;  
	    }
	}


