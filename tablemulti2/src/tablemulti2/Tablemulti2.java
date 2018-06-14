/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablemulti2;
import java.util.Scanner;
/**
 *
 * @author lucie2
 */
public class Tablemulti2 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // initialisation du scanner
        Scanner sc = new Scanner(System.in);

        //creer la condition Si
            if(sc.hasNextInt()) {
                int Entr = sc.nextInt(); //creation de la variable Entr sous scanner
            
            //Boucle pour créer la table de multiplication avec varibale i 
            for(int i = 1;i <= 10;i++){
                System.out.println(i +"x"+ Entr + "="+ i* Entr );//moyen d'affiche avec System.out.println
            }
               
            }   
    }
}
