package section7;

import java.util.Scanner;

public class Java67 {

	public static void main(String[] args) {
		int a,b,c;
		int i;
		Scanner keyboard = new Scanner(System.in);

		// TODO Auto-generated method stub
		System.out.println(" count from:");
		a = keyboard.nextInt();
		
		System.out.println(" count to:");
		b = keyboard.nextInt();
		
		System.out.println(" count by:");
		c = keyboard.nextInt();
		
		for(i = a; i <= b;i++) {
			int s = i * c;
			System.out.println(+s+"." );
			
		}
  
	}

}
