/*
 * TP2 
 * TDC
 * 23/10/2024
 */
package tp2_bieres_zimmermann;

public class TP2_Bieres_ZIMMERMANN {

    public static void main(String[] args) {
        // Création de quelques objets de type BouteilleBiere
        BouteilleBiere premiereBiere = new BouteilleBiere("Cuvée des trolls", 7.0f, "Dubuisson");
        BouteilleBiere deuxiemeBiere = new BouteilleBiere("Leffe", 6.6f, "Abbaye de Leffe");
        BouteilleBiere troisiemeBiere = new BouteilleBiere("Guinness", 4.2f, "St. James's Gate Brewery");

        // Lire l'étiquette de la première bière
        premiereBiere.lireEtiquette();
        // Décapsuler et afficher la première bière
        premiereBiere.decapsuler();
        System.out.println(premiereBiere);

        // Lire l'étiquette de la deuxième bière
        deuxiemeBiere.lireEtiquette();
        // Ne pas décapsuler la deuxième bière et l'afficher
        System.out.println(deuxiemeBiere);

        // Lire l'étiquette de la troisième bière
        troisiemeBiere.lireEtiquette();
        // Décapsuler et afficher la troisième bière
        troisiemeBiere.decapsuler();
        System.out.println(troisiemeBiere);
    }
}
