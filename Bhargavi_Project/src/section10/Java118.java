package section10;

import java.util.Scanner;
 
class Java118
{
   public static void main(String args[])
   {
      int userinput, c;
      System.out.println("Enter  a number you want to multiply");
      Scanner in = new Scanner(System.in);
      userinput = in.nextInt();
      System.out.println("Multiplication table of "+userinput+" is :-");
 
      for ( c = 1 ; c <= 10 ; c++ )
         System.out.println(userinput+"X"+ c +" = "+(userinput * c));
   }
}