package Encapsulation;

public class AccuntDriver {

	public static void main(String[] args) {
		Account ac = new Account("Rishabh", "pnb", 12345, 1234, 500000, "pnb005", "Saving ", "deccan");
		System.err.println("hello");
		
		System.err.println("Account no. "+ac.getAccno());
		System.err.println("balance "+ac.getBalance(12345, 1234));
		System.out.println(ac.toString());

//		ac.setPin(12345, 1234, 789);

//		ac.withdaw(12345, 789, 500000);
//		ac.deposit(12345, 789, 500000);
//		System.err.println("balance "+ac.getBalance(12345, 1234));

	}

}