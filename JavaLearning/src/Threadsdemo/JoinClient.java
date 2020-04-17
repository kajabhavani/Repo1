package Threadsdemo;

public class JoinClient {

	public static void main(String[] args) {
      System.out.println("starting of main method");
		
		JoinDemo d1=new JoinDemo();
		d1.start();
		for(int i=0;i<=40;i++)
		{
			System.out.println("the value of i in main method:  "+i);
		}
		try
		{
			d1.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("ending of main method");
	}
	}


