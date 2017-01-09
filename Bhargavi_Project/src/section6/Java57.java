package section6;

import java.util.Random;
import java.util.Scanner;

public class Java57 {
	public static void main( String[] args )
	    {
	        Scanner keyboard = new Scanner(System.in);
	        Random rng = new Random();

	        String again;

	        do {
	            int flip = rng.nextInt(2);
	            String coin;

	            if ( flip == 1 )
	                coin = "HEADS";
	            else
	                coin = "TAILS";

	            System.out.println( "You flip a coin and it is... " + coin );

	            System.out.print( "Would you like to flip again (y/n)? " );
	            again = keyboard.next();
	        } while (again.equals("y"));
	        if(again.equals("n")) {
	         System.out.println(" thank u bye.");
	         //System.out.println();
	        }
	        }

	    }
	