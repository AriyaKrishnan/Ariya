package utilpack;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class ColDemo8 {

	public static void main(String[] args) {
		//Map<String,String>map=new WeakHashMap<String,String>();
		Map<String,String>map=new HashMap<String,String>();
		
		String key1=new String("a1000");
		String key2=new String("a2000");
		String key3=new String("a3000");
		
		map.put(key1, "Behind Force");
		map.put(key2, "Anoud Tech");
		map.put(key3, "QIC");
		
		System.out.println(map);
		key1=null;
		System.out.println(map);
		System.gc();
		System.out.println(map);
		

	}

}
