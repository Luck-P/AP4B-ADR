package fr.utbm.ap4b.model;

import java.util.ArrayList;
import java.util.List;

public class Joueur {
    private final String nom;
    private final Couleur couleurJoueur;
    private int score;
    private int wagonsRestants;
    private final List<Carte> main;
    private final List<Ticket> tickets;

    public Joueur(String nom, Couleur couleurJoueur) {
        this.nom = nom;
        this.couleurJoueur = couleurJoueur;
        this.score = 0;
        this.wagonsRestants = 45;
        this.main = new ArrayList<>();
        this.tickets = new ArrayList<>();
    }

    public String getNom() { return nom; }
    public Couleur getCouleurJoueur() { return couleurJoueur; }
    public int getScore() { return score; }
    public int getWagonsRestants() { return wagonsRestants; }
    public List<Carte> getMain() { return main; }
    public List<Ticket> getTickets() { return tickets; }

    public void ajouterPoints(int points) {
        this.score += points;
    }

    public void retirerWagons(int nb) {
        this.wagonsRestants -= nb;
    }
}
