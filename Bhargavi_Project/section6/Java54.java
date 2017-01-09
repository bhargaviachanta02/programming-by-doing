package section6;

import java.util.Scanner;

import java.util.Random;

public class Java54{
    
    public static void main( String[] args ) {
        
        Scanner keyboard = new Scanner(System.in);
        
        Random r = new Random();
        
        int number = 1 + r.nextInt(10);
        
        System.out.println( "let's think of a number between 1-10. You have   only 7 chances." );
        System.out.print( "First guess: " );
        int guess = keyboard.nextInt();
        int tries = 1;
        
        while ( guess != number && tries < 7 ) {
            if ( guess > number ) {
                System.out.println( "Sorry, your guess is too high." );
            }
            
            if ( guess < number ) {
                System.out.println( "Sorry, your guess is too low." );
            }
            
            tries++;
            
            System.out.print( "Guess #" + tries + ":" );
            guess = keyboard.nextInt();
        }
        
        
        if ( guess != number ) {
            System.out.println( "Sorry, you didn't guess it in 7 tries. You lose." );
        }
        
        if ( guess == number ) {
            System.out.println( "Wow, you got it in only " + tries + "  good tries! " );
        }
        
    }
}