package Interface;

public interface Calculator {
	public static final double pi = 22.0 / 7.0;
	public abstract void  areaOfCircle(int rad);
	public abstract void areaOfSquare(int side);
	public void areaOfRectangle(int length, int breadth);
	public void areaOfTriangle(int base , int height);
	
	public static void message()
	{
		System.out.println("Welcome to calculator");
	}
}
