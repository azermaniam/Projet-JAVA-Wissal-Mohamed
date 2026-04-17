package com.compagnie;

public abstract class Employe extends Personne {
    protected String numeroEmploye;
    protected String dateEmbauche;

    public Employe(String id, String nom, String adresse, String contact, String numEmp, String date) {
        super(id, nom, adresse, contact);
        this.numeroEmploye = numEmp;
        this.dateEmbauche = date;
    }

    public abstract String obtenirRole();
}