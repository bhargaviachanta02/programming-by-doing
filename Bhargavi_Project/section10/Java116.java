package section10;

import java.util.Scanner;

public class Java116
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println( "Type in a message, and I'll display it ten times." );
        System.out.print( "Message: " );
        int usermessage = keyboard.nextInt();
         int half =  usermessage  / 2 ;
        
        for ( int n = 1 ; n <= half ; n = n+1 )
        {
        	//if ( n >0) {
            System.out.println( n + ". " + usermessage );
             //}
        }

    }
}
