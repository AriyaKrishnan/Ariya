package utilpack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ColDemo {
	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		System.out.println("Original Size..:"+list.size());
		list.add("ddd");
		System.out.println("Modified Add..:"+list.size());
		list.remove(0);
		System.out.println("Modified Remove..:"+list.size());
		
		System.out.println("___________________________");
		
		System.out.println(list.get(1));
		System.out.println("___________________________");
		System.out.println(list);
		System.out.println("___________________________");
		
		for(String s:list) {
			System.out.println(s);
		}
		System.out.println("___________________________");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("___________________________");
		Iterator<String>iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
			
		}
		System.out.println("___________________________");
		ListIterator<String>lit=list.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
		
		}
		System.out.println("___________________________");
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		
			
	}
}
	


