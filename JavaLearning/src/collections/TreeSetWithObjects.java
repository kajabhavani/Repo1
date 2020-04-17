package collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetWithObjects {

	public static void main(String[] args) {
		
		Employee e1= new Employee(102,"bhavani",6700,5000);
		Employee e2= new Employee(108,"kalyani",8000,2500);
		Employee e3= new Employee(130,"samatha",3000,1000);
		Employee e4= new Employee(125,"dileep",6700,2500);
		
		Set<Employee> s1=new TreeSet<Employee>();
		
		s1.add(e1);
		s1.add(e2);
		s1.add(e3);
		s1.add(e4);
		
		Iterator<Employee> i1= s1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		
	}

}
