package collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetWithStrings {

	public static void main(String[] args) {
		ReverseAlphabeticalOrderComparator r1=new ReverseAlphabeticalOrderComparator();
		
		
Set<String> s1=new TreeSet<String>(r1);
		
		s1.add("bhavani");
		s1.add("dileep");
		s1.add("kalyani");
		s1.add("suman");
		s1.add("veda");
		s1.add("lakshmi");
		
		Iterator<String> i1=s1.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}

}
