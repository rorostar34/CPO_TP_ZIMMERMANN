/*
 * TP0 Exercice 1
 * TDC
 * 17/09/2024
 */
package exo2;

import java.util.Scanner;

/**
 *
 * @author 33669
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Declaration des variables
        
        int result;
        int ind;
       
        result = 0;
        
        
        
        
        int nb;
//nb=5;
Scanner sc = new Scanner(System.in);
System.out.println("\n Entrer le nombre :");
nb=sc.nextInt(); // On demande a sc de donner le prochain entier

// Addition des nb premiers entiers
        ind = 1;
        while (result <= nb) {
            result = result + ind;
        }

// Affichage du resultat
        System.out.println();
        System.out.println("La somme des " + nb + "entiers est: " + result);

}
}