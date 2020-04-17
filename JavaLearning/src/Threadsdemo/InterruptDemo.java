package Threadsdemo;

public class InterruptDemo extends Thread  {
	
	public void display()
	{
		System.out.println("stating of display method");
		for(int j=0;j<=100;j++)
		{
			System.out.println("value of j in display method is: "+j);
		}
		try{
			Thread.sleep(10000);;
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("ending of display method");
	}
	
	public void run(){
		System.out.println("in run method");
	  display();
	}

}
