package Exception_Handeling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try
		{
		System.out.println("Enter Numerator");
		int num = sc.nextInt();
		
		System.out.println("Enter Denomerator");
		int den = sc.nextInt();
		
			int ans = num/den;
		}
		catch (ArithmeticException e) 
		{
			try 
			{
				System.out.println(10/0);
			}
			catch (Exception e1) 
			{
				System.out.println(e1);
			}
				System.out.println("Cann't be divide by 0 "+e);
		}
		catch (InputMismatchException e) {
			System.out.println("enter proper");
		}
//		sc = new Scanner(System.in);
		System.out.println("hello");
		int dnum = sc.nextInt();
		System.out.println(dnum);
		System.out.println("heheh");
	}

}
