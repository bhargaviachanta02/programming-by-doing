package section7;
import java.util.Scanner;
public class Java66 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a;
		int i;
		Scanner keyboard = new Scanner(System.in);

		// TODO Auto-generated method stub
		System.out.println(" Enter the range:");
		a = keyboard.nextInt();
		for(i = 0; i <= a; i ++) {
			System.out.println("."+i+"." );
		}
  
	}

}
