package section2;
//for problem statement Ref:  https://programmingbydoing.com/
import java.util.Scanner;

public class Java20 {
    
    public static void main( String[] args ) {
        
        Scanner keyboard = new Scanner(System.in);
        double m, kg, bmi;
        int ft, in, lbs;
        
        System.out.print( "Your height (feet only): " );
        ft = keyboard.nextInt();
        
        System.out.print( "Your height (inches): " );
        in = keyboard.nextInt();
        
        m = (ft+(in / 12))*0.3048;
        
        System.out.print( "Your weight in lbs: " );
        lbs = keyboard.nextInt();
        
        kg = lbs*0.453592;
        
        bmi = kg / (m*m);
        
        System.out.println( "Your BMI is " + bmi );
    }
}

