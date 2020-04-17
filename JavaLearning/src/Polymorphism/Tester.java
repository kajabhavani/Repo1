package Polymorphism;

public class Tester extends Employee{
	private int noofissuesraised;
	
	double getBonus()
	{
		int salary=getSalary();
		double bonus=(salary*30)/100;
		return bonus;
	}

	public int getNoofissuesraised() {
		return noofissuesraised;
	}

	public void setNoofissuesraised(int noofissuesraised) {
		this.noofissuesraised = noofissuesraised;
	}
	

}
