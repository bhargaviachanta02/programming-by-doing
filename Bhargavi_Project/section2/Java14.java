package section2;
//for problem statement Ref:  https://programmingbydoing.com/
import java.util.Scanner;

public class Java14
{
        public static void main( String[] args )
        {
                Scanner keyboard = new Scanner(System.in);

                int age,inches,feet;
                String height;
                double weight;
                System.out.print( "How old are you? " );
                age = keyboard.nextInt();

                System.out.print( "How tall are you? " );
                height = keyboard.next();

                System.out.print( "How many feet you are?" );
                feet = keyboard.nextInt();

                System.out.print( "How many inches your are ?" );
                inches   = keyboard.nextInt();

                System.out.print( "How much do you weigh? " );
                weight = keyboard.nextDouble();
             System.out.println( "So you're " + age + " old and with a heightof " + height + "feet" +feet+ "inches"+inches+"feet"+ weight + "heavy" );
        }
}

