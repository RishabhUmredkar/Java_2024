package HashCode;

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
	
	public boolean equals(Object obj)
	{
		Student st = (Student) obj;
		if(this.name == st.name && this.age == st.age && this.college == st.college &&
				this.percent == st.percent && this.year == st.year)
		{
		return true;
		}
		return false;
	}
	
	public int hashCode()
	{
		int hc = age + year + name.hashCode() + college.hashCode();
		return hc;
	}

}
