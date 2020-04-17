package Asignment;

public class Evenoddreverse {

	public static void main(String[] args) {
		
		Evenoddreverse e1=new Evenoddreverse();
		e1.even();
		e1.odd();
		e1.reverse();
	}
	void even(){
		int num=100;
		if(num%2==0)
			System.out.println(num+"   is even number");
		else
			System.out.println(num +"  is not even number");
	}
	void odd(){
		int num=98;
		if(num%2==1)
			System.out.println(num+"   is odd number");
		else
			System.out.println(num +"  is not odd number");
	}
	void reverse()
	{
		int num=123;
		int r=0;
		while(num!=0)
		{
			r = r*10;
			r= r + num%10;
			num = num/10;
		}
		System.out.println("reverse number is  "+ r);
	  if(num==r)
		  System.out.println("it is palindrome number");
	else
		System.out.println("it is not palindrome number");
		
      }
}
