package Single_Inheritance;

public class AccountDriver {
	public static void main(String[] args) {
		SavingAccount ac = new SavingAccount("PNB", "Rishabh", 85941235, "punb005", "Indore", 
				50000, "Savings", 4);
		ac.displaySavingAccount();
		
		System.out.println("**********************");
		ac.displayBankAccount();
	}

}
