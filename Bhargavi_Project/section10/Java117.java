package section10;
import java.util.Scanner;

public class Java117
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println( "Type in a message, and I'll display it ten times." );
        System.out.print( "Message: " );
        int message = keyboard.nextInt();
         int half =  message /2;
        
        for ( int n = 1 ; n <= half ; n = n+1 )
        {
        	if ( n >0) {
            System.out.println( n + ". " + message );
             }
        }

    }
}
