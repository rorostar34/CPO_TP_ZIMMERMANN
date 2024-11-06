/*
 * TP2 
 * TDC
 * 23/10/2024
 */
package tp2_relation_1_zimmermann;

public class Personne {
    String nom;
    String prenom;
    int nbVoitures;
    Voiture[] liste_voitures;  // Tableau pour stocker jusqu'à 3 voitures

    // Constructeur qui initialise les attributs
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.nbVoitures = 0;  // Initialement, la personne ne possède aucune voiture
        this.liste_voitures = new Voiture[3];  // Tableau de 3 voitures maximum
    }

    // Méthode pour ajouter une voiture à la liste de la personne
    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {
        // Vérifier si la voiture a déjà un propriétaire
        if (voiture_a_ajouter.proprietaire != null) {
            System.out.println("Erreur : la voiture appartient déjà à " + voiture_a_ajouter.proprietaire.nom);
            return false;
        }
        // Vérifier si la personne a déjà 3 voitures
        if (nbVoitures >= 3) {
            System.out.println("Erreur : " + nom + " ne peut pas posséder plus de 3 voitures.");
            return false;
        }
        // Ajouter la voiture et mettre à jour le propriétaire
        liste_voitures[nbVoitures] = voiture_a_ajouter;
        nbVoitures++;
        voiture_a_ajouter.proprietaire = this;
        return true;
    }

    // Méthode toString pour afficher les informations de la personne
    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nbVoitures=" + nbVoitures +
                '}';
    }
}