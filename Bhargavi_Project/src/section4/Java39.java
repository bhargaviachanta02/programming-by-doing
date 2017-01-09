package section4;

import java.util.Scanner;

public class Java39
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        String name;
        
        System.out.print( "Last name please? " );
        name = keyboard.next();
        
        if (name.compareToIgnoreCase("Card") < 0)
        {
            System.out.println( "You don't have to wait long." );
        }
        else if (name.compareToIgnoreCase("Smith") < 0)
        {
            System.out.println( "That's not bad." );
        }
        else if (name.compareToIgnoreCase("Bask") < 0)
        {
            System.out.println( "Looks like you're gonna wait a little bit." );
        }
        else if (name.compareToIgnoreCase("Young") < 0)
        {
            System.out.println( "Its gonna be a while." );
        }
        else 
        {
            System.out.println( "Not going anywhere for a while?" );
        }
            
    }
}

