package Polymorphism;

public class Programmer extends Employee {

	private int noofIssuesResolved;

	double getBonus()
	{
		int salary=getSalary();
		double bonus=(salary*20)/100;
		return bonus;
}
	public int getNoofIssuesResolved() {
		return noofIssuesResolved;
	}

	public void setNoofIssuesResolved(int noofIssuesResolved) {
		this.noofIssuesResolved = noofIssuesResolved;
	}
	
}
