package Interface;

public class CalculatorImpls implements Calculator{
	public CalculatorImpls() {
		// TODO Auto-generated constructor stub
	}
	public void areaOfCircle(int rad)
	{
		System.out.println(Calculator.pi * (rad*rad));
	}
	public void areaOfSquare(int side)
	{
		System.out.println(side * side);
	}
	public void areaOfRectangle(int len, int bre)
	{
		System.out.println(len * bre);
	}
	public void areaOfTriangle(int base, int hei)
	{
		System.out.println();
	}
	public static void message()
	{
		System.out.println("this is not useful..");
	}
}