package section1;
//for problem statement Ref:  https://programmingbydoing.com/
public class Java8 {

		public static void main( String[] args )
		{
			System.out.println( "I will now count my chickens:" );

			System.out.println( "Hens " + ( 25.2 + 30 / 6 ) );//This line lists the number of Hens by adding 25 and 5
			System.out.println( "Roosters " + ( 100 - 25 * 3 % 4 ) );//This line lists the number of Roosters by subtracting 3% of 100 from 100

			System.out.println( "Now I will count the eggs:" );

			System.out.println( 3 + 2 + 1 - 5 + 4 % 2 - 1 / 4 + 6 );//This line uses PEMDAS to find the number of eggs

			System.out.println( "Is it true that 3 + 2 < 5 - 7?" ); //This line determines whether this inequality is true

			System.out.println( 3 + 2 < 5 - 7 );

			System.out.println( "What is 3 + 2? " + ( 3 + 2 ) );// adds both the numbers
			System.out.println( "What is 5 - 7? " + ( 5 - 7 ) );// subtract 7-5

		      	System.out.println( "Oh, that's why it's false." );

		//	System.out.println( "How about some more." );

			System.out.println( "Is it greater? " + ( 5 > -2 ) );
			System.out.println( "Is it greater or equal? " + ( 5 >= -2 ) );
			System.out.println( "Is it less or equal? " + ( 5 <= -2 ) );
		}
	}

