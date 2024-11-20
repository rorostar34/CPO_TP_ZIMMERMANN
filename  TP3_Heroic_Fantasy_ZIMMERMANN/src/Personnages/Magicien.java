package Personnages;
import Personnages.Personnage;

public class Magicien extends Personnage {

    private boolean estConfirme;

    // Constructeur pour initialiser Magicien avec nom, niveau de vie et s'il est confirmé
    public Magicien(String nom, int niveauVie, boolean estConfirme) {
        super(nom, niveauVie);
        this.estConfirme = estConfirme;
    }

    // Getter pour savoir si le magicien est confirmé
    public boolean isEstConfirme() {
        return estConfirme;
    }

    // Setter pour modifier le statut "confirmé"
    public void setEstConfirme(boolean estConfirme) {
        this.estConfirme = estConfirme;
    }

    // Redéfinition de toString pour inclure le statut "confirmé"
    @Override
    public String toString() {
        return super.toString() + ", estConfirme=" + estConfirme + '}';
    }
}