package Personnages;
import Personnages.Personnage;

public class Guerrier extends Personnage {

    private boolean aCheval;

    // Constructeur pour initialiser Guerrier avec nom, niveau de vie et s'il est à cheval
    public Guerrier(String nom, int niveauVie, boolean aCheval) {
        super(nom, niveauVie);
        this.aCheval = aCheval;
    }

    // Getter pour savoir si le guerrier est à cheval
    public boolean isACheval() {
        return aCheval;
    }

    // Setter pour modifier l'état "à cheval"
    public void setACheval(boolean aCheval) {
        this.aCheval = aCheval;
    }

    // Redéfinition de toString pour inclure le statut "à cheval"
    @Override
    public String toString() {
        return super.toString() + ", aCheval=" + aCheval + '}';
    }

}
