package Hierarchical;

public class PhonePay extends Upi{

	String upiId;
	String password;
	int disccout;
	
	public PhonePay() {
		// TODO Auto-generated constructor stub
	}
	
	
	public PhonePay(long phno, int cardNo, int pin, String name, String pan, String balance,
			String upiId, String password, int disccount)
	{
		this.phno = phno;
		this.cardNo = cardNo;
		this.pin = pin;
		this.name = name;
		this.pan = pan;
		this.balance = balance;
		
		this.upiId = upiId;
		this.password = password;
		this.disccout = disccount;
	}
	
	public void displayPhonePay()
	{
		displayUPI();
		System.out.println("UPI ID : "+upiId);
		System.out.println("Password : "+ password);
		System.out.println("Discount : "+disccout);
	}
}