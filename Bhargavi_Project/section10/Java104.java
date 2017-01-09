package section10;
import java.util.Scanner;

public class Java104
{
    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        int shape;
        do
        {
            System.out.println();
            System.out.println("1) Triangle");
            System.out.println("2) Rectangle");
            System.out.println("3) Square");
            System.out.println("4) Circle");
            System.out.println("5) Quit");
            System.out.print("Which shape: ");
            shape = key.nextInt();

            System.out.println();

            if (shape == 1)
            {
                System.out.print("Base: ");
                int base = key.nextInt();

                System.out.print("Height: ");
                int height = key.nextInt();

                System.out.println();

                System.out.println("The area is " + areaTriangle( base, height ) + ".");
            }

            else if (shape == 2)
            {
                System.out.print("Length: ");
                int length = key.nextInt();

                System.out.print("Width: ");
                int width = key.nextInt();

                System.out.println();

                System.out.println("The area is " + areaRectangle( length, width ) + ".");
            }

            else if (shape == 3)
            {
                System.out.print("Side length: ");
                int side = key.nextInt();

                System.out.println();

                System.out.println("The area is " + areaSquare( side ) + ".");
            }

            else if (shape == 4)
            {
                System.out.print("Radius: ");
                int radius = key.nextInt();

                System.out.println();

                System.out.println("The area is " + areaCircle( radius ) + ".");
            }

            else if (shape == 5)
            {
                System.out.println("see you byee.");
            }
            
            else
                System.out.println("Error. Please select a number from the list of shapes.");
            
        } while (shape != 5);
    }
    
    public static double areaCircle( int radius )
    {
        double a;
       return  (a = Math.PI * radius * radius);
        
    }
    
    public static int areaRectangle( int length, int width )
    {
        int a;
        return (a = length * width);
    }    
    public static int areaSquare( int side )
    {
        int a;
       return  (a = side * side);
     
    }
    
    public static double areaTriangle( int base, int height )
    {
        double a;
        return (a = .5 * base * height);
     
    }
    
}