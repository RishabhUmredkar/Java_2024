package DownCasting;

public class Cardiologist extends Doctor{
	String spl;
	String organ;
	
	public Cardiologist() {
		// TODO Auto-generated constructor stub
	}
	Cardiologist(String name, String hospital, double fees, String degree, int exp, 
			String spl, String organ)
	{
		super(name, hospital, fees, degree, exp);
		this.spl = spl;
		this.organ = organ;
	}
	
	public void displayCardiologist()
	{
		displayDoctor();
		System.out.println("Specialization : "+spl);
		System.out.println("Organ : "+organ);
	}
}
