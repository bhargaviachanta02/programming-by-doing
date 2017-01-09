package section13;

import java.util.Scanner;
public class Java146

{
       public static void main( String[] args )
       {
         int[] numbers = new int[10];
         int usernum;
         Scanner keyboard = new Scanner(System.in);
         boolean numfound = false;
         System.out.print( "Array: " );
         for ( int i = 0; i < numbers.length; i++ )
         {
        	 numbers[i] = 1 + (int)(Math.random() * 150);
        	 System.out.print( numbers[i] + " " );
         }
         System.out.println();
         System.out.print( "Value to find: " );
         usernum = keyboard.nextInt();
         for ( int i = 0; i < numbers.length; i++ )
          {
          if ( usernum == numbers[i] && ! numfound )
           numfound = true;
          }
         System.out.println();
          if (numfound)
          System.out.println( usernum + " is in the array." );
          else
           System.out.println( usernum + " is not in the array." );
      }
}











