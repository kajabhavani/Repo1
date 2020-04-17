package Filesdemo;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
	
		Scanner s1=new Scanner(System.in);
        
		System.out.println("please enter the employee ID");
		int empid=s1.nextInt();
		
		System.out.println("please ente employee name");
	    String ename=s1.next();
	    
	    System.out.println("please enter employee salary");
	    double salary=s1.nextDouble();
	    
	  
	}

}
