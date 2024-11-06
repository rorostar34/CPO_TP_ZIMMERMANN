/*
 * TP2 
 * TDC
 * 23/10/2024
 */
package tp2_relation_1_zimmermann;

public class TP2_relation_1_ZIMMERMANN {
    public static void main(String[] args) {
         // Création des objets Voiture
        Voiture uneClio = new Voiture("Clio", "Renault", 5);
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 4);

        // Création des objets Personne
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");

        // Affichage des voitures disponibles
        System.out.println("Liste des voitures disponibles :");
        System.out.println(uneClio);
        System.out.println(uneAutreClio);
        System.out.println(une2008);
        System.out.println(uneMicra);

        // Ajout de relations entre personnes et voitures
        // Bob possède une Clio
        bob.ajouter_voiture(uneClio);

        // Vérification de l'ajout
        System.out.println("La première voiture de Bob est : " + bob.liste_voitures[0]);

        // Ajout d'une deuxième voiture à Bob et deux voitures à Reno
        bob.ajouter_voiture(uneAutreClio);
        reno.ajouter_voiture(une2008);
        reno.ajouter_voiture(uneMicra);

        // Affichage des voitures de chaque personne
        System.out.println("Voitures de Bob :");
        for (int i = 0; i < bob.nbVoitures; i++) {
            System.out.println(bob.liste_voitures[i]);
        }

        System.out.println("Voitures de Reno :");
        for (int i = 0; i < reno.nbVoitures; i++) {
            System.out.println(reno.liste_voitures[i]);
        }
    }
}
