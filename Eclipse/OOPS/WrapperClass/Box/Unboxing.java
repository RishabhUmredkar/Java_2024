package Box;

public class Unboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Boolean bl = new Boolean(true);
		System.out.println("Boolean : "+bl);
		boolean bl1 = bl.booleanValue();
		System.out.println("boolean : "+bl1);

		System.out.println("***********************");
		
		byte b1 = 5;
		Byte b = new Byte(b1);
		System.out.println("Byte : "+b);
		byte b2 = b.byteValue();
		System.out.println("byte : "+b2);
		System.out.println("***********************");
		
		short st = 5;
		Short s = new Short(st);
		System.out.println("Short : "+s);
		short s1 = s.shortValue();
		System.out.println("short : "+s1);

		System.out.println("***********************");
		
		Integer i = new Integer(123);
		System.out.println("Integer : "+i);
		int i1 = i.intValue();
		System.out.println("int : "+i1);

		System.out.println("***********************");
		
		Long l = new Long(1234);
		System.out.println("Long : "+l);
		long l1 = l.longValue();
		System.out.println("long : "+l1);

		System.out.println("***********************");
		
		Float ft = new Float(123.1);
		System.out.println("Float :"+ft);
		float f = ft.floatValue();
		System.out.println("float :"+f);

		System.out.println("***********************");
		
		Character ch = new Character('R');
		System.out.println("Character :"+ch);
		char c = ch.charValue();
		System.out.println("char : "+c);

		System.out.println("***********************");
		
		Double dl = new Double(41852);
		System.out.println("Double : "+dl);
		double d = dl.doubleValue();
		System.out.println("double : "+d);
	}

}
