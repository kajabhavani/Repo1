package Threadsdemo;

public class GarbageCollectionDemo {

	public static void main(String[] args) {
		
		Employee e1=new Employee(101,"bhavani",'F', 10000,500);
		
		e1=new Employee(104,"vani",'F', 44000,5000);
		
		e1=new Employee(108,"kalyani",'F', 15000,800);
		
		System.out.println(e1);
		
		System.gc();
		
		try{
			Thread.sleep(1000);
			}
		catch(InterruptedException e)
		{
			e.printStackTrace();
			
		}
	}

}
