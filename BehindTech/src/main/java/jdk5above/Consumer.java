package jdk5above;

import java.lang.reflect.Method;

public class Consumer {
	public static void main(String[] args) throws Exception {
		Food food = new Food();
//		Veg veg = food.getClass().getAnnotation(Veg.class);
//		if(veg==null) {
//			System.out.println("is Non Vegetatian Food");
//		}
//		else {
//			System.out.println("is a Vegetarian Food");
//					
//		}
		Method m=food.getClass().getMethod("rice");
		Veg veg = m.getAnnotation(Veg.class);
		if(veg==null){
			System.out.println("Rice is Non Vegetarian Food");
			
			
		}
		else {
			System.out.println("Rice is Vegetarian food");
		}
		}

}
