package Hierarchical;

public class DriverPay {

	public static void main(String[] args) {
		GooglePay gp = new GooglePay(8669804, 74185, 4321, "rishabh", "AMUpan45", "45000", 
				"risha@ybl", 8660, 500);

		gp.displayGooglePay();
		System.out.println("+++++++++++++++++++++++");
		gp.displayUPI();
		System.out.println("***************************");

		PhonePay pp = new PhonePay(866980, 78185, 4321, "rishabh", "AMUPan45", "45000", 
				"Rish@ybl","abc122",10);
		
		pp.displayPhonePay();

	}

}
