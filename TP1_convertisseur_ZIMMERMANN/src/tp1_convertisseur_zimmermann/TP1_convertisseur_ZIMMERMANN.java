/*
 * TP1 partie 2
 * TDC
 * 23/09/2024
 */
package tp1_convertisseur_zimmermann;

import java.util.Scanner;

/**
 *
 * @author 33669
 */
public class TP1_convertisseur_ZIMMERMANN {

    public static void main(String[] args) {
        double val;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bonjour, saisissez une valeur :");
        val = sc.nextDouble();
        
        System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
        System.out.println("1) De Celsius vers Kelvin");
        System.out.println("2) De Kelvin vers Celsius");
        System.out.println("3) De Fahrenheit vers Celsius");
        System.out.println("4) De Celsius vers Fahrenheit");
        System.out.println("5) De Kelvin vers Fahrenheit");
        System.out.println("6) De Fahrenheit vers Kelvin");
        
        int choix = sc.nextInt();
        
        switch (choix) {
            case 1:
                System.out.printf("%.2f degré Celsius est égal à %.2f degrés Kelvin\n", val, CelciusVersKelvin(val));
                break;
            case 2:
                System.out.printf("%.2f degré Kelvin est égal à %.2f degrés Celsius\n", val, KelvinVersCelcius(val));
                break;
            case 3:
                System.out.printf("%.2f degré Fahrenheit est égal à %.2f degrés Celsius\n", val, FarenheitVersCelcius(val));
                break;
            case 4:
                System.out.printf("%.2f degré Celsius est égal à %.2f degrés Fahrenheit\n", val, CelciusVersFarenheit(val));
                break;
            case 5:
                System.out.printf("%.2f degré Kelvin est égal à %.2f degrés Fahrenheit\n", val, KelvinVersFarenheit(val));
                break;
            case 6:
                System.out.printf("%.2f degré Fahrenheit est égal à %.2f degrés Kelvin\n", val, FarenheitVersKelvin(val));
                break;
            default:
                System.out.println("Choix invalide.");
                break;
        }
        
        sc.close(); // Ferme le scanner à la fin de l'utilisation
    }
    
    public static double CelciusVersKelvin(double tCelsius) {
        return tCelsius + 273.15;
    }
    
    public static double KelvinVersCelcius(double tKelvin) {
        return tKelvin - 273.15;
    }
    
    public static double FarenheitVersCelcius(double tFarenheit) {
        return (tFarenheit - 32) * 5/9;
    }
    
    public static double CelciusVersFarenheit(double tCelcius) {
        return (tCelcius * 9/5) + 32;
    }
    
    public static double KelvinVersFarenheit(double tKelvin) {
        return CelciusVersFarenheit(KelvinVersCelcius(tKelvin)); // Convertir d'abord Kelvin à Celsius puis de Celsius à Fahrenheit
    }
    
    public static double FarenheitVersKelvin(double tFarenheit) {
        return CelciusVersKelvin(FarenheitVersCelcius(tFarenheit)); // Convertir d'abord Fahrenheit à Celsius puis de Celsius à Kelvin
    }
}

