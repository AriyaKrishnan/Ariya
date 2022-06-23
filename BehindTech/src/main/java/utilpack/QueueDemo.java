package utilpack;
import java.util.LinkedList;
import java.util.Queue;
public class QueueDemo {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer> ();
		q.add(785);
        q.add(356);
        q.add(527);
        q.add(743);
  
        
        System.out.println("Queue: " + q);
  
        System.out.println("Queue's head: " + q.remove());
        System.out.println("Queue after Remove: " + q);
  
        
        System.out.println("Queue's head: " + q.remove());
    }
}
	
