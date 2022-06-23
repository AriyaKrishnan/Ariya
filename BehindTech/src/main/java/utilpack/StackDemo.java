package utilpack;
import java.util.Stack;


public class StackDemo {
	
	  public static void main(String[] args) {
	    Stack<Integer> s = new Stack<Integer>();
	    s.push(10);
	    s.push(20);
	    s.push(30);
	    s.push(40);
	    s.push(50);
	    
	    System.out.println("Elements in stack: " + s);
	    int x = s.pop();
	    System.out.println("Element removed from stack: " + x);
	    
	    x = s.pop();
	    System.out.println("Element removed from stack: " + x);
	  }
	}


