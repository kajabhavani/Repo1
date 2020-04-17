package Threadsdemo;

public class InterruptClient {

	public static void main(String[] args) {

		System.out.println("starting of main method"+Thread.currentThread().getName());
		
		InterruptDemo i1=new InterruptDemo();
		i1.start();
		for(int i=0;i<=40;i++)
		{
			System.out.println("the value of i in main method:  "+i);
		}
		i1.interrupt();
		System.out.println("ending of main method");
	}

}
