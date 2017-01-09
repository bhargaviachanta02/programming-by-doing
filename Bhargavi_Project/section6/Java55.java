package section6;

import java.util.Scanner;

public class Java55 {
    
    public static void main( String[] args ) {
        
        Scanner keyboard = new Scanner(System.in);
        
        int total, userinput;
        total = 0;
        userinput = 1;
        
        System.out.println( "give me a number i will add them:" );
        
        while (  userinput != 0 ) {
            System.out.print( "Number: " );
            userinput = keyboard.nextInt();
            total = total +  userinput;
            System.out.println( "The total so far is " + total );
            
            
         }
            System.out.println();
           System.out.println( "The total is " + total + "." );
      }
 }
