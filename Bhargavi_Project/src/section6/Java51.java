package section6;
//for problem statement Ref:  https://programmingbydoing.com/
import java.util.Scanner;

public class Java51
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
        int a = 10;
        
		System.out.println( "Type in a message, and I'll display it five times." );
		System.out.print( "Message: " );
		String message = keyboard.nextLine();

		//int n = 0;
		for ( int n = 1; n <= 10 ; n = n + 1)
		{
			System.out.println( n*a + ". " + message );
        }

	}
}
