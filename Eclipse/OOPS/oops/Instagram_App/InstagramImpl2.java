package Instagram_App;

public class InstagramImpl2 extends InstagramImpl{

	public InstagramImpl2(String name, String email, int pass) {
		super(name, email, pass);
	}
	
	@Override
	public void message(String name, String msg) {
		System.out.println(msg);
		System.out.println(name + " Messaged");
		System.out.println("Message Sent ...");
		
	}
	@Override
	public void story(String msg) {
	System.out.println(msg);
	System.out.println("Story Uploaded");
	}
}
