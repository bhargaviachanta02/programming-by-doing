package section6;
import java.util.Scanner;

public class Java60
{
public static void main( String[] args )
{
    Scanner keyboard = new Scanner(System.in);
    int UI;//user input = UI

    do
    {
        System.out.println( "SQUARE ROOT!" );
        System.out.print( "Enter a number: " );
        UI = keyboard.nextInt();

        if ( UI < 0 )
        {
            System.out.println( "You can't get the square root of a negative number." );
            System.out.print( "Try again: " );
            UI = keyboard.nextInt();
        }
    }

    while ( UI > 0 );
    {
        System.out.println( "The square root of " + UI + " is " + Math.sqrt(UI) + "." );
    }
}

}
/*import java.util.Scanner;
public class Java60
{
    public static void main(String[] args)
    {
    	Scanner keyboard = new Scanner(System.in);
    	 double number = 0;
    	 
    	System.out.println(" Enter the number i will give u square of that number:");
    	number = keyboard.nextDouble();
    	while (number < 0) {
            System.out.println("please dont enter any negative or invalid format");
            System.out.println();
      	 }
    	double Sqrt =  Math.sqrt(number);
    	while(number>0){
    	System.out.println(" Square root:" +Sqrt);
    	System.out.println(" try again");
    	number = keyboard.nextDouble();
    	}
        //double number = 16;
        //double squareRoot = Math.sqrt(number);
 
        //Displaying the values
        //System.out.println("number : "+number);
        //System.out.println("Square Root : "+squareRoot);
    }
 
}*/