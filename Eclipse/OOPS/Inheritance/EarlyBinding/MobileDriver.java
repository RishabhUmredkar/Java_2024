package EarlyBinding;

public class MobileDriver {

	public static void main(String[] args) {
		Mobile mb = new Mobile("redmi", 17000, "blue", 3, "Note13", "SnapDragon", 8, 256);
		mb.displayMobile();
		mb.battery.display();
	}

}
