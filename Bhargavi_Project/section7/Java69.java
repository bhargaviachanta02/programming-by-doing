package section7;

public class Java69 {
    
    public static void main( String[] args ) {
        
        double x, y;
        
        x = -10;
        
        System.out.println( " x \t y" );
        System.out.println( "---------------" );
        
        for ( x = -5; x <= 5; x = x + 0.5 ) {
            y = x * x;
            System.out.println( x + "\t" + y );
        }
        
        System.out.println();
        
    }
}

