package interjava;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo4 {
	
		public static void main(String[] args) {
			//can also use pool(2)
			ExecutorService es = Executors.newFixedThreadPool(1);
			es.execute(()->{met1();});
			es.execute(()->{met2();});
			es.shutdown();
			
		}
		public static void met1() {
			System.out.println("Kit In");
			try {Thread.sleep(5000);}catch(Exception e) {}
			System.out.println("Kit Out");
		}
		public static void met2() {
			System.out.println("Kat In");
			try {Thread.sleep(5000);}catch(Exception e) {}
			System.out.println("Kat Out");
			
		

	}
}


