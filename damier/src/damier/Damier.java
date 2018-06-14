/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package damier;

import java.util.Scanner;
import java.util.Scanner;
/**
 *
 * @author lucie2
 */
public class Damier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // sc est une variable
        Scanner sc = new Scanner(System.in);
        
        //condition qui détecte ce que j'écris de type Int
        if(sc.hasNextInt()) {
            int inputUser = sc.nextInt(); // variable
            
            for (int h = 1; h <= inputUser; h++) { //définir les hauteurs
                
                for(int l =1; l <= inputUser; l++) { //definir les lignes 
                    if((h+l)%2 == 0){ //la condition modulo = formule pour détecter si chiffre pair ou impair
                        System.out.print("■");
                    }else{
                        System.out.print("□");
                    }
                }
                
                System.out.println();
            }
        }
    }  
}
