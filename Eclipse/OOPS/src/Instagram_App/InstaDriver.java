package Instagram_App;

public class InstaDriver {

	public static void main(String[] args) {
		Instagram i1 = new InstagramImpl2("Rishabh ","rishabhumredkar0@gmail.com", 1234);
		i1.post("I Am Happy Today....!");
		i1.like("Papa ki pari");
		i1.comment("Papa ki pari", "Y");
		
		i1.message("Rishabh", "Jevlis ka");
		Instagram.msg("Rishabh");
	}

}