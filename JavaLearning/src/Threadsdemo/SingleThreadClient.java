package Threadsdemo;

public class SingleThreadClient {
	public static void main(String[] args)
	{
		
		System.out.println("statrting of main method");
		SingleThreadDemo s1=new SingleThreadDemo();
		s1.display();
		for(int i=0;i<=10;i++)
		{
			System.out.println("tha value of i: "+i);
		}
		System.out.println("ending of main method");
	}

}
