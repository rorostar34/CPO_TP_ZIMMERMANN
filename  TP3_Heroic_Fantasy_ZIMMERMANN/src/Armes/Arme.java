/*
 * TP3
 * TDC
 * 13/11/2024
 */
package Armes;

/**
 * Classe abstraite Arme représentant une arme avec un nom et un niveau d'attaque.
 */


public abstract class Arme {
    private String nom;
    private int niveauAttaque;

    public Arme(String nom, int niveauAttaque) {
        this.nom = nom;
        this.niveauAttaque = Math.min(niveauAttaque, 100);
    }

    public int getNiveauAttaque() {
        return niveauAttaque;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Arme: " + nom + ", Niveau d'attaque: " + niveauAttaque;
    }
}
