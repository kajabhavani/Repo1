package Asignment;

public class Emporg24 extends Employee24{
	private String orgname;
	private int noOfemp;
	
	public String getOrgname() {
		return orgname;
	}
	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}
	public int getNoOfemp() {
		return noOfemp;
	}
	public void setNoOfemp(int noOfemp) {
		this.noOfemp = noOfemp;
	}
	
	
	public static void main(String[] args)
	{
		Emporg24 e1=new Emporg24();
		Emporg24 e2=new Emporg24();

		e1.setEmpid(10);
		e1.setEname("bhavani");
		e1.setAge(25);
		e1.setOrgname("google");
		e1.setNoOfemp(50);
		System.out.println("employee id is:"+ e1.getEmpid()+ "  empname is: "+ e1.getEname()+" employee age is: "+
		                  e1.getAge()+"  organization name is:"+e1.getOrgname()+"  noofemployees: "+e1.getNoOfemp());
		//System.out.println(e1.getEname());
		//System.out.println(e1.getAge());
		//System.out.println(e1.getOrgname());
		//System.out.println(e1.getNoOfemp());
		e2.setEmpid(20);
		e2.setEname("dileep");
		e2.setAge(35);
		e2.setOrgname("microsoft");
		e2.setNoOfemp(100);
		System.out.println("employee id is: "+ e2.getEmpid()+ "  empname is: "+ e2.getEname()+" employee age is: "+
                e2.getAge()+"  organization name is: "+e2.getOrgname()+"  noofemployees: "+e2.getNoOfemp());
	}
	
	

}
