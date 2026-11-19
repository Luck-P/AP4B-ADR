package fr.utbm.ap4b.model;

import java.util.ArrayList;
import java.util.List;

public class Plateau {
    private final List<Lieu> lieux;
    private final List<Route> routes;
    private final List<Carte> piocheCartes;
    private final List<Carte> defausseCartes;
    private final List<Carte> cartesVisibles;
    private final List<Ticket> piocheTickets;

    public Plateau() {
        this.lieux = new ArrayList<>();
        this.routes = new ArrayList<>();
        this.piocheCartes = new ArrayList<>();
        this.defausseCartes = new ArrayList<>();
        this.cartesVisibles = new ArrayList<>();
        this.piocheTickets = new ArrayList<>();
    }

    public List<Lieu> getLieux() { return lieux; }
    public List<Route> getRoutes() { return routes; }
    public List<Carte> getPiocheCartes() { return piocheCartes; }
    public List<Carte> getDefausseCartes() { return defausseCartes; }
    public List<Carte> getCartesVisibles() { return cartesVisibles; }
    public List<Ticket> getPiocheTickets() { return piocheTickets; }
}
