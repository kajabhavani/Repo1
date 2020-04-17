package Threadsdemo;

public class MultiThreadingDemo extends Thread {

      void display()
      {
    	  System.out.println("MultiThreadingDemo #starting of display method");
    	 
    	  for(int j=0;j<=20;j++)
    	  {
    		  System.out.println("MultiThreadingDemo #the value of j is: "+j);
    	  }
    	  System.out.println("MultiThreadingDemo #ending of display method");
      }
      
    public  void run()
      {
    	  System.out.println("MultiThreadingDemo #starting of run method");
    	  display();
    	  System.out.println("MultiThreadingDemo# ending of run method");
      }

	

}
