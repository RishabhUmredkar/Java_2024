package Upcasting;

public class DoctorDriver {
	
	public static void main(String[] args) {
		Doctor dor = new Orthopedic("Rishabh","Multani", 120, "MBBS",5,"treatment","Knee");
		
		Doctor dcr = new Cardiologist("Rishabh","Multani", 120, "MBBS",5,"treatment","lungs");
		
		dor.displayDoctor();
		dcr.displayDoctor();
		
	}

}