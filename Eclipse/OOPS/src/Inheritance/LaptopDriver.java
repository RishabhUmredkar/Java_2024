package Inheritance;

public class LaptopDriver {

	public static void main(String[] args) {
		Laptop lp = new Laptop("Asus", 450000, "I5", 8, 256);
		lp.displayLaptop();
		lp.insertDrive("sanDisk", 1000, 500, 50);
		lp.PenDrive.displayDrive();
		
	}

}