/*
 * TP1 partie 1
 * TDC
 * 10/10/2024
 */
package tp1_stats_zimmermann;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author 33669
 */
public class TP1_stats_ZIMMERMANN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Création d'un tableau de 6 entiers
        int[] resultat = new int[6]; // Chaque case correspond à une face du dé
        // Initialisation du tableau à 0 est faite automatiquement en Java pour les entiers

        // 2. Demander à l'utilisateur de saisir un nombre entier m
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombre de lancers de dés (m): ");
        int m = scanner.nextInt();

        // 3. Faire une boucle de m itérations pour tirer des nombres aléatoires
        Random random = new Random();
        for (int i = 0; i < m; i++) {
            int nombreAleatoire = random.nextInt(6); // Tire un nombre entre 0 et 5
            resultat[nombreAleatoire]++; // Incrémente le compteur correspondant
        }

        // 4. Afficher le tableau résultat à l’écran
        System.out.println("Résultats des lancers de dés :");
        for (int i = 0; i < resultat.length; i++) {
            System.out.println("Face " + (i + 1) + ": " + resultat[i] + " fois");
        }

        // 5. Afficher les résultats sous forme de pourcentages
        System.out.println("\nPourcentages des lancers :");
        for (int i = 0; i < resultat.length; i++) {
            double pourcentage = (double) resultat[i] / m * 100; // Calcul du pourcentage
            System.out.printf("Face %d: %.2f%%\n", (i + 1), pourcentage); // Affichage formaté
        }

        // Fermer le scanner
        scanner.close();
    }
}
