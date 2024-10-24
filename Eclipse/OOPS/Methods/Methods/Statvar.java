package Methods;

public class Statvar {
	static String s="stat";
	String ns = "nonstat";
	public static void main(String[] args) {
		Statvar st = new Statvar();
		System.out.println(s);
		s = "hello";
		System.out.println(s);
		s = "hello1";
		System.out.println(s);
		test();
		System.out.println(st.ns);
		st.ns = "change ns";
		System.out.println(st.ns);
		System.out.println(st.ns);
		
	}
	
	public static void test()
	{
		System.out.println(s + " test method");
		Statvar.s = "hii";
		System.out.println(s);
	}
}
