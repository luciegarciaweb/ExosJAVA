import java.util.Scanner;
// Import the scanner object
public class Pyr {
    public static void main(String[] args) {
        // Initialize the scanner object named “sc”
        Scanner sc = new Scanner(System.in);
        // Store the input user in a varaible named “inputUsers”
        int inputUser = sc.nextInt();
        
        // Generate as many times as “inputUser” value, a nextline return 
        for (int line = 0; line < inputUser; line++)
        {
            // Generate as many times as “inputUser” value - line index, a blanc space  
            for (int space = 0; space < inputUser - line; space++){
                System.out.print(" ");
            } 
            // Generate as many times as line values + 2, a stars
            for (int stars = 0; stars <= 2 * line; stars++){
                System.out.print("*"); 
            } 
            
            System.out.println("");
        }
    } 
}