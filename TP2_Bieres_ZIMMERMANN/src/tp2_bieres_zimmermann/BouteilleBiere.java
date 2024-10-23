package tp2_bieres_zimmermann;

/*
 * TP2 
 * TDC
 * 23/10/2024
 */

/**
 *
 * @author 33669
 */
public class BouteilleBiere {
    // Attributs de la classe
    String nom;
    float degreAlcool;
    String brasserie;
    boolean ouverte;

    // Constructeur avec 3 paramètres (nom, degré d'alcool, brasserie)
    public BouteilleBiere(String unNom, float unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false; // La bouteille est fermée par défaut
    }

    // Méthode pour lire l'étiquette de la bouteille
    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom + " (" + degreAlcool + " degrés)");
        System.out.println("Brasserie : " + brasserie);
    }

    // Méthode pour décapsuler la bouteille
    public boolean decapsuler() {
        if (!ouverte) {
            ouverte = true;
            System.out.println("La bouteille est maintenant ouverte.");
            return true;
        } else {
            System.out.println("La bouteille est déjà ouverte !");
            return false;
        }
    }

    // Méthode toString pour retourner une chaîne représentant l'état de la bière
    @Override
    public String toString() {
        String chaine_a_retourner = nom + " (" + degreAlcool + " degrés)";
        chaine_a_retourner += " brassée par " + brasserie;
        chaine_a_retourner += ", ouverte: " + (ouverte ? "oui" : "non");
        return chaine_a_retourner;
    }
}
