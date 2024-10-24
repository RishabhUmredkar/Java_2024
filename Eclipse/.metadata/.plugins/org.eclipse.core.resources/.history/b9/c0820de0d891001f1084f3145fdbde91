package Encapsulation;

public class Employee {
	private int id;
	private String name;
	private String password;
	private int deptno;
	private long salary;
	private String DeptName;
	private String job;
	private String location;
	private String teamLead;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(int id, String name, String password, int deptno, long salary, String DeptName, String job,
			String location, String teamLead) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.deptno = deptno;
		this.salary = salary;
		this.DeptName = DeptName;
		this.job = job;
		this.location = location;
		this.teamLead = teamLead;
	}


	public int getId()
	{
		return id;
	}
	public String getname()
	{
		return name;
	}
	public void setPass(int id, String oldPass, String newPass)
	{
		if(this.id == id && password == oldPass)
		{
			password = newPass;
			System.out.println("Your Password is updated");
		}
		else
		{
			System.out.println("False Credential");
		}
	}
	public void setPass(String name, String oldPass, String newPass)
	{
		if(this.name == name && password == oldPass)
		{
			password = newPass;
			System.out.println("Your Password is updated");
		}
		else
		{
			System.out.println("False Credential");
		}
	}
	
	public int getDeptNo()
	{
		return deptno;
	}
	public void setDeptNo(String name, String password)
	{
		if(this.name == name && this.password == password)
		{
			if(this.salary > 20000)
			{
				this.deptno = 30;
			}
			else
			{
				System.out.println("Cann't update deptno because sal is less 20000");
			}
		}
		else{
			System.out.println("False Credential");
		}
	}
	public long getSalary()
	{
		return salary;
	}
	public void setSalary(String job, String location)
	{
		if(job == "Manager" && location == "pune")
		{
			salary = 50000;
		}
		else{
			System.out.println("False Credential");
		}
	}
	public String getDeptName()
	{
		return DeptName;
	}
	public String getJob()
	{
		return job;
	}
	public String getLoc()
	{
		return location;
	}
	public void setLoc(long Salary)
	{
		if(salary >20000)
		{
			this.location = "Nagpur";
		}
		else{
			System.out.println("low sal");
		}
	}
	public String getTL()
	{
		return teamLead;
	}
}
