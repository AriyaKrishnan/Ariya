package utilpack;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo1 {
	public static void main(String[] args) {
		Queue<String>qr=new PriorityQueue<String>();
		qr.add("Aaa");
		qr.add("Fff");
		qr.add("Ccc");
		qr.add("Ggg");
		System.out.println("Print"+qr);
		qr.remove("Fff");
		System.out.println(qr);
		System.out.println(qr.element());
		System.out.println(qr.peek());
		System.out.println(qr.remove("Ggg"));
		System.out.println(qr);
		System.out.println("Poll..:"+qr.poll());
		System.out.println(qr);
		qr.add("Aaa");
		qr.add("Fff");
		System.out.println(qr);
		System.out.println(qr.size());
		System.out.println(qr.offer("Ddd"));
		System.out.println(qr);
		
		
		
	}

}
