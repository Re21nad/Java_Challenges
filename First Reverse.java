import java.util.*; 
import java.io.*;

class Main {  
  public static String FirstReverse(String str) { 
    if (str.length() == 1) return str;
    return str.charAt(str.length() - 1) + FirstReverse(str.substring(0, str.length() - 1));
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstReverse(s.nextLine())); 
  }   
  
}
