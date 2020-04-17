package Asignment;

public class Matches26 extends Cricketers26{

	private int noOfmathes;
	private int noOfstumps;
	private int noOfcenturies;
	private int noOfwickets;
	
	public int getNoOfmathes() {
		return noOfmathes;
	}
	public void setNoOfmathes(int noOfmathes) {
		this.noOfmathes = noOfmathes;
	}
	public int getNoOfstumps() {
		return noOfstumps;
	}
	public void setNoOfstumps(int noOfstumps) {
		this.noOfstumps = noOfstumps;
	}
	
	
	public int getNoOfcenturies() {
		return noOfcenturies;
	}
	public void setNoOfcenturies(int noOfcenturies) {
		this.noOfcenturies = noOfcenturies;
	}
	public int getNoOfwickets() {
		return noOfwickets;
	}
	public void setNoOfwickets(int noOfwickets) {
		this.noOfwickets = noOfwickets;
	}
	public static void main(String[] args)
	{
		Matches26 m1=new Matches26();
		Matches26 m2=new Matches26();
		Matches26 m3=new Matches26();
		Matches26 m4=new Matches26();
		
		m1.setCricname("Virat Kohli");
		m1.setAge(26);
		m1.setNoOfmathes(100);
		m1.setNoOfcenturies(20);
		
		System.out.println("name:"+m1.getCricname()+" age is:"+m1.getAge()+" noOfmatches:"+m1.getNoOfmathes()+" noOfwickets:"+m1.getNoOfcenturies());
		
		m2.setCricname("Ashwin");
		m2.setAge(28);
		m2.setNoOfmathes(200);
		m2.setNoOfwickets(40);
		
		System.out.println("name:"+m2.getCricname()+" age is:"+m2.getAge()+" noOfmatches:"+m2.getNoOfmathes()+" noOfwickets:"+m2.getNoOfwickets());
		
		m3.setCricname("Nehra");
		m3.setAge(35);
		m3.setNoOfmathes(400);
		m3.setNoOfstumps(100);
		
		System.out.println("name:"+m3.getCricname()+" age is:"+m3.getAge()+" noOfmatches:"+m3.getNoOfmathes()+" noOfwickets:"+m3.getNoOfstumps());
	
		m4.setCricname("Dhoni");
		m4.setAge(32);
		m4.setNoOfmathes(350);
		m4.setNoOfstumps(100);
		
		System.out.println("name:"+m4.getCricname()+" age is:"+m4.getAge()+" noOfmatches:"+m4.getNoOfmathes()+" noOfwickets:"+m4.getNoOfstumps());
	}
	
}
