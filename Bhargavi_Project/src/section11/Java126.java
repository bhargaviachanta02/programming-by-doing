package section11;
import java.util.Scanner;
import java.util.jar.*;
public class Java126{  
    public static void main(String[] args)  {  
    	Scanner keyboard = new Scanner(System.in);
    	int userinput;
    	System.out.println(" Enter the number to verify armstrong or not");
         userinput = keyboard.nextInt();
    	int c = 0,a,temp;  
       //n=153;//It is the number to check armstrong  
      temp = userinput;  
      while(userinput > 0)  
      {  
      a = userinput % 10;  
      userinput = userinput / 10;  
      c = c + (a*a*a);  
      }  
      if(temp==c)  
      System.out.println("armstrong number");   
     // System.out.println(" tryagain");
     // userinput = keyboard.nextInt();
      else 
          System.out.println("Not armstrong number");   
     }  
  }  