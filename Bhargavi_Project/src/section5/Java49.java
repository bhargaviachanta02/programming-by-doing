package section5;

import java.util.Random;
import java.util.Scanner;

public class Java49 {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int correct = rand.nextInt(10) + 1, guess;

        System.out.println("i am guseeing a number from 1 to 10.");
        System.out.print("Enter your guess: ");
        guess = input.nextInt();

        System.out.println();
        while  (correct != guess) {
            System.out.println("\nIncorrect guess" );
            System.out.println("try again");
            guess =  input.nextInt();
        }
            System.out.println("correct guess");
        }

    }



