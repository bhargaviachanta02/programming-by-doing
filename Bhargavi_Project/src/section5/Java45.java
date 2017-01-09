package section5;

import java.util.Random;

public class Java45 {

    public static void main(String[] args) {

        Random rand = new Random();

        int i1 = rand.nextInt(6) + 1;
        int i2 = rand.nextInt(6) + 1;

        System.out.println("Look the dice score!");
        System.out.println();
        System.out.println("Roll #1, #2 :" +i1+ "," +i2+ "." );
        System.out.println("The total is " + (i1 + i2) + "!");

    }
}
