package com.compagnie;

public abstract class Personne {
    protected String id;
    protected String nom;
    protected String adresse;
    protected String contact;

    public Personne(String id, String nom, String adresse, String contact) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.contact = contact;
    }

    public void obtenirInfos() {
        System.out.println("ID: " + id + ", Nom: " + nom);
    }
}