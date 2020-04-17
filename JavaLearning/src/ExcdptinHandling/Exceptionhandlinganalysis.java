package ExcdptinHandling;

public class Exceptionhandlinganalysis {

	public static void main(String[] args) {
		 
		String[] name= new String[5];
		System.out.println("starting of main method");
		
		try
		{
			name[5]="bhavani";
		}
		catch(ArithmeticException e)
		{
			System.out.println("dont try to any numer devide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("please dont work on invalid positions based on size of the array");
		}
		
		System.out.println("ending of main method");
		
	}

}
