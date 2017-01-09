package section2;
//for problem statement Ref:  https://programmingbydoing.com/
import java.util.Scanner;

public class Java18{
    
    public static void main( String[] args ) {
        
        Scanner keyboard = new Scanner(System.in);
        
        String name;
        int age, agePlus5, ageMinus5;
        
        System.out.print( "Hello. What is your name? " );
        name = keyboard.next();
        
        System.out.print( "\nHi, " + name + "! How old are you? " );
        age = keyboard.nextInt();
        
        agePlus5 = age + 5;
        ageMinus5 = age - 5;
        
        System.out.println( "\nDid you know that in five years you will be " + agePlus5 + " years old?" );
        System.out.println( "And five years ago you were " + ageMinus5 + "! Imagine that!" );
        
    }
}
