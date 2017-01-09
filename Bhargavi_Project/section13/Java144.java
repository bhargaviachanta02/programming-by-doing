package section13;

import java.util.Scanner;
public class Java144

{
   public static void main( String[] args )
   {
	   int[] numbers = new int[10];
	   int userNumber;
	   Scanner keyboard = new Scanner(System.in);
	   boolean numFound = false;
	   System.out.print( "Array: " );
	   for ( int i = 0; i < numbers.length; i++ )
	   {
		   numbers[i] = 1 + (int)(Math.random() * 50);// random generation
		   System.out.print( numbers[i] + " " );
       }
	   System.out.println();
	   
	   
	   // checking the value verification part: 
	   System.out.print( "Value to find: " );
	   userNumber = keyboard.nextInt();
	   for ( int i = 0; i < numbers.length; i++ ) 
        {
		   if ( userNumber == numbers[i] && ! numFound )
			  numFound = true;
        }
	   System.out.println();
	   
	   
	   
	   // results display part:
       if (numFound)
         System.out.println( userNumber + " is in the array." );
      else
      System.out.println( userNumber + " is not in the array." );
   }

}







