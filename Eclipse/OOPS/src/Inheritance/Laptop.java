package Inheritance;

public class Laptop {
	String brand;
	double price;
	String processor;
	int ram;
	int rom;
	LazyBind PenDrive ;
	
	public Laptop() {
		// TODO Auto-generated constructor stub
	}
	Laptop(String brand, double price, String processor, int ram, int rom)
	{
		this.brand = brand;
		this.price = price;
		this.processor = processor;
		this.ram = ram;
		this.rom = rom;
		System.out.println("laptop is created");
	}
	
	public void insertDrive(String brand , double price, int memory, double speed){
		PenDrive = new LazyBind(brand, price, memory, speed);
		System.out.println("PenDrive is Inserted");
	}
	
	public void displayLaptop()
	{
		System.out.println("Brand : "+brand);
		System.out.println("Price : "+price);
		System.out.println("Processor : "+processor);
		System.out.println("RAM : "+ram);
		System.out.println("CAPACITY : "+rom);
	}
}