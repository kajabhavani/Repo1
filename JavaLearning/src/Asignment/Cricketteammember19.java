package Asignment;

public class Cricketteammember19 {
	
	private int cricketerid;
	private String cricketername;
	private String cricketerrole;
	
	
	Cricketteammember19(int cid,String cname,String crole)
	{
		this.cricketerid=cid;
		this.cricketername=cname;
		this.cricketerrole=crole;
		
	}
	void display()
	{
		System.out.println("crickterid:  "+cricketerid  +"   cricketername:  "+cricketername+"     cricketerrole:   "+cricketerrole);
	}
	public static void main(String[] args)
	{
		Cricketteammember19 c1=new Cricketteammember19(10,"Dhoni","dhoni's role is wicket keeper");
		c1.display();
		Cricketteammember19 c2=new Cricketteammember19(11,"Kohli","kohli's role is bats man");
		c2.display();
		Cricketteammember19 c3=new Cricketteammember19(12,"Ashwin","Ashwin's role is fast bowler");
		c3.display();
		Cricketteammember19 c4=new Cricketteammember19(13,"Jadeja","Jadeja's role is all rounder");
		c4.display();
		Cricketteammember19 c5=new Cricketteammember19(14,"Nehra","Nehra's role is all rounder");
		c5.display();
		
    }

}
