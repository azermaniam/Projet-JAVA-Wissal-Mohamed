package com.compagnie;

public class Main {
    public static void main(String[] args) {
        // Initialisation du matériel : un Avion
        Avion boeing = new Avion("F-GSPX", "Boeing 777", 300);

        // Planification d'un Vol avec l'avion créé
        Vol volParisNyc = new Vol("AF006", "Paris CDG", "New York JFK", "12/04/2026 08:20", boeing);

        // Création de l'équipage (Pilote et Personnel de Cabine)
        Pilote pilote = new Pilote("P001", "Thomas Pesquet", "EMP42", "L-12345");
        PersonnelCabine hotesse = new PersonnelCabine("C001", "Julie Martin", "EMP88", "Sénior");

        // Création d'un Passager pour la réservation
        Passager passager = new Passager("PASS-99", "Jean Dupont", "12 Rue de Rivoli", "0601020304", "12AA3456");

        System.out.println("=== Simulation Système Aérien ===");
        
        // Affichage des informations de base
        pilote.obtenirInfos();
        System.out.println("Rôle : " + pilote.obtenirRole());

        // Actions sur le vol
        volParisNyc.planifierVol();
        pilote.affecterVol();

        // Simulation d'une réservation par le passager
        passager.reserverVol(volParisNyc);

        System.out.println("=== Fin de la simulation ===");
    }
}