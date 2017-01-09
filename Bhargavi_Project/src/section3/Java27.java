package section3;

import java.util.Scanner;

public class Java27
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        String name;
        int Q1, Q2, Q3, sum;
        sum = 0;




        System.out.println("Hy let's start  the quiz please enter your name ?");
       name =  keyboard.next();
        
        System.out.println("OK,"+name+" HERE IT COMES!");   
        System.out.println();
        System.out.println("Q1) What is the Capital of Alaska?");
        System.out.println("	  1) Melbourne");
        System.out.println("	  2) Anchorage");
        System.out.println("	  3) Juneau");
        System.out.println();
        System.out.println("select one option");
        Q1 = keyboard.nextInt();
        if (Q1 == 3)
        {
            System.out.println("That's right");
              sum++;
        }
        else if (Q1 == 2 && Q1 == 1 )
        {
            System.out.println("Sorry,you're wrong.");
        }
       // else
       // {
         //   System.out.println("Sorry,you're wrong.");
       // }
        System.out.println(" Q2) Can you store the value cat in a variable of type int?");
        System.out.println("    1) yes");
        System.out.println("    2) no");
        System.out.println();
        System.out.println("select one option:");
        Q2 = keyboard.nextInt();
        if (Q2 == 1)
        {
            System.out.println("Sorry,you're wrong.");
        }
        else if (Q2 == 2)
        {
            System.out.println("That's right.");
            sum++;
        }
        System.out.println("Q3) What is the result of 9+6/3?");
        System.out.println("    1) 5");
        System.out.println("    2) 11");
        System.out.println("    3) 15/3");
        System.out.println();
        System.out.println("select one option");
        Q3 = keyboard.nextInt();
        if (Q3 == 2)
        {
            System.out.println("That's right.");
            sum++;
        }
        else if(Q3 ==1)
        {
            System.out.println("Sorry,you're wrong.");
        }
        else
        {
             System.out.println("Sorry,you're wrong.");
        }
             System.out.println("Overall, you got "+ sum +" out of 3 correct.");
             System.out.println("Thanks for playing");
    }
}

