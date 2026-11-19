package fr.utbm.ap4b.model;

import java.util.ArrayList;
import java.util.List;

public class Partie {
    private final List<Joueur> joueurs;
    private final Plateau plateau;
    private int indexJoueurCourant;
    private boolean dernierTourDeclenche;

    public Partie() {
        this.joueurs = new ArrayList<>();
        this.plateau = new Plateau();
        this.indexJoueurCourant = 0;
        this.dernierTourDeclenche = false;
    }

    public List<Joueur> getJoueurs() { return joueurs; }
    public Plateau getPlateau() { return plateau; }
    public int getIndexJoueurCourant() { return indexJoueurCourant; }
    public boolean isDernierTourDeclenche() { return dernierTourDeclenche; }
}
