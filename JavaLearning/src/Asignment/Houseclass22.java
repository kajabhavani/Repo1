package Asignment;

public class Houseclass22 {
	
	private int houseno;
	private String address;
	private static  int noOfrooms=4;
	private double currntbill;
	 
	public int getHouseno() {
		return houseno;
	}
	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getCurrntbill() {
		return currntbill;
	}
	public void setCurrntbill(double currntbill) {
		this.currntbill = currntbill;
	}
	 public static void main(String[] args)
	 {
		 Houseclass22 h1=new Houseclass22();
		 Houseclass22 h2=new Houseclass22();
		 Houseclass22 h3=new Houseclass22();
		 h1.setHouseno(122);
		 h1.setAddress("omaha");
		 h1.setCurrntbill(150.45);
		 System.out.println(h1.getHouseno());
		 System.out.println(h1.getAddress());
		 System.out.println(h1.getCurrntbill());
		 System.out.println(Houseclass22.noOfrooms);
		 
		 h2.setHouseno(104);
		 h2.setAddress("hyderabad");
		 h2.setCurrntbill(1500);
		 System.out.println(h2.getHouseno());
		 System.out.println(h2.getAddress());
		 System.out.println(h2.getCurrntbill());
		 System.out.println(Houseclass22.noOfrooms);

		 h3.setHouseno(190);
		 h3.setAddress("vijayawada");
		 h3.setCurrntbill(200.50);
		 System.out.println(h3.getHouseno());
		 System.out.println(h3.getAddress());
		 System.out.println(h3.getCurrntbill());
		 System.out.println(Houseclass22.noOfrooms);

	 }
	

}
