package Asignment;

public class Authorbook25 extends Author25 {
	
	private String bookname;
	private int noOfpages;

	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getNoOfpages() {
		return noOfpages;
	}
	public void setNoOfpages(int noOfpages) {
		this.noOfpages = noOfpages;
	}
	
	public static void main(String[] args)
	{
		
		Authorbook25 a1=new Authorbook25();
		Authorbook25 a2=new Authorbook25();
		Authorbook25 a3=new Authorbook25();
		a1.setAutname("yandamuri");
		a1.setAutgender('M');
		a1.setAutgmail("yandamuri@gmail.com");
		a1.setBookname("tulasi dalam");
		a1.setNoOfpages(150);
		
		System.out.println("author name is:"+a1.getAutname()+"  author gender is: "+a1.getAutgender()+"  author mail is: "+a1.getAutgmail()+
				                  "  book name is:"+a1.getBookname()+"   noofpages in book are:"+a1.getNoOfpages());
		
		a2.setAutname("sulochana rani");
		a2.setAutgender('F');
		a2.setAutgmail("yaddanapudi@gmail.com");
		a2.setBookname("jeevana tarangalu");
		a2.setNoOfpages(200);
		
		System.out.println("author name is:"+a2.getAutname()+"  author gender is: "+a2.getAutgender()+"  author mail is: "+a2.getAutgmail()+
				                  "  book name is:"+a2.getBookname()+"   noofpages in book are:"+a2.getNoOfpages());
		
		a3.setAutname("sri sri");
		a3.setAutgender('M');
		a3.setAutgmail("srirangam@gmail.com");
		a3.setBookname("maha prastanam");
		a3.setNoOfpages(187);
		
		System.out.println("author name is:"+a3.getAutname()+"  author gender is: "+a3.getAutgender()+"  author mail is: "+a3.getAutgmail()+
				                  "  book name is:"+a3.getBookname()+"   noofpages in book are:"+a3.getNoOfpages());
	}
	
	

}
