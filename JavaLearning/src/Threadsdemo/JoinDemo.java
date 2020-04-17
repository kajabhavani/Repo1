package Threadsdemo;

public class JoinDemo extends Thread {
	public void display()
	{
		System.out.println("stating of display method");
		
		for(int j=0;j<=100;j++)
		{
			System.out.println("value of j in display method is: "+j);
		}
		
		System.out.println("ending  of display method");
	}
		public void run(){
		System.out.println("in run method");
	  display();
	}


}
