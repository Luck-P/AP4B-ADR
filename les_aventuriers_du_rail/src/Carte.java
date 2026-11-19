package fr.utbm.ap4b.model;

public class Carte {
    private final Couleur couleur;

    public Carte(Couleur couleur) {
        this.couleur = couleur;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public boolean estLocomotive() {
        return this.couleur == Couleur.LOCOMOTIVE;
    }
}
