package Hierarchical;

public class Upi {
	long phno;
	int cardNo;
	int pin;
	String name;
	String pan;
	String balance;
	
	public Upi() {
		// TODO Auto-generated constructor stub
	}
	public Upi(long phno, int cardNo, int pin, String name, String pan, String balance)
	{
		this.phno = phno;
		this.cardNo = cardNo;
		this.pin = pin;
		this.name = name;
		this.pan = pan;
		this.balance = balance;
	}
	
	void displayUPI()
	{
		System.out.println("Phone No. : "+ phno);
		System.out.println("Card No : "+cardNo);
		System.out.println("Pin : "+ pin);
		System.out.println("Name : "+name);
		System.out.println("Pan Card : "+ pan);
		System.out.println("Balance : "+ balance);
	}

}
