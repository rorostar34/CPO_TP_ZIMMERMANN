/*
 * TP3
 * TDC
 * 13/11/2024
 */
package tp3_heroic_fantasy_zimmermann;

import Personnages.Guerrier;
import Personnages.Magicien;
import Personnages.Personnage;
import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import java.util.ArrayList;
import Personnages.*;
import Armes.*;
import tp3_heroic_fantasy_zimmermann.EtreVivant;

public class TP3_Heroic_Fantasy_ZIMMERMANN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Création des armes
        Epee excalibur = new Epee("Excalibur", 7, 5);
        Epee durandal = new Epee("Durandal", 4, 7);
        Baton chene = new Baton("Chêne", 4, 5);
        Baton charme = new Baton("Charme", 5, 6);

        // Création des personnages
        Guerrier conan = new Guerrier("Conan", 78, true);
        Magicien gandalf = new Magicien("Gandalf", 65, false);

        // Ajout d'armes
        conan.ajouterArme(excalibur);
        conan.ajouterArme(durandal);
        gandalf.ajouterArme(chene);
        gandalf.ajouterArme(charme);

        // Equipement
        conan.equiperArme("Excalibur");
        gandalf.equiperArme("Chêne");

        // Combat
        System.out.println("\nDébut du combat !");
        conan.attaquer(gandalf);
        gandalf.attaquer(conan);

        // Affichage des résultats
        System.out.println("\nÉtat des personnages :");
        System.out.println(conan);
        System.out.println(gandalf);
    }
}
