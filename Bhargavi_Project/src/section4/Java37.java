package section4;

import java.util.Scanner;

public class Java37
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in); 
        
        String fn, ln, ym =" ",  mf;
        int age;
        
        System.out.print( "What is your gender? (M or F): " );
        mf = keyboard.next();
        System.out.print( "First Name: " );
        fn = keyboard.next();
        System.out.print( "Last Name: " );
        ln = keyboard.next();
        System.out.print( "Age: " );
        age = keyboard.nextInt();
        System.out.println( "" );
        
        if (mf.equals("M"))
        {
            if(age < 20 )
            {
                System.out.println( "Then I shall call you " + fn + " " + ln + "." );
            }
            else
            {
                System.out.println( "Then I shall call you Mr. " + ln );
            }
        }
        else if (mf.equals("F"))
        {
             if(age > 20 )
             {
                 System.out.print( "Are you married? (y or n) " );
                 ym = keyboard.next();
                 System.out.println( "" );
             }
                if (ym.equals("y"))
                {
                    System.out.println( "Then I shall call you Mrs. " + ln );
                }
                else if (ym.equals("n"))
                {
                    System.out.println( "Then I shall call you Ms. " + ln );
                }
            else 
            {
                System.out.println( "Then I shall call you " + fn + " " + ln );
            }
        }
    }
}

