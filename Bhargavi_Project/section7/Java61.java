package section7;
//for problem statement Ref:  https://programmingbydoing.com/
import java.util.Scanner;

public class Java61
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        int side1, side2, side3;
        
        System.out.println("Enter three integers:");
        
        do
        {
            System.out.print("Side 1: ");
            side1 = keyboard.nextInt();
            
            if (side1 <= 0)
                System.out.println(side1 + " is not greater than 0. Try again.");
        } while (side1 <= 0);
        
        do
        {
            System.out.print("Side 2: ");
            side2 = keyboard.nextInt();
            
            if (side2 < side1)
                System.out.println(side2 + " is smaller than " + side1 + ". Try again.");
        } while (side2 <= side1);
        
        do
        {
            System.out.print("Side 3: ");
            side3 = keyboard.nextInt();
            
            if (side3 < side2)
                System.out.println(side3 + " is smaller than " + side2 + ". Try again.");
        } while (side3 <= side2);
        
        System.out.println();
        
        System.out.println("Your three sides are " + side1 + " " + side2 + " " + side3 + ".");
        
        if ( side3 == Math.sqrt(side1*side1 + side2*side2) )
            System.out.println("These sides *do* make a right triangle!");
        else
            System.out.println("NO! These sides do not make a right triangle!");
    }
}
	/*
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int a,b,c;
		
		System.out.println(" Enter the first side length:");
		a = keyboard.nextInt();
		
		System.out.println(" Enter the second side length:");
	    b = keyboard.nextInt();
	  
	    System.out.println(" Enter the third side length:");
     	 c = keyboard.nextInt();  
	 
	    
     	 if(a > b && a > c)
	     {
	         if((a * a) == (b * b) + (c * c))
	         System.out.println("It is a right-angled triangle");
	         else 
	         System.out.println(" not a right-angled triangle");
	     }
	   
	    
	    if(b > c && b > a)
	     {
	            if((b * b) == (c * c) + (a * a))
	            System.out.println("It is a right-angled triangle");
	            else
	            System.out.println(" not a right-angled triangle");
	     }
	
	    
	    if(c > a && c > b)
	    {
	            if((c * c) == (a * a) + (b * b))
	            System.out.println("It is a right-angled triangle");
	            else
	            System.out.println(" not a right-angled triangle");
	     }
	   
	}
	
	}
	
	
*/
	
