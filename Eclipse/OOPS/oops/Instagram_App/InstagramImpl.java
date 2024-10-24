package Instagram_App;

public abstract class InstagramImpl implements Instagram{
	String name;
	String email;
	int pass;
	public InstagramImpl() {
		// TODO Auto-generated constructor stub
	}
	public InstagramImpl(String name, String email, int pass)
	{
		super();
		this.name = name;
		this.email = email;
		this.pass = pass ;
		System.out.println("Account created");
	}
	@Override
	public void post(String msg) {
		System.out.println(msg);
		System.out.println("Posted");
	}
	@Override
	public void like(String name) {
		System.out.println(name + " Liked");
	}
		
	@Override
	public void comment(String name, String msg) {
		System.out.println(msg);
		System.out.println(name + " Commented..");
	}
	
	
}
