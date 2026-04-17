package com.compagnie;

public class Aeroport {
    private String nom;
    private String ville;
    private String description;

    public Aeroport(String nom, String ville) {
        this.nom = nom;
        this.ville = ville;
    }

    public void affecterVol() {
        System.out.println("Vol affecté à l'aéroport " + nom);
    }
}