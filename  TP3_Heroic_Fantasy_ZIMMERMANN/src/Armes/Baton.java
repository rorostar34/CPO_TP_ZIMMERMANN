/*
 * TP3
 * TDC
 * 13/11/2024
 */
package Armes;

import Armes.Arme;

/**
 * Classe Baton qui hérite de la classe abstraite Arme
 */
public class Baton extends Arme {
    // Attribut propre à Baton : âge
    private int age;

    // Constructeur de Baton qui initialise le nom, le niveau d'attaque et l'âge
    public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque); // Appel du constructeur de Arme
        if (age < 0 || age >= 100) {
            throw new IllegalArgumentException("L'âge doit être compris entre 0 et 99.");
        }
        this.age = age;
    }

    // Getter pour l'âge
    public int getAge() {
        return age;
    }

    // Redéfinition de la méthode toString pour inclure l'âge
    @Override
    public String toString() {
        return super.toString() + ", Âge: " + age;
    }
}
