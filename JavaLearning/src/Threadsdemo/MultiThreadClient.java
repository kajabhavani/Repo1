package Threadsdemo;

public class MultiThreadClient {
    void m1()
    {
    	System.out.println("execution of m1 method");
    }
	public static void main(String[] args) {
		
    	System.out.println("starting  of main method");

		MultiThreadingDemo m1=new MultiThreadingDemo();
		m1.start();
		
		 for(int i=0;i<=20;i++)
		 {
			 System.out.println("the value of i in main method: "+i);
		 }
	    	System.out.println("ending  of main method");

		}

	void m2()
    {
    	System.out.println("execution of m2 method");
    }
}
