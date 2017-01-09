package section13;

public class Java149
{
   public static void main( String[] args )
   {
	   int[] numbers = new int[10];
	   int maxnum = 0, numloc = 0;
	   System.out.print( "Array: " );
	   for ( int i = 0; i < numbers.length; i++ )
	   	{
		   numbers[i] = 1 + (int)(Math.random() * 10);
		   System.out.print( numbers[i] + "," );
        }
	   for ( int i = 0; i < numbers.length; i++ )
        {
		   if ( maxnum < numbers[i] )
             {
             maxnum = numbers[i];
             numloc = i;
              }
        }
        System.out.println( "\n\nThe largest value is " + maxnum );
        System.out.println( "It is in  " + numloc+" place." );
    }
}




