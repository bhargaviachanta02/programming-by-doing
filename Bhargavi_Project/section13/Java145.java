package section13;


import java.util.Scanner;
public class Java145
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int[] numbers = new int[10];
		int usernum;
		int locationfound = 0;
		System.out.print( "Array: " );
		for ( int i = 0; i < numbers.length; i++ )
		{
			numbers[i] = 1 + (int)(Math.random() * 50);
			System.out.print( numbers[i] + " " );
		}
		System.out.println();
		System.out.print( "Value to find: " );
		usernum = keyboard.nextInt();
		System.out.println();
		for ( int i = 0; i < numbers.length; i++ )
		{
			if ( numbers[i] == usernum )
				locationfound++;
		}
		System.out.println( usernum + " was found " + locationfound + " times." );
   }

}













