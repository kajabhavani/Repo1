package Threadsdemo;

public class SynchronizedClient {

	public static void main(String[] args) {
	
		System.out.println("starting of main method");
		
		SynchronizedDemo s1=new SynchronizedDemo();
		
		Thread t1=new Thread(s1);
		t1.start();
		
		Thread t2=new Thread(s1);
		t2.start();
		
		Thread t3=new Thread(s1);
		t3.start();
		
		System.out.println("ending of main method");

	}

}
