package MultiLevel;

public class Employee extends TCS{
	String empName;
	int id;
	double sal;
	String role;
	int exp;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(String name, String type, String ceo, double turnOver,
				String hq, int emp, int project, int loc,
				String empName, int id, double sal, String role, int exp)
	{
		this.name = name;
		this.type = type;
		this.ceo = ceo;
		this.turnOver = turnOver;
		this.hq = hq;
		this.emp = emp;
		this.project = project;
		this.loc = loc;
		this.empName = empName;
		this.id = id;
		this.sal = sal;
		this.role = role;
		this.exp = exp;
	}
	
	public void displayEmp()
	{
		DisplayTCS();
		System.out.println("Emp name : "+empName);
		System.out.println("ID : "+id);
		System.out.println("Sal : "+sal);
		System.out.println("Role : "+role);
		System.out.println("Experience : "+exp);
	}
}