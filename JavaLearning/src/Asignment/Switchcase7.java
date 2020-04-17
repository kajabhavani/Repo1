package Asignment;

public class Switchcase7 {
	public static void main(String[] args)
	{
		 displaymonth(5);
	}
	static void displaymonth(int month)
	{
		switch(month){
		case 1:
			System.out.println("january");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("april");
			break;
		case 5:
			System.out.println("may");
			break;
		case 6:
			System.out.println("jun");
			break;
		default:
			System.out.println("nothing to display ");
		}
		
	}

}
