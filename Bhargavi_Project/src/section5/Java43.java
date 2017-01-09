package section5;
import java.util.Random;
import java.util.Scanner;

public class Java43 {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int correct = rand.nextInt(10) + 1, guessnum;

        System.out.println("I'm thinking of a number from 1 to 10.");
        System.out.print("Your guess: ");
        guessnum = input.nextInt();

        System.out.println();
        if (correct == guessnum) {
            System.out.println("That's right! My secret number was " + correct + ".");
        } else {
            System.out.println("Sorry, but I was really thinking of " + correct + ".");
        }

    }

}
