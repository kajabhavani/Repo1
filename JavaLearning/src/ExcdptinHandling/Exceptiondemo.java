package ExcdptinHandling;

public class Exceptiondemo {
	public static void main(String[] args)
	{
		System.out.println("starting of main method");
		try{
		System.out.println(10/0);
		}catch(Exception e)
		{
			System.out.println(" dont devide any number by zero");
		}
		System.out.println("ending of main method");
	}

}
