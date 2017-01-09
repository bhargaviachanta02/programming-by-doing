package Section12;

import java.io.File;
import java.util.Scanner;

public class Java130 {
    
    public static void main(String []args) throws Exception {
        
        String name1, name2;
        
        Scanner fileIn = new Scanner(new File("/home/tsuser/Desktop/hig.txt"));
        
        name1 = fileIn.next();
        name2 = fileIn.next();
        
        System.out.println("Your name is " + name1 + " " + name2);
    }
}   