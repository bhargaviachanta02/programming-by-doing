package section3;

import java.util.Scanner;

public class Java26
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        
        double weightEarth, planet, V, M, J, S, U, N;
        V= 0.78;
        M= 0.39;
        J= 2.65;
        S= 1.17;
        U= 1.05;
        N= 1.23;
        
        
        System.out.print( "Please enter your current earth weight: ");
        weightEarth = keyboard.nextDouble();
        
        System.out.println();
        
        System.out.println("I have information for the following planets: ");
        System.out.println("1. Venus    2. Mars    3. Jupiter");
        System.out.println("4. Saturn   5. Uranus  6. Neptune");
        System.out.println();
        System.out.print("Which planet are you visiting?");
        planet = keyboard.nextDouble();
        
        if (planet == 1)
                         {
                             System.out.println("Your weight would be " + (weightEarth*V)+"pounds on the venus.");
                         }
        else if (planet == 2)
                         {
                             System.out.println("Your weight would be " + (weightEarth*M)+"pounds  on the Mars.");
                         }
        else if (planet == 3)
                         {
                             System.out.println("Your weight would be " + (weightEarth*J)+"pounds on the jupiter.");
                         }
        else if (planet == 4)
                         {
                             System.out.println("Your weight would be " + (weightEarth*S)+"pounds on that Saturn.");
                         }
        else if (planet == 5)
                         {
                             System.out.println("Your weight would be " + (weightEarth*U)+"pounds on that Uranus.");
                         }
        else if (planet == 6)
                         {
                             System.out.println("Your weight would be " + (weightEarth*N)+"pounds on that Neptune.");
                         }
                         
         }
    }
