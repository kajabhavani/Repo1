package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IntroductionToCollections {

	public static void main(String[] args) {
		 ArrayList<Object> a1=new ArrayList<Object>();
		 
		 a1.add("bhavani");
		 a1.add("dileep");
		 a1.add(120);
		 a1.add("bhavani");
		 a1.add(50);
	     a1.add(120);
	     
	     System.out.println("size of a1 is: "+a1.size());
	     
	     ArrayList<Object> a2=new ArrayList<Object>();
	     
	     a2.add("kalyani");
		 a2.add("veda");
		 a2.add(10000);
		 a2.add("lakshmi");
		 a2.add(100);
	     a2.add(189);
	     a2.addAll(a1);
	     System.out.println("size of a2 is: "+a2.size());
	     
	   // a2.remove(4);
	    // a2.remove("kalyani");
	  //  a2.removeAll(a1);
	    a2.retainAll(a1);
	    // System.out.println(a2.get(3));
	     
	     Iterator<Object> i1= a1.iterator();
	    
	     while(i1.hasNext())
	     {
	    	 System.out.println(i1.next());
	     }
	     Iterator<Object> i2= a2.iterator();
		    
	     while(i2.hasNext())
	     {
	    	 System.out.println(i2.next());
	     }
	     
	}

}
