package section2;
//for problem statement Ref:  https://programmingbydoing.com/
import java.util.Scanner;

public class Java17 {
    
    public static void main( String [] args ) {
        
        Scanner keyboard = new Scanner(System.in);
        
        String fname, lname, login;
        int grade=0; 
         int id;
        double gpa;
        
        System.out.println( "Please Enter the following information so I can sell it for a profit!" );
        
        System.out.print( "\nFirst name: " );
        fname = keyboard.next();
        
        System.out.print( "\nLast name: " );
        lname = keyboard.next();
        
        System.out.print( "\nGrade (9-12): " );
         while(grade < 9 || grade > 12) {
             System.out.println("Invalid Grade");
             System.out.println("Grade (9-12): ");
             grade = keyboard.nextInt();
}		          
         System.out.print( "\nStudent ID: " );
         id = keyboard.nextInt();
        
        System.out.print( "\nLogin: " );
        login = keyboard.next();
        
        System.out.print( "\nGPA (0.0-4.0): " );
        gpa = keyboard.nextDouble();
        
        System.out.println();
        System.out.println( "\nYour information:" );
        System.out.println( "\tLogin: " + login );
        System.out.println( "\tID: " + id );
        System.out.println( "\tName: " + lname + ", " + fname );
        System.out.println( "\tGPA: " + gpa );
        System.out.println( "\tGrade: " + grade );
        
    }
}

