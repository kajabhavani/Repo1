package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.LinkedHashSet;

public class SetDemo {

	public static void main(String[] args) {
		 
	//Set<Object> s1 = new HashSet<Object>();
		Set<Object> s1 = new LinkedHashSet<Object>();
      
	s1.add(90);
	s1.add("bhavani");
	s1.add(120);
	s1.add("dileep");
	s1.add(80);
	s1.add(150);
	s1.add("bhavani");

	
	Iterator<Object> i1=s1.iterator();
	
	while(i1.hasNext())
	{
		System.out.println(i1.next());
	}
	
	}

}
