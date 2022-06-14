package interjava;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo5 {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		Theatree iMax=new Theatree();
		Theatree iMax2=new Theatree();
		es.execute(()->{
			//synchronized(Theatree.class) {
			synchronized(iMax) {
				Thread.currentThread().setName("Rajini");
				iMax.toilet.useToilett();
			}
		});
		es.execute(()->{
			//synchronized(Theatree.class) {
			synchronized(iMax2) {
				Thread.currentThread().setName("Kamal");
				iMax2.toilet.useToilett();
			}
		});
		es.shutdown();
		
	}

}
class Toilett{
	public void useToilett() {
		Thread t = Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" is using the Toilet");
		try {Thread.sleep(5000);}catch(Exception e) {}
		System.out.println(name+" came out of the Toilet");
		
	}
}
class Theatree{
	Toilett toilet=new Toilett();
	
}

