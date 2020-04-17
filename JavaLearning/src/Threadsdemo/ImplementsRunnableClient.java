package Threadsdemo;

public class ImplementsRunnableClient {

	public static void main(String[] args) {
		
		System.out.println("starting of main method");
		System.out.println("nme of the thead which executes main method:  "+Thread.currentThread().getName());
		Thread.currentThread().setName("bhavani Thread");
		System.out.println(Thread.currentThread().getPriority());
		
		
		ImplementsRunnableDemo i1=new ImplementsRunnableDemo();
		Thread obj=new Thread(i1);
		
		obj.setPriority(10);
		obj.start();
		
		for(int i=0;i<=100;i++)
		{
			System.out.println("the value of i in main method is  "+i+"  executed by a thread with name as  "+Thread.currentThread().getName());
		}
		
		System.out.println("ending od main method");
		

	}

}
