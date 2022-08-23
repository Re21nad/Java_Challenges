import java.util.*; 
import java.io.*;

class Main {

  public static String FirstReverse(String str) {
    
    return new StringBuilder(str).reverse().toString();
  }

  public static void main (String[] args) {  
    
    Scanner s = new Scanner(System.in);
    System.out.print(FirstReverse(s.nextLine())); 
  }

}
