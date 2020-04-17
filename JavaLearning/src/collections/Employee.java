package collections;

public class Employee implements Comparable<Employee> {
	
	private int empid;
	private String empname;
	private int salary;
	private int bonus;
	
	public Employee()
	{
		
	}
	
	public Employee(int empid,String empname,int salary,int bonus)
	{
		this.empid=empid;
		this.empname=empname;
		this.salary=salary;
		this.bonus=bonus;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", salary=" + salary + ", bonus=" + bonus + "]";
	}

	@Override
	public int compareTo(Employee o) {
		 Employee e1=this;
		 Employee e2=o;
		  Integer e1salary= e1.getSalary();
		  Integer e2salary=e2.getSalary();
		  
		  int salariesComparisionResult = -(e1salary.compareTo(e2salary));
		  
		  if(salariesComparisionResult !=0)
		  {
			  return salariesComparisionResult;
		  }
		  else
		  {
			  String e1name=e1.getEmpname();
			  String e2name=e2.getEmpname();
			  
			  return -(e1name.compareTo(e2name));
		  }
		  }
	
	

}
