package Asignment;

public class Emloyee21 {
	
	private int empid;
	private String empname;
	private int empsalary;
	private String emporgname;
	private static String emprole="java developer";
	
	Emloyee21()
	{
		
	}
	Emloyee21(int empid,String empname,int empsalary,String emporgname)
	{
		this.empid=empid;
		this.empname=empname;
		this.empsalary=empsalary;
		this.emporgname=emporgname;
		//this.emprole=emprole;
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
	public int getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(int empsalary) {
		this.empsalary = empsalary;
	}
	public String getEmporgname() {
		return emporgname;
	}
	public void setEmporgname(String emporgname) {
		this.emporgname = emporgname;
	}
	/*public String getEmprole() {
		return emprole;
	}
	public void setEmprole(String emprole) {
		this.emprole = emprole;
	}*/
	public static void main(String[] arg)
	{
		Emloyee21 e1=new Emloyee21();
		Emloyee21 e2=new Emloyee21(11,"dileep",11000,"uprr");
		Emloyee21 e3=new Emloyee21(21,"donepudi",15000,"infosys");
		
		e1.setEmpid(10);
		e1.setEmpname("bhavani");
		e1.setEmpsalary(10000);
		e1.setEmporgname("prokarma");
		//e1.setEmprole("javadeveloper");
		System.out.println(e1.getEmpid());
		System.out.println(e1.getEmpname());
		System.out.println(e1.getEmpsalary());
		System.out.println(e1.getEmporgname());
		//System.out.println(e1.getEmprole());
		System.out.println(Emloyee21.emprole);
		System.out.println();
		
		//System.out.println(Emloyee21.emprole);
		 
		System.out.println(e2.getEmpid());
		System.out.println(e2.getEmpname());
		System.out.println(e2.getEmpsalary());
		System.out.println(e2.getEmporgname());
		System.out.println(Emloyee21.emprole);
		System.out.println();
		
		System.out.println(e3.getEmpid());
		System.out.println(e3.getEmpname());
		System.out.println(e3.getEmpsalary());
		System.out.println(e3.getEmporgname());
		System.out.println(Emloyee21.emprole);	}

}
