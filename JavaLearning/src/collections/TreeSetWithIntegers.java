package collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetWithIntegers {

	public static void main(String[] args) {
		
		DescendingOrderComparator d1=new DescendingOrderComparator();
		
		Set<Integer> s1=new TreeSet<Integer>(d1);
		
		s1.add(30);
		s1.add(15);
		s1.add(4);
		s1.add(75);
		s1.add(12);
		s1.add(68);
		
		Iterator<Integer> i1=s1.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	}

}
