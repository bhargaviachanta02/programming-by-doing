package section13;
public class Java141
{
	public static void main( String[] args )
	{
		int[] basicarr = new int[10000];
		
		for ( int i = 0; i < basicarr.length; i++ )
		{
			basicarr[i] = 10 + (int)(Math.random() * 90);
			System.out.print( ""+basicarr[i] + " \n" );
		}
    }
}