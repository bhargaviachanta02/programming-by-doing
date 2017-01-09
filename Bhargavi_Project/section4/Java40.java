package section4;

import java.util.Scanner;
import java.util.InputMismatchException;

       public class Java40
	   {
		   public static void main(String[] args)
		   {
			   Scanner keyboard = new Scanner(System.in);

			   int SecretNumber = 6;
               int guess = 0;
			   System.out.println("Try to guess the secret number from 1 to 10!!!");
			   System.out.println();

			   try
			   {
				   System.out.print("Your guess is: ");
				   guess = keyboard.nextInt();
			   }
			   catch(InputMismatchException e)
			   {
				   System.out.println("WRONG INPUT!");
				   guess = 0;
			   }

			   if (guess == SecretNumber) System.out.println("You guessed! The number is "+ SecretNumber +".");
               else System.out.println("You are wrong! The number is " + SecretNumber + ".");
		   }
	   }
    
