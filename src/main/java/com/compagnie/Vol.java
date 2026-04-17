package com.compagnie;

public class Vol {
    private String numeroVol;
    private String origine;
    private String destination;
    private String dateHeureDepart;
    private String dateHeureArrivee;
    private String etat;
    private Avion avion;

    public Vol(String numeroVol, String origine, String destination, String depart, Avion avion) {
        this.numeroVol = numeroVol;
        this.origine = origine;
        this.destination = destination;
        this.dateHeureDepart = depart;
        this.avion = avion;
    }

    public void planifierVol() {
        System.out.println("Vol " + numeroVol + " planifié.");
    }

    public void annulerVol() {
        this.etat = "Annulé";
    }

    public String getNumeroVol() {
        return numeroVol;
    }
}