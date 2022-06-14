package interjava;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo3 {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(()->{
			synchronized(Theatre.class) {
			Thread.currentThread().setName("Kamal");
			Theatre.toilet.useToilet();
			}
		});
		es.execute(()->{
			synchronized(Theatre.class) {
			Thread.currentThread().setName("Rajini");
			Theatre.toilet.useToilet();
			}
		});
		es.shutdown();
	}

}
class Toilet{
	public void useToilet() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" is Using the Toilet...");
		try {Thread.sleep(5000);}catch(Exception e) {}
		System.out.println(name+" Came Out of the Toilet...");
		
	}
}
class Theatre{
	static Toilet toilet=new Toilet();
}
