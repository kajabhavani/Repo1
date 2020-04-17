package Asignment;

public class Constructorbike18 {
	
	private String bikename;
	private String bikecolor;
	private int bikemilage;
	
	Constructorbike18()
	{
		
	}

	public String getBikename() {
		return bikename;
	}

	public void setBikename(String bikename) {
		this.bikename = bikename;
	}

	public String getBikecolor() {
		return bikecolor;
	}

	public void setBikecolor(String bikecolor) {
		this.bikecolor = bikecolor;
	}

	public int getBikemilage() {
		return bikemilage;
	}

	public void setBikemilage(int bikemilage) {
		this.bikemilage = bikemilage;
	}
	
	public static void main(String[] args)
	{
		Constructorbike18 p1=new Constructorbike18();
		Constructorbike18 g1=new Constructorbike18();
		Constructorbike18 c1=new Constructorbike18();

		

		
	   
		p1.setBikename("pulsar");
		p1.setBikecolor("black");
		p1.setBikemilage(100);
		System.out.println("bike name is "+p1.getBikename());
		System.out.println("bike color is "+p1.getBikecolor());
		System.out.println("bike milage is "+p1.getBikemilage());
		System.out.println();
		
		g1.setBikename("glamour");
		g1.setBikecolor("red");
		g1.setBikemilage(125);
		System.out.println("bike name is "+g1.getBikename());
		System.out.println("bike color is "+g1.getBikecolor());
		System.out.println("bike milage is "+g1.getBikemilage());
		System.out.println();
		
		c1.setBikename("cbz");
		c1.setBikecolor("white");
		c1.setBikemilage(90);
		System.out.println("bike name is "+c1.getBikename());
		System.out.println("bike color is "+c1.getBikecolor());
		System.out.println("bike milage is "+c1.getBikemilage());
		
		
		
	}

}
