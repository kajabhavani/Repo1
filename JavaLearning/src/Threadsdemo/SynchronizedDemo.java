package Threadsdemo;

public class SynchronizedDemo implements Runnable{
	
	synchronized void display()
	{
		System.out.println("stsrting of display method");
		for(int i=0;i<=100;i++)
		{
			System.out.println("value of i in display method is"+i+"executing by a thread with name as"+Thread.currentThread().getName());
		}
		System.out.println("ending of display method");
	}
	
	public void run()
	{
		System.out.println("starting of run method");
		display();
		System.out.println("ending of run method");
	}

}
