package fr.utbm.ap4b.model;

public class Route {
    private final Lieu depart;
    private final Lieu arrivee;
    private final int longueur;
    private final Couleur couleur;
    private final boolean estDouble;
    private Joueur proprietaire;

    public Route(Lieu depart, Lieu arrivee, int longueur, Couleur couleur, boolean estDouble) {
        this.depart = depart;
        this.arrivee = arrivee;
        this.longueur = longueur;
        this.couleur = couleur;
        this.estDouble = estDouble;
        this.proprietaire = null;
    }

    public Lieu getDepart() { return depart; }
    public Lieu getArrivee() { return arrivee; }
    public int getLongueur() { return longueur; }
    public Couleur getCouleur() { return couleur; }
    public boolean isEstDouble() { return estDouble; }
    public Joueur getProprietaire() { return proprietaire; }
    public void setProprietaire(Joueur proprietaire) { this.proprietaire = proprietaire; }

    public int getPoints() {
        return switch (longueur) {
            case 1 -> 1;
            case 2 -> 2;
            case 3 -> 4;
            case 4 -> 7;
            case 5 -> 10;
            case 6 -> 15;
            default -> 0;
        };
    }
}
