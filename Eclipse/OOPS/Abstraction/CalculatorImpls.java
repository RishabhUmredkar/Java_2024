

public class CalculatorImpls extends Calculator{
	public CalculatorImpls() {
		// TODO Auto-generated constructor stub
	}



	@Override
	public void add(int a, int b) {
		System.out.println(a+b);
	}


	@Override
	public void sub(int a, int b) {
		System.out.println(a-b);
	}


	@Override
	public void mul(int a, int b) {
		System.out.println(a*b);
	}


	@Override
	public void div(double a, double b) {
		System.out.println(a/b);
	}

	public static void message()
	{
		System.out.println("this is not useful..");
	}

}