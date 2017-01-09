package section13;
public class Java150
{
   public static void main( String[] args )
   {
        String[] a1 = { "alpha", "beta", "chocolate", "delta", "easy" };//pritnting a1 values
        
         System.out.print("The first array values:\n");
         for ( int ind=0; ind<a1.length; ind++ )
            System.out.print( a1[ind] + " " );
            System.out.println();
            
            // array2 :
            int[] a2 = { 11, 23, 37, 41, 53 };
            System.out.print("The second array  values:\n");// print array 2 values
            for ( int ind = 0; ind < a2.length; ind++ )
              System.out.print( a2[ind] + " " );
              System.out.println();
    }
}


