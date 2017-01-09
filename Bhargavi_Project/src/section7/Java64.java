package section7;
import java.util.Scanner;
public class Java64 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
        String a,b,c;
        int A= 3;
        int B =3;
        int C = 3;
        int store;
        int subtract;
	 	System.out.println(" A = 3,B = 3,C = 3");  
		System.out.println(" Pick one pile:");
		a = keyboard.next();
		System.out.println(" how many you want to remove from pile A");
        store =  keyboard.nextInt();
        if ( store == 1) {
        	subtract = A - store;
        
        System.out.println("A = 2,B = 3,C = 3 ");
        }
        if ( store == 2) {
        	subtract = A - store;
        
        System.out.println("A = 1,B = 3,C = 3 ");
        }
        if ( store == 3) {
        	subtract = A - store;
        System.out.println("A = 0,B = 3,C = 3 ");
        }
        
        //For B:
        System.out.println(" how many you want to remove from pile B");
        store =  keyboard.nextInt();
        
        if ( store == 1) {
        	subtract = A - store;
        
        System.out.println("A = 2,B = 2,C = 3 ");
        }
        if ( store == 2) {
        	subtract = A - store;
        
        System.out.println("A = 1,B = 1,C = 3 ");
        }
        if ( store == 3) {
        	subtract = A - store;
        
        System.out.println("A = 0,B = 0,C = 3 ");
        }
        // for C
        
        System.out.println(" how many you want to remove from pile C");
        store =  keyboard.nextInt();
        if ( store == 1) {
        	subtract = B - store;
        
        System.out.println("A = 2,B = 2,C = 2 ");
        }
        if ( store == 2) {
        	subtract = B - store;
        
        System.out.println("A = 1,B = 1,C = 1 ");
        }
        if ( store == 3) {
        	subtract = B - store;
        
        System.out.println("A = 0,B = 0,C = 0 ");
        System.out.println(" game over thanks for playing");
        }
		//System.out.println(" Enter the second pile:");
	    //b = keyboard.next();
	  
	    //System.out.println(" Enter the third Pile:");
     	 //c = keyboard.next();  
		// TODO Auto-generated method stub

	}

}
