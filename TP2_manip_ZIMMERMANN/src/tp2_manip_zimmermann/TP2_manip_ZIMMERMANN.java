/*
 * TP2 
 * TDC
 * 23/10/2024
 */
package tp2_manip_zimmermann;

public class TP2_manip_ZIMMERMANN {


    public static void main(String[] args) {

        // Section 1: Manipulation avec Tartiflette

        Tartiflette assiette1 = new Tartiflette(500);

        Tartiflette assiette2 = new Tartiflette(600);

 

        // assiette3 référence assiette2

        Tartiflette assiette3 = assiette2;

 

        // Vérification des calories

        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);

        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);

 

        // Incrémentation des calories de assiette2

        assiette2.nbCalories += 100;

       

        // Vérification des calories après incrémentation

        System.out.println("Après modification :");

        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);

        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);

 

        // Affichage initial des calories avant échange

        System.out.println("Avant échange :");

        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories);

        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);

 

        // Intervertir les objets référencés par assiette1 et assiette2

        Tartiflette temp = assiette1; // Temp prend la référence de assiette1

        assiette1 = assiette2;        // assiette1 prend la référence de assiette2

        assiette2 = temp;             // assiette2 prend la référence de temp (qui est l'ancienne assiette1)

 

        // Affichage après l'échange

        System.out.println("Après échange :");

        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories);

        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);

 

        // Section 2: Création d'un tableau de 10 références de Moussaka

        Moussaka[] tabMoussaka = new Moussaka[10];

 

        // Initialisation de chaque référence avec un nouvel objet Moussaka

        for (int i = 0; i < tabMoussaka.length; i++) {

            tabMoussaka[i] = new Moussaka(i * 100); // Exemple de valeurs : i*100

        }

 

        // Affichage des calories de chaque Moussaka

        for (int i = 0; i < tabMoussaka.length; i++) {

            System.out.println("Moussaka " + i + " a " + tabMoussaka[i].nbCalories + " calories.");

        }

    }

}
