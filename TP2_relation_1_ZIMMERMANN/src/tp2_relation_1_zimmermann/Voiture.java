/*
 * TP2 
 * TDC
 * 23/10/2024
 */
package tp2_relation_1_zimmermann;

public class Voiture {
    String modele;
    String marque;
    int puissance;
    Personne proprietaire;  // Relation : la voiture a un propriétaire

    // Constructeur qui initialise les attributs, avec propriétaire initialisé à null
    public Voiture(String modele, String marque, int puissance) {
        this.modele = modele;
        this.marque = marque;
        this.puissance = puissance;
        this.proprietaire = null;  // Pas de propriétaire initialement
    }

    // Méthode toString pour afficher les informations de la voiture
    @Override
    public String toString() {
        return "Voiture{" +
                "modele='" + modele + '\'' +
                ", marque='" + marque + '\'' +
                ", puissance=" + puissance +
                ", proprietaire=" + (proprietaire != null ? proprietaire.nom : "aucun") +
                '}';
    }
}