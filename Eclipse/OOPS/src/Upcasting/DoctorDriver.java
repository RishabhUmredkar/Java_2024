package Upcasting;

public class DoctorDriver {
	
	public static void main(String[] args) {
		Doctor dr = new Orthopedic("Rishabh","Multani", 120, "MBBS",5,"treatment","Knee");
		
		dr.displayDoctor();
		
	}

}