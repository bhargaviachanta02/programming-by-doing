package section4;


import java.util.Scanner;
  
  public class Java35
  {
      public static void main(String[] args)
      {
          Scanner keyboard = new Scanner(System.in); 
          
          String q1, q2;
              
   

          System.out.println( "Think of something and I'll try to guess it!" );
          System.out.println( "" );
          System.out.print( "(Question 1) Does it stay inside or outside or both? " );
          q1 = keyboard.next();
          System.out.print( "(Question 2) Is it a living thing? " );
          q2 = keyboard.next(); 
          System.out.println();
          if (q1.equals("inside") && (q2.equals("yes")))
          {
              System.out.println( "Then what else could you be thinking of besides a houseplant?!?" );


          }
          if (q1.equals("inside") && (q2.equals("no")))
          {
              System.out.println( "Then what else could you be thinking of besides a shower curtain?!?" );
          }
          if (q1.equals("outside") && (q2.equals("yes")))
          {
              System.out.println( "Then what else could you be thinking of besides a bison?!?" );
          }
          if (q1.equals("outside") && (q2.equals("no")))
          {
              System.out.println( "Then what else could you be thinking of besides a billboard?!?" );
          }
          if (q1.equals("both") && (q2.equals("yes")))
          {
              System.out.println( "Then what else could you be thinking of besides a dog?!?" );
          }
          if (q1.equals("both") && (q2.equals("no")))
          {
              System.out.println( "Then what else could you be thinking of besides a cell phone?!?" );
          }
      }
  }
