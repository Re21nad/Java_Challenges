import java.util.*; 
import java.io.*;

class Main {
public static String LongestWord(String sen) { 
  // Replace all non letters.
    String[] str = sen.replaceAll("[^A-Za-z0-9\s]", "").trim().split(" ");
    String longestWord = str[0]; // Take the first string.
    for (int i = 1; i < str.length; i++) {
        if (longestWord.length() < str[i].length()) // Check for the longest word
            longestWord = str[i]; // Take the longest word.
    }
    return longestWord;
    
  } 

  public static void main (String[] args) {  
       
    Scanner s = new Scanner(System.in);
    System.out.print(LongestWord(s.nextLine())); 
  }
