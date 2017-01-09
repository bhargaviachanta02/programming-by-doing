package section7;

import java.util.Scanner;

public class Java62
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        int n;
        int x = 0;
       // int count = 1;
        System.out.print("Starting number: ");
        n = keyboard.nextInt();
       /* do
        {
            System.out.print("Starting number: ");
            n = keyboard.nextInt();
        //if (n <= 1)
            System.out.println("Starting number must be greater than 1.");
        } while (n <= 1);
        */
        while ( n != 1 )
        {
            if ( n % 2 == 0 )
            {
                n = n/2;
            }
            else
            {
                n = 3 * n + 1;
            }
            x++;
            //count++;
            
            System.out.print(""+n +".");
        }
        
        System.out.println();
        
        System.out.println("Terminated after " + x + " steps.");
    }
}
