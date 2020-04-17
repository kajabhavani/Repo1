package Polymorphism;

public class SupercalssreffandSubclassobjectrules {

	publc static void main(String[] args)
	{
		Employee empobj=new Employee();
		Programmer prgobj=new Programmer();
		Tester testobj=new Tester();
		
		Employee empobj1=new Programmer();
		Employee empobj2=new Tester();
		//Programmer p1=new Employee();
		empobj1.setEmpid(10);
		empobj.getEmpid();
		empobj.setSalary(10000);
		//empobj.getNoofIssuesResolved();
		empobj.getBonus();
		
		
		
	}
}
