import java.util.*; 
import java.io.*;

class Main {

  public static boolean QuestionsMarks(String str) {
    int question = 0;
    for(int i = 0; i < str.length(); i++){
      if(str.charAt(i) == '?')
        question++;
      if(question == 3)
        return true;
    }
      return false;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(QuestionsMarks(s.nextLine())); 
  }

}
