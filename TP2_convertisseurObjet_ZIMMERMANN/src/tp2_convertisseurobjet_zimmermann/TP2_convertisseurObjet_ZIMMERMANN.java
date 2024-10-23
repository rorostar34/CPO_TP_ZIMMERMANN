

/*
 * TP2 
 * TDC
 * 23/10/2024
 */


/**
 *
 * @author 33669
 */


package tp2_convertisseurobjet_zimmermann;

import java.util.Scanner;

public class TP2_convertisseurObjet_ZIMMERMANN {
    public static void main(String[] args) {
        // Créer un nouvel objet Convertisseur
        Convertisseur convertisseur = new Convertisseur();
        Scanner scanner = new Scanner(System.in);
        int choix;
        
        // Boucle pour afficher le menu jusqu'à ce que l'utilisateur veuille quitter
        do {
            // Afficher le menu
            System.out.println("\nMenu des conversions de température:");
            System.out.println("1. Convertir Celsius vers Kelvin");
            System.out.println("2. Convertir Kelvin vers Celsius");
            System.out.println("3. Convertir Fahrenheit vers Celsius");
            System.out.println("4. Convertir Celsius vers Fahrenheit");
            System.out.println("5. Convertir Kelvin vers Fahrenheit");
            System.out.println("6. Convertir Fahrenheit vers Kelvin");
            System.out.println("0. Quitter");
            System.out.print("Veuillez choisir une option: ");
            
            // Lire le choix de l'utilisateur
            choix = scanner.nextInt();
            
            // Traiter le choix de l'utilisateur
            switch (choix) {
                case 1:
                    System.out.print("Entrez la température en Celsius: ");
                    float tempCelsius = scanner.nextFloat();
                    System.out.println("Résultat: " + convertisseur.CelsiusVersKelvin(tempCelsius) + " K");
                    break;
                case 2:
                    System.out.print("Entrez la température en Kelvin: ");
                    float tempKelvin = scanner.nextFloat();
                    System.out.println("Résultat: " + convertisseur.KelvinVersCelsius(tempKelvin) + " °C");
                    break;
                case 3:
                    System.out.print("Entrez la température en Fahrenheit: ");
                    float tempFahrenheit = scanner.nextFloat();
                    System.out.println("Résultat: " + convertisseur.FahrenheitVersCelsius(tempFahrenheit) + " °C");
                    break;
                case 4:
                    System.out.print("Entrez la température en Celsius: ");
                    tempCelsius = scanner.nextFloat();
                    System.out.println("Résultat: " + convertisseur.CelsiusVersFahrenheit(tempCelsius) + " °F");
                    break;
                case 5:
                    System.out.print("Entrez la température en Kelvin: ");
                    tempKelvin = scanner.nextFloat();
                    System.out.println("Résultat: " + convertisseur.KelvinVersFahrenheit(tempKelvin) + " °F");
                    break;
                case 6:
                    System.out.print("Entrez la température en Fahrenheit: ");
                    tempFahrenheit = scanner.nextFloat();
                    System.out.println("Résultat: " + convertisseur.FahrenheitVersKelvin(tempFahrenheit) + " K");
                    break;
                case 0:
                    System.out.println("Merci d'avoir utilisé le convertisseur !");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez essayer à nouveau.");
            }
            
            // Afficher le nombre de conversions effectuées
            System.out.println(convertisseur.toString());
        } while (choix != 0);  // Quitter la boucle lorsque l'utilisateur choisit 0
        
        scanner.close(); // Fermer le scanner pour éviter les fuites de mémoire
    }
}
