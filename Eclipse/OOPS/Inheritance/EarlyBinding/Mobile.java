package EarlyBinding;

public class Mobile {
	String brand;
	double price;
	String color;
	int cam;
	String model;
	String processor;
	int ram;
	int rom;
	
	Battery battery = new Battery("onePlus", 2000, 4500, 2);
	public Mobile(String brand, double price, String color, int cam, String model, String processor, int ram, int rom)
	{
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.cam = cam;
		this.model = model;
		this.processor = processor;
		this.ram = ram;
		this.rom = rom;
	}
	public void displayMobile()
	{
		System.out.println(brand);
		System.out.println(price);
		System.out.println(color);
		System.out.println(cam);
		System.out.println(model);
		System.out.println(processor);
		System.out.println(ram);
		System.out.println(rom);
}
}
