package ExcdptinHandling;

import java.util.Scanner;

public class UserDefinedExceptinsDemo {

	public static void main(String[] args) {
	
		int availableBalance =1000;
		 System.out.println("please enter the requested amount");
		 Scanner s1=new Scanner(System.in);
		 int requestedAmount=s1.nextInt();
		 s1.close();
		  
		 if(requestedAmount > availableBalance)
		 {
			 throw new InSufficientBalanceException("please check ur entered amount");
		 }
		 else
		 {
			 availableBalance = (availableBalance-requestedAmount);
			 System.out.println("available balance is:  "+availableBalance);
			 }
		 }

	}


