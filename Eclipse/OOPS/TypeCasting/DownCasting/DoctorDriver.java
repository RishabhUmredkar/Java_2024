package DownCasting;

public class DoctorDriver {
	
	public static void main(String[] args) {
		
//		Doctor dr = new Doctor("abc", "def", 10000, "mcom", 5);
//		dr.displayDoctor();
//		
//		Orthopedic or1 = (Orthopedic)dr; 
//		
		Doctor dor = new Orthopedic("Rishabh","Multani", 120, "MBBS",5,"treatment","Knee");
		
		Doctor dcr = new Cardiologist("Rishabh","Multani", 120, "MBBS",5,"treatment","lungs");
		
		dor.displayDoctor();
		dcr.displayDoctor();
		
		
		Orthopedic or = (Orthopedic) dor;	//DownCasting
		or.displayDoctor();
		or.displayOrthopedic();
		
		Cardiologist cr = (Cardiologist) dcr;
		cr.displayDoctor();
		cr.displayCardiologist();
		
	}

}
