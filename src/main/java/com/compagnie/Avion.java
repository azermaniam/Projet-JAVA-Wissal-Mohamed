package com.compagnie;

public class Avion {
    private String immatriculation;
    private String modele;
    private int capacite;

    public Avion(String immatriculation, String modele, int capacite) {
        this.immatriculation = immatriculation;
        this.modele = modele;
        this.capacite = capacite;
    }

    public boolean verifierDisponibilite() {
        return true;
    }

    public void affecterVol() {
        System.out.println("Avion " + immatriculation + " assigné.");
    }
}