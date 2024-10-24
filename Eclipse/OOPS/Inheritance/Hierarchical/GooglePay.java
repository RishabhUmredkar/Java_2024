package Hierarchical;

public class GooglePay extends Upi{
	String upiId;
	int password;
	double cashReward;
	
	public GooglePay() {
		// TODO Auto-generated constructor stub
	}
	public GooglePay(long phno, int cardNo, int pin, String name, String pan, String balance,
			String upiId, int password, double cashReward)
	{
		this.phno = phno;
		this.cardNo = cardNo;
		this.pin = pin;
		this.name = name;
		this.pan = pan;
		this.balance = balance;
		
		this.upiId = upiId;
		this.password = password;
		this.cashReward = cashReward;
	}
	
	public void displayGooglePay()
	{
		displayUPI();
		System.out.println("UPI ID : "+upiId);
		System.out.println("Password : "+ password);
		System.out.println("CashReward : "+cashReward);
	}
}
