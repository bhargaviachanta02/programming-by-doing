package section5;
import java.util.Random;

public class Java44 {

    public static void main(String[] args) {

        Random rand = new Random();
        String fortune = "";
        int randNum = rand.nextInt(6);

        if (randNum == 0) {
            fortune = "Respect will come to you when you respect others";
        } else if (randNum == 1) {
            fortune = "You will go somewhere new soon";
        } else if (randNum == 2) {
            fortune = "Stick close to your friends";
        } else if (randNum == 3) {
            fortune = "Help! I'm held hostage at Wong's Fortune Cookie Factory!";
        } else if (randNum == 4) {
            fortune = "A random act of kindness will repay itself";
        } else if (randNum == 5) {
            fortune = "An exciting opportunity will present itself";
        }

        System.out.println("Fortune cookie says: " + fortune);
        System.out.println("\t" +
                (1 + rand.nextInt(54)) + " - " +
                (1 + rand.nextInt(54)) + " - " +
                (1 + rand.nextInt(54)) + " - " +
                (1 + rand.nextInt(54)) + " - " +
                (1 + rand.nextInt(54)) + " - " +
                (1 + rand.nextInt(54))
        );

    }

}
