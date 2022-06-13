package interjava;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo1 {
	public static void main(String[] args) {
		System.out.println("SOUP...");
		ExecutorService es = Executors.newFixedThreadPool(1);
		es.execute(()->{met();});
		es.shutdown();
		System.out.println("STARTER...");
	}
	public static void met() {
		try {Thread.sleep(5000);}catch(Exception e) {}
		System.out.println("MAIN DISH...");
		
	}

}
