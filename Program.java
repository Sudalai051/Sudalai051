import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Program{  
   public static void main(String[] args) throws IOException{   

   BufferedReader reader1 = new BufferedReader(new FileReader("File1.txt"));  
   BufferedReader reader2 = new BufferedReader(new FileReader("File2.txt"));
      String line1 = reader1.readLine();    
      String line2 = reader2.readLine();
      int lineNum = 1;  
      boolean areEqual = true;
      while (line1 != null || line2 != null){
         if(line1 == null || line2 == null){
            areEqual = false; 
            break;
         } 
         else if(! line1.equalsIgnoreCase(line2)) {
            areEqual = false; 
            break;
         }
         line1 = reader1.readLine();  
         line2 = reader2.readLine();
         lineNum++;
      }
      if(areEqual){
         System.out.println("Both the files have same content");
      } else {
         System.out.println("Both the files have different content");
         System.out.println("In both files, there is a difference at line number: "+lineNum); 
         System.out.println("One file has "+line1+" and another file has "+line2+" at line "+lineNum);
      }
      reader1.close();
      reader2.close();
   }
}