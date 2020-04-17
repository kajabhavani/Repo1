package Asignment;

public class Methodoverloading23 {

	public static void main(String[] args)
	{

		Methodoverloading23 m1=new Methodoverloading23();
		System.out.println(m1.add(10,20));
		System.out.println(m1.add(12, 16.5));
		System.out.println(m1.add(12.5, 45.3));
		System.out.println(m1.add(15, 23, 99));
		
	}
	int add(int num1,int num2)
	{
		int res;
		res=num1+num2;
	    return res;
	}
	double add(int num1,double num2)
	{
		double res;
		res=num1+num2;
	    return res;
	}
	double add(double num1,double num2)
	{
		double res;
		res=num1+num2;
	    return res;
	}
	int add(int num1,int num2,int num3)
	{
		int res;
		res=num1+num2+num3;
		return res;
	}
	
	
}

