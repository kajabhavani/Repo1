package Asignment;

public class Conditionaldemo {
	public static void main(String[] args)
	{
		display();
	}
	static void display()
	{
		int count=0;

		for(int i=0;i<=10;i++)
		{
			
			System.out.println("tha value is"+i);
			if(i%2==0)
			 count=count+1;
			if(count==4)
			 break;
			
		}
	}
}
