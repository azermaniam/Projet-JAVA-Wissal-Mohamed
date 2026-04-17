package com.compagnie;

public class Pilote extends Employe {
    private String licence;
    private int heuresDeVol;

    public Pilote(String id, String nom, String numEmp, String licence) {
        super(id, nom, "", "", numEmp, "");
        this.licence = licence;
    }

    @Override
    public String obtenirRole() {
        return "Pilote";
    }
    
    public void affecterVol() {
        System.out.println("Pilote " + nom + " affecté au vol.");
    }

    public void obtenirVol() {
        System.out.println("Récupération des vols pour le pilote " + nom);
    }
}