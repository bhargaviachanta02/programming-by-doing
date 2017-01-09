package section10;

import java.util.Scanner;

public class Java108
{
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        int choice;
        
        System.out.println("Welcome to keychains shop");
        
        do
        {
            System.out.println();
            System.out.println("1. Add Keychains to Order");
            System.out.println("2. Remove Keychains from Order");
            System.out.println("3. View Current Order");
            System.out.println("4. Checkout");
            System.out.println();
            System.out.print("Please enter your choice: ");
            choice = k.nextInt();

            System.out.println();

            if (choice == 1)
                System.out.println(addKeychains());
            else if (choice == 2)
                System.out.println(removeKeychains());
            else if (choice == 3)
                System.out.println(viewOrder());
            else if (choice == 4)
                System.out.println(checkout());
        } while (choice != 4);
    }
    
    public static String addKeychains()
    {
        return "ADD KEYCHAINS";
    }
    
    public static String removeKeychains()
    {
        return "REMOVE KEYCHAINS";
    }
    
    public static String viewOrder()
    {
        return "VIEW ORDER";
    }
    
    public static String checkout()
    {
        return "CHECKOUT";
    }
    
}
