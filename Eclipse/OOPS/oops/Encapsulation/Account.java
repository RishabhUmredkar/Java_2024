package Encapsulation;

public class Account {
	private String name;
	private String bank;
	private long accno;
	private int pin;
	private double balance;
	private String ifsc;
	private String type;
	private String branch;
	
	static {
		System.out.println("this is static from account");
	}
	public Account()
	{
		
	}
	public Account(String name, String bank, long accno, int pin, double balance, String ifsc, String type, String branch)
	{
		this.name = name;
		this.bank = bank;
		this.accno = accno;
		this.pin = pin;
		this.balance = balance;
		this.ifsc = ifsc;
		this.type = type;
		this.branch = branch;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getBank()
	{
		return bank;
	}
	public long getAccno()
	{
		return accno;
	}
	public void setPin(long accno, int oldPin, int newPin)
	{
		if(this.accno == accno && pin == oldPin)
		{
			pin = newPin;
			System.err.println("Pin is updated.....");
		}
		else{
			System.err.println("Invalid Account NO. OR PIN");
		}
	}
	
	public double getBalance(long accno, int pin)
	{
		if(this.accno == accno && this.pin == pin)
		{
			return balance;
		}
		else{
			System.err.println("unsufficient");
			return 0;
		}
	
	}
	
	public void deposit(long accno, int pin, double amt)
	{
		if(amt>0 && this.accno == accno && this.pin == pin)
		{
			balance = balance + amt;
			System.err.println(amt+ " Rs. Deposited..");
		}
		else{
			System.err.println("invalid Credentials...");
		}
	}
	
	public void withdaw(long accno , int pin , double amt)
	{
		if(amt > 0 && this.accno == accno && this.pin == pin)
		{
			if(balance - amt > 2000)
			{
				balance = balance - amt;
				System.err.println(amt + " Rs. is deducted... ThankYou 🙂🙂🙂🙂🙂");
				System.err.println("Balance is "+balance);
			}
			else{
				System.err.println("Insuffecient balance...");
			}
			}
		else {
			System.err.println("Invalid Creadential..");
		}
	}
	@Override
	public String toString() {
		return "Account [name=" + name + ", bank=" + bank + ", accno=" + accno + ", pin=" + pin + ", balance=" + balance
				+ ", ifsc=" + ifsc + ", type=" + type + ", branch=" + branch + "]";
	}
	
	

}
