package collections;


import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
	
		
		//Map<Object,Object> m1=new HashMap<Object,Object>();
		Map<Object,Object> m1=new LinkedHashMap<Object,Object>();
		
		m1.put(37,40);
		m1.put("bhavani", 35);
		m1.put(5, "dileep");
		m1.put("dileep","bhavani");
		m1.put("kalyani", 45);
		m1.put(0, 23);
		
		Set<Entry<Object,Object>> s1=m1.entrySet();
		
		Iterator<Entry<Object,Object>> i1 = s1.iterator();
		
		while(i1.hasNext())
		{
			Entry<Object,Object> e1=i1.next();
			
			System.out.println(e1.getKey()+"---"+e1.getValue());
		}
	}

}
