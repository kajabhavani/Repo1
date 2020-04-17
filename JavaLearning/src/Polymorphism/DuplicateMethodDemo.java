package Polymorphism;

public class DuplicateMethodDemo {
	String name="java";
	//String name="html";

	public static void main(String[] args) {
		
		String name="java";
		//String name="html";
		
		DuplicateMethodDemo d1=new DuplicateMethodDemo();
		System.out.println(d1.multiplyTwonumbers(12, 30));
		System.out.println(d1.multiplyTwonumbers(5.5, 8.9));
		System.out.println(d1.multiplyTwonumbers(5, 5.2));
		

	}
	int multiplyTwonumbers(int num1,int num2)
	{
		System.out.println("input received to multiplyTwonumbers are "+num1+"and"+num2);
		int r=num1*num2;
		return r;
	}
	double multiplyTwonumbers(double num1,double num2)
	{
		System.out.println("input received to multiplyTwonumbers are "+num1+"and"+num2);
		double r=num1*num2;
		return r;
	}
	double multiplyTwonumbers(int num1,double num2)
	{
		System.out.println("input received to multiplyTwonumbers are "+num1+"and"+num2);
		double r=num1*num2;
		return r;
	}
}
