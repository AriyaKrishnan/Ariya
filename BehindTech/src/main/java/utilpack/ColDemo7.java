package utilpack;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ColDemo7 {

	public static void main(String[] args) {
		Properties prop=new Properties();
		
		prop.put("a100", "Java");
		prop.put("a200", "Oracle");
		prop.put("a300", "Borland");
		prop.put("a400", "Python");
		System.out.println(prop);
		
		System.out.println(prop.get("a200"));
		Set s=prop.entrySet();
		Iterator iter=s.iterator();
		while(iter.hasNext()) {
			Map.Entry me=(Map.Entry)iter.next();
			System.out.println(me.getKey()+":"+me.getValue());
		}

	}

}
