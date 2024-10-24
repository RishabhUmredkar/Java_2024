package Shadowing;

public class Parent {
	int a = 10;
	static char ch = 'z';
	public void test()
	{
		System.out.println("Non static Test from parent ");
	}
	
	public static void demo()
	{
		System.out.println("Static demo from parent");
	}

}
