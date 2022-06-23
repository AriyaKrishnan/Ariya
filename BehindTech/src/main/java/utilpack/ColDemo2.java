package utilpack;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class ColDemo2 {
	public static void main(String[] args) {
		Set<String>hs=new HashSet<String>();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		System.out.println("Size..:"+hs.size());
		System.out.println(hs);
		hs.remove("A");
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains("B"));
		System.out.println();
		hs.forEach(new MyConsumer());
		System.out.println();
		hs.forEach(ColDemo2::print);
		System.out.println();
		hs.forEach((s)->{System.out.println(s);});
		System.out.println();
		hs.forEach(System.out::println);
		
		Iterator<String>it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		
	}
	static void print(String s) {
		System.out.println(s);
	}

}
class MyConsumer implements Consumer<String>{
	@Override
	public void accept(String s) {
		System.out.println(s);
		
		
	}
	
}
