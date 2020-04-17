package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
 public static void main(String[] args)
 {
	 List<Object> l1=new LinkedList<Object>();
	 
	 l1.add("java");
	 l1.add("html");
	 l1.add(123);
	 l1.add('F');
	 l1.add(60);
	 l1.add("java");
	 
	 Iterator<Object> i1= l1.iterator();
	 
	 while(i1.hasNext())
	 {
		 System.out.println(i1.next());
	 }
	 
	 
			 
 }
}
