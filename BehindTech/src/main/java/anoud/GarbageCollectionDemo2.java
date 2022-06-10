package anoud;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class GarbageCollectionDemo2 {
	
	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		System.out.println("Maximum Memory.."+r.maxMemory());
		System.out.println("Available processors.."+r.availableProcessors());
		System.out.println("Free Memory.."+r.freeMemory());
		r.gc();
		Food food = new Food();
		System.out.println("Free Memory.."+r.freeMemory());
		//SoftReference soft = new SoftReference(food);
		WeakReference weak = new WeakReference(food);
		food = null;
		r.gc();
		System.out.println("Free Memory.."+r.freeMemory());
		//food =(Food)soft.get();
		food =(Food)weak.get();
		System.out.println(food);
		

	}

}
class Food{
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize for the Food Object called...:");
	}
}