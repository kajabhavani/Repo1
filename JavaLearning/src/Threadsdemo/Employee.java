package Threadsdemo;

public class Employee {
	
	private int empid;
	private String empname;
	private char gender;
	private int salary;
	private int bonus;
	
	public Employee()
	{
		
	}
	
	public Employee(int empid,String empname,char gender,int salary,int bonus)
	{
		this.empid=empid;
		this.empname=empname;
		this.gender=gender;
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
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
		return "Employee [empid=" + empid + ", empname=" + empname + ", gender=" + gender + ", salary=" + salary
				+ ", bonus=" + bonus + "]";
	}
	
	
  protected void finalize() throws Throwable{
	  System.out.println("finalize method getting executed through a thread with name as  "+Thread.currentThread().getName()+"  for an object with data as  "+this);
  }
}
