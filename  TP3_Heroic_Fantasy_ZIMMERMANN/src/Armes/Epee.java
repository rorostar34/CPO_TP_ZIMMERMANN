/*
 * TP3
 * TDC
 * 13/11/2024
 */
package Armes;

import Armes.Arme;

/**
 * Classe Epee qui hérite de la classe abstraite Arme
 */
public class Epee extends Arme {

    private int finesse;

    public Epee(String nom, int niveauAttaque, int finesse) {
        super(nom, niveauAttaque);
        this.finesse = Math.min(finesse, 100);
    }

    @Override
    public String toString() {
        return super.toString() + ", Finesse: " + finesse;
    }

    public int getFinesse() {
        return finesse;
    }
}
