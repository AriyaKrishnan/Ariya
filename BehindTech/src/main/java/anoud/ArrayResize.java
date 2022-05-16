package anoud;
import java.util.ArrayList;
import java.util.List;
public class ArrayResize {

	public static void main(String[] args) {
	int arr[]= new int[] {10,12,14,16,18,20};
	for (int a :arr) {
		
		System.out.println(a);
	}
	List<Integer>List = new ArrayList<>();
	for(int a: arr) {
		List.add(a);
	}
	System.out.println("\n" +List);
	List.add(100);
	System.out.println(List);
	
	}

}
