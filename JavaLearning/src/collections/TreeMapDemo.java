package collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class TreeMapDemo {

	public static void main(String[] args) {
		
		ReverseAlphabeticalOrderComparator r1=new ReverseAlphabeticalOrderComparator();
		Map<String,Object> m1=new TreeMap<String,Object>(r1);
      
      m1.put("bhavani", "kalyani");
      m1.put("dileep", "bhavani");
      m1.put("kalyani", "Veda");
      m1.put("veda", 100);
      m1.put("harsha", 120);
      m1.put("babu", "lakshmi");
      
      Set<Entry<String,Object>> s1= m1.entrySet();
      
	  Iterator<Entry<String,Object>> i1=s1.iterator();
	  
	  while(i1.hasNext())
	  {
		  Entry<String,Object> e1=i1.next();
		  System.out.println(e1.getKey()+"-----"+e1.getValue());
	  }
	}

}
