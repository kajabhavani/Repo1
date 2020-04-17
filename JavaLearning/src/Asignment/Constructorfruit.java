package Asignment;

public class Constructorfruit {
	
	private String fruitname;
	private String fruitcolor;
	private int nooffruits;
	
	Constructorfruit()
	{
		
	}
	

	//@Override
	public String toString() {
		return "Constructorfruit [fruitname=" + fruitname + ", fruitcolor=" + fruitcolor + ", nooffruits=" + nooffruits
				+ "]";
	}//


	public static void main(String[] args) {
		
		Constructorfruit a1=new Constructorfruit();
		Constructorfruit m1=new Constructorfruit();
		Constructorfruit p1=new Constructorfruit();
		Constructorfruit g1=new Constructorfruit();

		

		a1.setFruitname("apple");
		a1.setFruitcolor("green");
		a1.setNooffruits(4);
		System.out.println(a1.getFruitname());
		System.out.println(a1.getFruitcolor());
		System.out.println(a1.getNooffruits());
		
		m1.setFruitname("mango");
		m1.setFruitcolor("green");
		m1.setNooffruits(10);
		System.out.println(m1.getFruitname());
		System.out.println(m1.getFruitcolor());
		System.out.println(m1.getNooffruits());
		
		p1.setFruitname("pineapple");
		p1.setFruitcolor("light green");
		p1.setNooffruits(6);
		System.out.println(p1.getFruitname());
		System.out.println(p1.getFruitcolor());
		System.out.println(p1.getNooffruits());
		
		g1.setFruitname("grapes");
		g1.setFruitcolor("black");
		g1.setNooffruits(100);
		System.out.println(g1.getFruitname());
		System.out.println(g1.getFruitcolor());
		System.out.println(g1.getNooffruits());
		
	}



	public String getFruitname() {
		return fruitname;
	}



	public void setFruitname(String fruitname) {
		this.fruitname = fruitname;
	}



	public String getFruitcolor() {
		return fruitcolor;
	}



	public void setFruitcolor(String fruitcolor) {
		this.fruitcolor = fruitcolor;
	}



	public int getNooffruits() {
		return nooffruits;
	}



	public void setNooffruits(int nooffruits) {
		this.nooffruits = nooffruits;
	}
	
	
	

}
