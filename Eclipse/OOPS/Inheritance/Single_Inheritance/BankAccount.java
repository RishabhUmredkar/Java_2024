package Single_Inheritance;

public class BankAccount {
	String name;
	String accName;
	long accno;
	String ifsc;
	String branch;
	
	public BankAccount() {
		// TODO Auto-generated constructor stub
	}
	
	public BankAccount(String name, String accName, long accno, String ifsc, String branch)
	{
		this.name = name;
		this.accName = accName;
		this.accno = accno;
		this.ifsc = ifsc;
		this.branch = branch;
	}
	
	public void displayBankAccount()
	{
		System.out.println("Name : "+name);
		System.out.println("Account Name : "+accName);
		System.out.println("Account No. : "+accno);
		System.out.println("IFSC CODE : "+ifsc);
		System.out.println("Branch : "+branch);
	}
}
