package section10;

import java.util.Scanner;

public class Java109
{
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        int choice;
        int numberOfKeys = 0;
        int pricePerKey = 10;
        
        System.out.println("hi welcome to keychain shop");

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
            {
                numberOfKeys = addKeychains( numberOfKeys );
                System.out.println("You now have " + numberOfKeys + " keychains.");
            }
            else if (choice == 2)
            {
                numberOfKeys = removeKeychains( numberOfKeys );
                System.out.println("You now have " + numberOfKeys + " keychains.");
            }
            else if (choice == 3)
                viewOrder( numberOfKeys, pricePerKey );
            else if (choice == 4)
                checkout( numberOfKeys, pricePerKey );
            else if (choice >= 5)
           	System.out.println("invalid option select in above given choices");
            else if(choice <= 0)
            	System.out.println("no negative numbers");
        } while (choice != 4);
        }

    public static int addKeychains(int numberOfKeys)
    {
        Scanner k = new Scanner(System.in);
        int keyNumberNow;
        
        System.out.print("You have " + numberOfKeys + " keychains. How many to add? ");
        int add = k.nextInt();
        
      return keyNumberNow = numberOfKeys + add;
        
        
    }

    public static int removeKeychains(int numberOfKeys)
    {
        Scanner k = new Scanner(System.in);
        int keyNumberNow;
        
        System.out.print("You have " + numberOfKeys + " keychains. How many to remove? ");
        int remove = k.nextInt();
        
        return keyNumberNow = numberOfKeys - remove;
        
        
    }

    public static void viewOrder( int numberOfKeys, int pricePerKey )
    {
        int totalCost;
        
        System.out.println("You have " + numberOfKeys + " keychains.");
        System.out.println("Keychains cost $" + pricePerKey + " each.");
        
        totalCost = numberOfKeys * pricePerKey;
        System.out.println("Total cost is $" + totalCost + ".");
    }

    public static void checkout( int numberOfKeys, int pricePerKey)
    {
        Scanner k = new Scanner(System.in);
        int totalCost;
        
        System.out.println("CHECKOUT");
        System.out.println();
        
        System.out.print("What is your name? ");
        String name = k.next();
        
        System.out.println("You have " + numberOfKeys + " keychains.");
        System.out.println("Keychains cost $" + pricePerKey + " each.");
        
        totalCost = numberOfKeys * pricePerKey;
        System.out.println("Total cost is $" + totalCost + ".");
        System.out.println("Thanks for your order, " + name + "!");
    }

}
