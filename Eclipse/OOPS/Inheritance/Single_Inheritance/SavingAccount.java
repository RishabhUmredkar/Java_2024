package Single_Inheritance;

public class SavingAccount extends BankAccount{
	double balance;
	String type;
	double roi;
	public SavingAccount() {
		// TODO Auto-generated constructor stub
	}
	 public SavingAccount(String name, String accName, long accno, String ifsc, String branch,
			 double balance, String type, double roi )
	 {
		this.name = name;
		this.accName = accName;
		this.accno = accno;
		this.ifsc = ifsc;
		this.branch = branch;
		this.balance = balance;
		this.type = type;
		this.roi = roi;
	 }
	public void displaySavingAccount()
	{
		displayBankAccount();
		System.out.println("Balance : "+balance);
		System.out.println("Type : "+type);
		System.out.println("Rate Of Interest : "+roi);
	}
}