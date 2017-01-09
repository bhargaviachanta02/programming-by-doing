package section4;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Java34
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        String name;
        int age;

        try
        {
            System.out.print( "Give your name " );
            name = keyboard.next();
            System.out.println();

            System.out.print( "Hi, " + name + "! What's your age " );
            age = keyboard.nextInt();
            System.out.println();

            if (age < 16) System.out.println(name+", you can't drive.");
            if (age < 18 && age>=16) System.out.println(name+", you can drive but not vote.");
            if (age < 25 && age>=18) System.out.println(name+", you can vote but not rent a car.");
            if (age>25) System.out.println(name+", you can do pretty much anything.");
        }
        catch (InputMismatchException e)
        {
            System.out.println( "WRONG INPUT" );
        }

    }
}

