package section10;

import java.util.Scanner;

public class Java114
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		double a, b, c;
		String ope;
		System.out.println("enter the operation with space for ex: 2 + 3");

		do
		{
			System.out.print("> ");
			a  = keyboard.nextDouble();
			ope = keyboard.next();
			b  = keyboard.nextDouble();
			 
			if  (a == 0) {
				System.out.println("  sorry  cant run program bye ");	
				break;
			}

			if ( ope.equals("+") )
				c = a + b;
			else if (ope.equals("-") )
				c =  a - b;
			else if (ope.equals("*"))
				c = a * b;
			else if (ope.equals("/"))
				c =  a / b;
		   else
			{
				System.out.println("Undefined operator: '" + ope + "'.");
				c = 0;
			}

			System.out.println(c);

		} while ( a != 0 );
	}
}
