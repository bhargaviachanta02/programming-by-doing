package section11;
//for problem statement Ref:  https://programmingbydoing.com/
public class Java119
{
	public static void main( String[] args )
	{
		// this is #1 - I'll call it "CN"
		for ( int n=1; n <= 3; n++ )
        {
            for ( char c='A'; c <= 'E'; c++ )
            {
				System.out.println( c + " " + n ); // n in inner loop changes faster
			} // if we  changing order of loops, the c variable changes faster
		}

		System.out.println("\n");

		// this is #2 - I'll call it "AB"
		for ( int a=1; a <= 3; a++ )
		{
			for ( int b=1; b <= 3; b++ )
			{
				System.out.print( a + "-" + b + " " ); // changing this to println turns it into a column like CN loop
			}
			System.out.println();
		}

		System.out.println("\n");

	}
}