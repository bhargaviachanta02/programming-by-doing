package Section12;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.jar.*;
//for problem statement Ref:  https://programmingbydoing.com/
public class Java128 {

	
	public static void main(String[] args) throws IOException {
	/*	 String absolutePath = temp.getAbsolutePath();
 	    System.out.println("File path : " + absolutePath);
		*/File file = new File("/home/tsuser/Desktop/hig.txt");
		Desktop desktop = Desktop.getDesktop();
        if(file.exists()) desktop.open(file);
        
        //ile = new File("/home/tsuser/Desktop/hig.txt");
        //if(file.exists()) desktop.open(file);
	}
		// TODO Auto-generated method stub

	}


