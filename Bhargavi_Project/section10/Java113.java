package section10;
public class Java113
{
    public static void main(String[] args)
    {
        System.out.println( "2 <");
        for ( int n = 3 ; n < 21 ; n++ )
        {
            System.out.print("\n" + n + " ");
            if ( isPrime(n) == true ){
                System.out.print("<");
            }
        }
    }
    
    public static boolean isPrime( int n )
    {
        boolean is = true;
        for ( int x = 2 ; x < n ; x++ )
        {
            if ( n % x == 0 ){
                is = false;
            }
        }
        return is;
    }
}