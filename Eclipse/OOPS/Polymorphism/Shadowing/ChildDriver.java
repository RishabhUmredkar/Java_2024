package Shadowing;

public class ChildDriver {
	public static void main(String[] args) {
		Parent p1 = new Child();
		p1.demo();
		p1.test();
		
		Child cd = (Child) p1;
		cd.test();
		cd.demo();
		
	}
}
