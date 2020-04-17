package Asignment;

public class Conditionaldemo11 {

	public static void main(String[] args) {
		
			      display();
			}
	static void display()
			{
				int count=0;

				for(int i=4;i<=13;i++)
				{
					
					System.out.println("tha value is"+i);
					if(i%2==0)
					 count=count+1;
					if(count==3)
					 break;
					
				}
			}
	
	}


	


