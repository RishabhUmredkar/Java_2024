package LazyBinding;

public class PenDrive {
	String brand;
	double price;
	int memory;
	double speed;
	
	public PenDrive() {
		// TODO Auto-generated constructor stub
	}
	public PenDrive(String brand, double price, int memory, double speed)
	{
		this.brand = brand;
		this.price = price;
		this.memory = memory;
		this.speed = speed;
		System.out.println("PenDrive is Created");
	}
	
	public void displayDrive()
	{
		System.out.println("Brand : "+brand);
		System.out.println("Price : "+price);
		System.out.println("Memory : "+memory);
		System.out.println("Speed : "+speed);
	}
}
