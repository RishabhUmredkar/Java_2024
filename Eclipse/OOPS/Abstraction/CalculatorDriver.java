

public class CalculatorDriver {
	public static void main(String[] args) {
		Calculator cal = new CalculatorImpls();
		cal.add(10, 20);
		cal.sub(20, 10);
		cal.mul(10, 20);
		cal.div(10, 2);
		cal.msg();
		
	}
}
