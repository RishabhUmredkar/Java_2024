package ToString;

public class Student {
	String name, college;
	int age , year;
	double percent;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, int age, String college, double percent, int year)
	{
		super();
		this.name = name;
		this.age = age;
		this.college = college;
		this.percent = percent;
		this.year = year;
	}
	
	public String toString()
	{
		return "Name = "+name+
				" \nAge = "+age+
				" \nCollege = "+college+
				" \nPercent = "+percent+
				" \nYear = "+year+"\n****************";
	}
	
	

}
