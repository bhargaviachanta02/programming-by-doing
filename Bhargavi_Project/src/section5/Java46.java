package section5;

import java.util.Random;
import java.util.Scanner;

public class Java46 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int randNumber = 1 + rand.nextInt(10), guess;//getting a random number and stores in a variable.
      // user guess part 
        System.out.print("I'm thinking of a number between 1-10. Guess what it is.\n> ");
        guess =input.nextInt();

        if (guess > randNumber) {
            System.out.println("Sorry, you are thinking too  high. I was thinking of " + randNumber + ".");
        } else if (guess < randNumber) {
            System.out.println("Sorry, you are  thinking too low. I was thinking of " + randNumber + ".");
        } else {
            System.out.println("You guessed it! It was " + randNumber + ".");
        }

    }

}
