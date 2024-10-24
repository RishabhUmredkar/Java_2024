package Methods;

public class blocks {
	static {
		System.out.println("Static block1");
	}
	static {
		System.out.println("Static block2");
	}
	
	blocks(){
		System.out.println("Constructor.....");
	}
	
	{
		System.out.println("Non static block1");
	}
	{
		System.out.println("Non static block 2");
	}
	
	public static void main(String[] args) {
		System.out.println("main block1");
		blocks bs = new blocks();
		System.out.println(Statvar.s);
		Statvar st = new Statvar();
		System.out.println(st.ns);
//		st.ns = "change ns";
//		System.out.println(st.ns);
	}
	public static void main(String rishabh) {
		System.out.println("main block2");
		blocks bs = new blocks();
	}
	

}
