package section5;

import java.util.Random;
import java.util.Scanner;

public class Java47 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int correct = 1 + rand.nextInt(3), guessnum;

        System.out.println("Three cups are placed in front of you. One of them has a ball in it.");
        System.out.println();
        System.out.println("Which one has the ball?");
        System.out.println();
        System.out.println("   ##       ##       ##");
        System.out.println("  ####     ####     ####");
        System.out.println("  ####     ####     ####");
        System.out.println("   1        2        3");
        System.out.println();
        System.out.print("select one cup? ");
        guessnum = input.nextInt();
        System.out.println();

        if (guessnum == correct) {
            System.out.println("You are correct! The ball was under cup #" + correct + ".");
        } else {
            System.out.println("You are incorrect! The ball was under cup #" + correct + ".");
        }
        System.out.println();
        System.out.println("   ##       ##       ##");
        if (correct == 1) {
            System.out.println("  #AA#     ####     ####");
            System.out.println("  #AA#     ####     ####");
        } else if (correct == 2) {
            System.out.println("  ####     #AA#     ####");
            System.out.println("  ####     #AA#     ####");
        } else {
            System.out.println("  ####     ####     #AA#");
            System.out.println("  ####     ####     #AA#");
        }
        System.out.println("   1        2        3");
    }
}

    


