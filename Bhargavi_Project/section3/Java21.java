package section3;
//for problem statement Ref:  https://programmingbydoing.com/
public class Java21
{
	public static void main( String[] args )
	{
		int people = 30;
		int cats = 30;
		int dogs = 15;

		if ( people < cats ) //'if' lets 'print' (the code under) know if it is ok according  to output the statement
		{
			System.out.println( "Too many cats!  The world is doomed!" );
		}

		if ( people > cats )
		{
			System.out.println( "Not many cats!  The world is saved!" );
		}

		if ( people < dogs )
		{
			System.out.println( "The world is drooled on!" );
		}

		if ( people > dogs )
		{
			System.out.println( "The world is dry!" );
		}

		dogs += 5;

		if ( people >= dogs )
		{
			System.out.println( "People are greater than or equal to dogs." );
		}

		if ( people <= dogs )
		{
			System.out.println( "People are less than or equal to dogs." );
		}

		if ( people == dogs )
		{
			System.out.println( "People are dogs." );
		}
	}
}
