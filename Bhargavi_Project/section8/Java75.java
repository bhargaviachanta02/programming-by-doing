package section8;
import java.util.Random;

public class Java75 {   
	public static void main( String[] args ) {
		Random r = new Random(); 
	      int p1 = 1 + r.nextInt(10);
	      int p2 = 1 + r.nextInt(10);
	      int d1 = 1 + r.nextInt(10);
	      int d2 = 1 + r.nextInt(10);
	      int pTotal = p1 + p2;
	      int dTotal = d1 + d2;
	      System.out.println( "Baby Blackjack!" );
	      System.out.println();
	      System.out.println( "You drew " + p1 + " and " + p2 + "." );
	      System.out.println( "Your total is " + pTotal + "." );
	      System.out.println();
	      System.out.println( "The dealer has a " + d1 + " and " + d2 + "." );
	      System.out.println( "Dealer's total is " + dTotal + "." );
	            
	    if ( pTotal > dTotal ) {
	      System.out.println( "YOU WIN!" );
	     }
	     else if ( pTotal < dTotal ) {
	      System.out.println( "YOU LOSE!" );
	      }
	     else {
	      System.out.println( "YOU TIED!" );
	      }
	            
	        }
	    }


	    

