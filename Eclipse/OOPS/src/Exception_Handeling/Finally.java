package Exception_Handeling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		try
		{
		System.out.println("Enter Numerator");
		int num = sc.nextInt();
		
		System.out.println("Enter Denomerator");
		int den = sc.nextInt();
		
			try
			{
				int ans = num/den;
			}
			
			finally {
				System.out.println("try finally");
			}
		}
		
		catch (InputMismatchException e) {
			System.out.println("enter proper");
		}
		finally{
			System.out.println("Before inner finally");
			try{					
			sc = new Scanner(System.in);
			System.out.println("hello");
			int dnum = sc.nextInt();
			System.out.println(dnum);
			System.out.println("heheh");
			}
			catch (Exception e) {
				System.out.println(e);
			}
			finally {
				System.out.println("Inner finally");
			}
			System.out.println("After outer finally");
		}
		
		
		System.out.println("last");
	}
}