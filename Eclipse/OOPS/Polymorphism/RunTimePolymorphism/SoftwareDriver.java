package RunTimePolymorphism;

public class SoftwareDriver {
	
	public static void main(String[] args) {
		
	MenuSoftware ms = new MenuSoftware();
	ms.Veg();
	System.out.println("*************");
	ms.nonVeg();
	System.out.println("******New menu*******");

	
	MenuSoftware ms2 = new MenuSoftwareV2();
	ms2.Veg();
	System.out.println("*************");

	ms.nonVeg();
	}
}
