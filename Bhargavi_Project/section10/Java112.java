package section10;

public class Java112 { 
      public static void main ( String[] args )
        {
    	   System.out.println("if even = <-- ; if div by 3 == $;  if both <=="   );
            for ( int x = 1 ; x <= 20 ; x++ )
            {
                System.out.print( x + " ");
                
                if ( Even(x) == true && DivisibleBy3(x) == true )
                    System.out.println(" <== ");
                else if ( Even(x) == true )
                    System.out.println("  <-- ");
                else if ( DivisibleBy3(x) == true )
                    System.out.println("$");
                else
                    System.out.println();
             }
        }
      public static boolean Even( int n )
      {
          if ( n % 2 == 0)
              return true;
          else
              return false;
      }
    public static boolean DivisibleBy3 ( int n )
      {
          if ( n % 3 == 0)
              return true;
          else
              return false;
      }
   
}
