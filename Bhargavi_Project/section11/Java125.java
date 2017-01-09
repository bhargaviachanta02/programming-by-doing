package section11;

import java.util.Scanner;

public class Java125
{
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        int choice;
        
        do
        {
            System.out.println();
            System.out.println("1)find two digit number  <= 56 with sums of digits > 10");
            System.out.println("2) Find two digit number minus number reversed which equals sum of digits");
            System.out.println("3) Quit\n");
            choice = k.nextInt();
            System.out.println();
            
            if (choice == 1)
                fiftysix();
            else if (choice == 2)
                reversenum();
            else if (choice == 3)
            	System.out.println(" bye");
        } while ( choice != 3 );
    }
    
    public static void fiftysix()
    {
        for (int a = 1; a < 6; a++)
            for (int b = 0; b < 10; b++)
            {
                int c = a + b;
                
                if ( c > 10 )
                {
                    int d = a*10 + b;
                    
                    if ( a < 5 || b < 7 )
                        System.out.println( d );
                }
            }
    
    }
    
    public static void reversenum()
    {
        for (int a = 1; a < 10; a++)
            for (int b = 0; b < 10; b++)
            {
                int c = a * 10 + b;
                int d = b * 10 + a;
                int e = a + b;
                
                if ( c - d == e)
                    System.out.println( c );
                
            }
    }
}
