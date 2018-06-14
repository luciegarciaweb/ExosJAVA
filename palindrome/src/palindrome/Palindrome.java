/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;
import java.util.Scanner;
/**
 *
 * @author lucie2
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String original, reverse = ""; // Objects of String class
       Scanner in = new Scanner(System.in); //Initialiser
       
       System.out.println(""); //Write next line the original word
       original = in.nextLine();//Get what I wrote
      
      
       int length = original.length(); //Get the character number
 
       for ( int i = length - 1; i >= 0; i-- ) //The loop read each character of the word
         reverse = reverse + original.charAt(i);
 
       if (original.equals(reverse)) //Condition compares original word and the reverse one
         System.out.println("Entered string is a palindrome.");
       else
         System.out.println("Entered string is not a palindrome.");
    }
    
}
