package EarlyBinding;

public class Battery {
	String name;
	double price;
	int cap;
	int life;
	
	public Battery() {
		// TODO Auto-generated constructor stub
	}
	public Battery(String name, double price, int cap, int life)
	{
		this.name = name;
		this.price = price;
		this.cap = cap;
		this.life = life;
	}
	public void display()
	{
		System.out.println("Battery name : "+name);
		System.out.println("Price : "+price);
		System.out.println("Capacity : "+cap);
		System.out.println("Life : "+ life);
	}
}
