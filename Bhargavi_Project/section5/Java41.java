package section5;
//for problem statement Ref:  https://programmingbydoing.com/
import java.util.Random;

public class Java41
{
	public static void main ( String[] args )
	{
		Random r = new Random();

		int x = 1 + r.nextInt(10);

		System.out.println( "My random number is " + x );
		//// 1. When the 1 + is removed from the statements below 
                // 	the range becomes 0 - 4
		//// 2. When it is changed to 3 + the range becomes 3 - 7
		System.out.println( "Here are some numbers from 1 to 5!" );
		System.out.print(1 +  r.nextInt(5) + "\t " );
		System.out.print(1 +  r.nextInt(5) + "\t " );
		System.out.print(1 +  r.nextInt(5) + "\t " );
		System.out.print(1 +  r.nextInt(5) + "\t " );
		System.out.print(1 +  r.nextInt(5) + "\t " );
		System.out.print(1 +  r.nextInt(5) + "\t " );
		System.out.println();

		System.out.println( "Here are some numbers from 1 to 100!" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.println();

		int num1 = 1 + r.nextInt(10);
		int num2 = 1 + r.nextInt(10);

		if ( num1 == num2 )
		{
			System.out.println( "The random numbers were the same! Weird." );
		}
		if ( num1 != num2 )
		{
			System.out.println( "The random numbers were different! Not too surprising, actually." );
		}
	}
}

