package Multiple_Inheritance;

public class JujuDriver {

	public static void main(String[] args) {
		Raju r1 = new Juju();
		r1.singing();
		
		Kaju k1 = new Juju();
		k1.singing();
		
		Juju j1 = (Juju) k1;
		j1.displayJuju();
		
	}

}
