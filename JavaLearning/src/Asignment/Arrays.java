package Asignment;

public class Arrays {
	public static void main(String[] args)
	{

	String[] name= new String[6];
	
	int x[]={1,2,3,4};
	System.out.println(x[0]);
	
	name[0]="sachin";
	name[1]="virat";
	name[2]="kapil";
	name[3]="dhoni";
	name[4]="rohit sharma";
	name[5]="ravindra jadeja";

	int size=name.length;
	System.out.println(size);

	System.out.println(name[0]);
	System.out.println(name[1]);
	System.out.println(name[2]);
	System.out.println(name[3]);
	System.out.println(name[4]);
	System.out.println(name[5]);
	System.out.println(name[66]);
	

	for(int i=0;i<6;i++)
	{
		System.out.println(name[i]);
	}


	
	}
}
