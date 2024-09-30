package MultiLevel;

public class TCS extends SoftwareCompany{
	String hq;
	int emp;
	int project;
	int loc;
	
	public TCS() {
		// TODO Auto-generated constructor stub
	}
	
	public TCS(String name, String type, String ceo, double turnOver,
				String hq, int emp, int project, int loc)
	{
		this.name = name;
		this.type = type;
		this.ceo = ceo;
		this.turnOver = turnOver;
		this.hq = hq;
		this.emp = emp;
		this.project = project;
		this.loc = loc;
	}
	
	public void DisplayTCS()
	{
		displaySWComp();
		System.out.println("Head Quater : "+hq);
		System.out.println("Employee : "+emp);
		System.out.println("No. of Projects : "+project);
		System.out.println("LOC : "+loc);
	}
}
