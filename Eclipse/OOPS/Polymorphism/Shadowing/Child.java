package Shadowing;

public class Child extends Parent{
	int a = 50;
	static boolean ch = true;
	public void test()
	{
		System.out.println("Non static test from child");
	}
	public static void demo()
	{
		System.out.println("Static demo from child");
	}
}
