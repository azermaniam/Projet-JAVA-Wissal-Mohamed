package com.compagnie;

/**
 * Classe de base représentant une personne dans le système.
 * Elle regroupe les attributs communs aux passagers et aux employés.
 */
public abstract class Personne {
    // Attributs
    protected String identifiant;
    protected String nom;
    protected String adresse;
    protected String contact;

    // Constructeur pour initialiser une personne
    public Personne(String identifiant, String nom, String adresse, String contact) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.contact = contact;
    }

    /**
     * Affiche les informations de la personne.
     */
    public void obtenirInfos() {
        System.out.println("--- Informations ---");
        System.out.println("ID      : " + identifiant);
        System.out.println("Nom     : " + nom);
        System.out.println("Adresse : " + adresse);
        System.out.println("Contact : " + contact);
    }

    // Getters simples pour accéder aux données
    public String getIdentifiant() {
        return identifiant;
    }

    public String getNom() {
        return nom;
    }
}