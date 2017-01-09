package section6;

import java.util.Scanner;

import java.util.Random;

public class Java59 {
    
    public static void main( String[] args ) {
        
        Scanner keyboard = new Scanner(System.in);
        
        Random r = new Random();
        
        int guess, number, tries;
        number = 1 + r.nextInt(10);
        
        System.out.println( "I have chosen a number between 1 and 10." );
        System.out.print( "Your guess: " );
        guess = keyboard.nextInt();
        
        tries = 1;
        
        do {
            System.out.println( "That is incorrect. Guess again .\n" );
            System.out.print( "Your guess is wrong try again: " );
            guess = keyboard.nextInt();
            tries++;
        }while ( guess != number );
        
        System.out.println( " good guesser." );
        System.out.println( "It took you " + tries + " tries." );
    
    }
}

