package Asignment;

public class Switchcase7p2 {
	public static void main(String[] args )
	{
		Switchcase7p2 s1=new Switchcase7p2();
		s1.displaycricketerrole("Dhoni");
	}
	
  void displaycricketerrole(String name)
  {
	  switch(name){
	  case "Dhoni":
		  System.out.println("Dhoni's role is a wicket keeper");
		  break;
	  case "kohli":
		  System.out.println("kohli's role is a bat's man");
		  break;
	  case "Aswin":
		  System.out.println("aswin's role is a spin bowler");
		  break;
	  case "Nehra":
		  System.out.println("nehra's role is a fast bowler");
		  break;  
	  case "Jadeja":
		  System.out.println("Jadeja's role is a all rounder");
		  break;
		default:
			System.out.println("another player ");
		  
	  }
  }
}
