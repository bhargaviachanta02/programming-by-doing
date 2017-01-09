package section2;
//for problem statement Ref:  https://programmingbydoing.com/

import java.util.Scanner;
    
    public class Java19{
        
        public static void main( String[] args ) {
        
            Scanner keyboard = new Scanner(System.in);
    
            Double num1, num2, num3, Res;
    
            System.out.print( "Enter your first number? " );
            num1 = keyboard.nextDouble();
    
            System.out.print( "Enter your second number? " );
            num2 = keyboard.nextDouble();
    
            System.out.print( "Enter your third number? " );
            num3 = keyboard.nextDouble();
            
            Res = (num1 + num2 + num3) / 2;
    
            System.out.println( "\n( " + num1 + " + " + num2 + " + " + num3 + " ) / 2 is... " + Res);
            
        }
    }
