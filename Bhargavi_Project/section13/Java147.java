package section13;




import java.util.Scanner;
public class Java147
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int[] numbers = new int[10];
		int usernum, numloc = 0;
		boolean numfound = false;
		System.out.print( "Array: " );
			for ( int i = 0; i < numbers.length; i++ )
			{
				numbers[i] = 1 + (int)(Math.random() * 50);
				System.out.print( numbers[i] + " " );
			}
			System.out.print( "\nValue to find: " );
				usernum = keyboard.nextInt();
				System.out.println();
				for ( int i = 0; i < numbers.length; i++ )
				{
					if ( usernum == numbers[i] )
					{
						numfound = true;
						numloc = i;
					}
				}
				if ( numfound )
					
					System.out.println( usernum + " is  placed in " + numloc + "." );
					
				else
					System.out.println( usernum + " is not in the array." );
				
      }
}





















