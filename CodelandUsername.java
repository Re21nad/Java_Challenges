import java.util.*; 
import java.io.*;

class Main {

  public static String CodelandUsernameValidation(String str) {
        if (str.matches("\\A[a-zA-Z][a-zA-Z0-9_]{2,23}[a-zA-Z0-9]\\z")) {
            return "true";
        } else {
            return "false";
        }
    }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(CodelandUsernameValidation(s.nextLine())); 
  }

}
