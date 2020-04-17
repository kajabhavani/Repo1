package Asignment;

public class Assignmet62 {

	public static void main(String[] args) {
	
		displayExperience(10);

	}
static 	void displayExperience(int exp)
	{
		if(exp <2)
		   System.out.println("junior level software engineer");
		else if(exp>=2 && exp<4)
			 System.out.println("software engineer");
		else if(exp>4 &&exp<6)
			  System.out.println("senior level software engineer");
		else if(exp>6 && exp<8)
		      System.out.println("associate teh lead");
		else
			System.out.println("tech lead");
		}
    }


