package section5;

import java.util.Scanner;

public class Java48
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int pin = 00001;

		System.out.println("WELCOME TO THE STATE BANK .");
		System.out.print("ENTER YOUR PIN: ");
		int entry = keyboard.nextInt();

		while ( entry != pin )
		{
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
		
 		}
		System.out.println("\nPIN ACCEPTED. YOU CAN NOW  ACCESS TO YOUR ACCOUNT THANK YOU.");
	        
         }
}

