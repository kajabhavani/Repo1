package Threadsdemo;

public class SleepMethodDemo {

	public static void main(String[] args) {
		
		System.out.println("starting of main method");
		System.out.println("name of the thread:  "+Thread.currentThread().getName());
		try
		{
			Thread.sleep(4000);
			
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}

		 System.out.println("ending of main method");
	}

}
