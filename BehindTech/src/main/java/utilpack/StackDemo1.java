package utilpack;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo1 {
	public static void main(String[] args) {
		Stack<Integer>st=new Stack<Integer>();
		st.push(10);
		st.push(20);
		st.push(40);
		st.push(60);
		System.out.println(st);
		System.out.println("After pop...:"+st.pop());
		
		
		
		System.out.println(st.peek());
		System.out.println(st.size());
		System.out.println(st.isEmpty());
		System.out.println("_______________");
		Iterator iterator=st.iterator();
		while (iterator.hasNext()){
		System.out.println(iterator.next());
	}
	}
}


