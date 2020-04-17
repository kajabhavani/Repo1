package Asignment;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       displayWeekName(5);
	}
	static void displayWeekName(int weekno)
	{
		switch(weekno){
		   
		case 1:
			 System.out.println("sunday");
			 break;
		case 2:
			System.out.println("monday;");
		case 3:
			 System.out.println("tuesday");
			 break;
		case 4:
			System.out.println("wednesday");
			break;
		case 5:
			 System.out.println("thursday");
			 break;
		case 6:
			System.out.println("friday");
			break;
		default:
			System.out.println("saturday");
			 
		}
		
		     
	}

}
