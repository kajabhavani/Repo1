package ExcdptinHandling;

public class ExceptionFlow {

	public static void main(String[] args) {
	
		System.out.println("starting of main method");
		
		try
		{
			System.out.println(10/0);
			System.out.println("hi hello !!");
		}catch(ArithmeticException ex)
		{
			System.out.println("please dont try to devide any number ith 0");
		}
		finally{
			System.out.println("hi hello !!");
		}
		System.out.println("ending of main method");
	}

}
