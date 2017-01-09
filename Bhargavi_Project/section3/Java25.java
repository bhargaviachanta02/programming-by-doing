package section3;

import java.util.Scanner;

public class Java25
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        
        String name;
    int age = 0;    
            
        System.out.println("Hey, What is your name?");
        name = keyboard.next();
        
        System.out.println("Ok "+name+", how old are you?");
         age = keyboard.nextInt();

        if ( age < 16 )
        {
        System.out.println("You Can't drive "+name);
        }
        else if ( age == 17 )
        {
        System.out.println("You can drive but you can't vote "+name);
        }
        else if ( age == 19 )
        {  
        System.out.println("You can vote but not rent a car "+name);
        }
        else if ( age > 25 )
        {
        System.out.println("You can pretty much do anything "+name);
        }

    }
}
