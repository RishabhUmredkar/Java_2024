package Methods;

public class ConstructorDriver {

	public static void main(String[] args) {
	ConstructorChain ch = new ConstructorChain();
	ch.display();
	
	ConstructorChain ch1 = new ConstructorChain("raj",21, 1234567890, 40000.00, "pune", 7418529);
	ch1.display();
	}

}
