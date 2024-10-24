package Methods;

public class ConstructorChain {
	String name;
	int age;
	long phno;
	double sal;
	String location;
	long tel;
	String blood;
	
	public ConstructorChain() {
	}
	
	ConstructorChain(String name, int age, long phno, double sal)
	{
		this.name = name;
		this.age = age;
		this.phno = phno;
		this.sal = sal;
	}
	
	ConstructorChain(String name, int age, long phno, double sal, String location)
	{
		
		this(name, age, phno, sal);
		this.location = location;
	}
	ConstructorChain(String name, int age, long phno, double sal, String location, long tel)
	{
		

		this(name, age, phno, sal, location);
		this.tel = tel;
	}
	
	ConstructorChain(String name, int age, long phno, double sal, String location, long tel, String blood)
	{
		
		this(name, age, phno, sal, location,tel);
		this.blood = blood;
	}
	
	public void display()
	{
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Phone No :" +phno);
		System.out.println("Salary :" + sal);
		System.out.println("Location :"+location);
		System.out.println("Telephone :"+tel);
		System.out.println("Blood Grp :"+blood);
	}
}
