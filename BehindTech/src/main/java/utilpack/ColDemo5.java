package utilpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class ColDemo5 {

	public static void main(String[] args) {
		List<Student>list=new ArrayList<Student>();
		list.add(new Student("ramu"));
		list.add(new Student("raju"));
		list.add(new Student("somu"));
		list.add(new Student("damu"));
		System.out.println("Before Sorting...:"+list);
		Collections.sort(list,new MyComparator());
		System.out.println("After Sorting Descending...:"+list);
		Collections.sort(list);
		System.out.println("After Sorting Ascending...:"+list);
		
		HashSet<Student>hs=new HashSet<Student>(list);
		System.out.println(hs);
		
		TreeSet<Student>ts=new TreeSet<Student>(new MyComparator());
		ts.addAll(hs);
		System.out.println(ts);

	}

}
class MyComparator implements Comparator<Student>{
	@Override
	public int compare(Student obj1, Student obj2) {
		return obj2.compareTo(obj1);
	}
	
}
class Student implements Comparable<Student>{
	String name;
	public Student(String name) {
		this.name=name;
		
	}
	@Override
	public String toString() {
		
		return this.name;
	}
	@Override
	public int compareTo(Student obj) {
		
		return this.name.compareTo(obj.name);
	}
}
