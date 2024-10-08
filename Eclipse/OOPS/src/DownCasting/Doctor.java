package DownCasting;

public class Doctor {
	String name;
	String hospital;
	double fees;
	String degree;
	int exp;
	
	public Doctor() {
		// TODO Auto-generated constructor stub
	}
	public Doctor(String name, String hospital, double fees, String degree, int exp)
	{
		this.name = name;
		this.hospital = hospital;
		this.fees = fees;
		this.degree = degree;
		this.exp = exp;
	}
	public void displayDoctor()
	{
		System.out.println("Name : "+name);
		System.out.println("Hospital : "+hospital);
		System.out.println("Fees : "+fees);
		System.out.println("Degree : "+degree);
		System.out.println("Experience : "+exp);
		System.out.println("******************************");
	}

}
