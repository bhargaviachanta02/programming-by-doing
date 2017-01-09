 package section5;

import java.util.Random;
public class Java50 {
   public static void main(String[] args) {
	   // input part:
	   Random rand = new Random();
	   System.out.println("ROLL THE DICE!\n");
	   int total;
	   int firstRoll = 1 +rand.nextInt(3);
	   int secondRoll = 1 + rand.nextInt(3);
	   System.out.println("Roll #1: " + firstRoll);
	   System.out.println("Roll #2: " + secondRoll);
	   total = firstRoll + secondRoll;
	   System.out.println("The total is " + total);
	   
	   
	   // verifying first,second roll:
	   
	   while(firstRoll != secondRoll)
	     {
		   firstRoll =  1 + rand.nextInt(3);
		   secondRoll = 1 +rand.nextInt(3);
		   firstRoll = 1 +rand.nextInt(3);
		   secondRoll = 1 + rand.nextInt(3);
		   System.out.println("Roll #1: " + firstRoll);
		   System.out.println("Roll #2: " + secondRoll);
		   total = firstRoll + secondRoll;
		   System.out.println("The total is " + total);
        }
	   	System.out.println("great");


 }
}