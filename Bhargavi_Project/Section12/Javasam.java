package Section12;
import java.io.File;
public class Javasam {
//public class FileDemo {
public static void main(String[] args) {
      
      File f = null;
      String v;
      boolean bool = false;
      
      try{
         // create new file
         f = new File("/home/tsuser/Desktop/hig.txt");
         
         // pathname string from abstract pathname
         v = f.getPath();
         
         // true if the file path exists
         bool = f.exists();
         
         // if file exists
         if(bool)
         {
            // prints
            System.out.print("pathname: "+v);
         }
      }catch(Exception e){
         // if any error occurs
         e.printStackTrace();
      }
   }
}