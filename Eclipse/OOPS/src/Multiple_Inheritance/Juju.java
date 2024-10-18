package Multiple_Inheritance;

public class Juju extends Object implements Raju, Kaju{
	public Juju() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void singing() {
	System.out.println("Pop");	
	}
	public void displayJuju()
	{
		Raju.msg();
		Kaju.msg();
		System.out.println(Raju.grade);
		System.out.println(Kaju.grade);
	}
	
}
