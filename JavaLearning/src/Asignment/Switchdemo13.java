package Asignment;

public class Switchdemo13 {

	public static void main(String[] args) {

		Switchdemo13 s1=new Switchdemo13();
		s1.weekname();

	}
	void weekname()
	{
		display(6);
	}
	 void display(int weekno)
	{
		switch(weekno){
		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("monday");
			break;
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
		case 7:
			System.out.println("saturday");
			break;
		}
	}
}
