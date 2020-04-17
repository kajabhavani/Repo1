package Threadsdemo;

public class ImplementsRunnableDemo implements Runnable {
	
	public void display()
	{
		System.out.println("starting of display method");
		for(int j=0;j<100;j++)
		{
			System.out.println("the value of j in display method is:  "+j+"executed by a thread with name as "+Thread.currentThread().getName());
			Thread.currentThread().setName("dileep Thread");
			Thread.currentThread().setPriority(10);


		}
		System.out.println("ending of display method");
	}
  @Override	
	public void run()
	{
		System.out.println("starting of run method");
		System.out.println("name of the thread which executes run method is"+Thread.currentThread().getName());
		display();
		System.out.println("ending ofrun method");
	}
}
