package section8;
//for problem statement Ref:  https://programmingbydoing.com/

public class Java71 {
    
    public static void main( String[] args ) {
        
        for ( int n = 1; n <= 10; n = n+1 ) {
            
            if ( n % 3 == 0 ) {
                System.out.println( "Fizz" );
            }
            
            else if ( n % 5 == 0 ) {
                System.out.println( "Buzz" );
            }
            
            else {
                System.out.println( n );
            }
            
        }
    
    }
}

