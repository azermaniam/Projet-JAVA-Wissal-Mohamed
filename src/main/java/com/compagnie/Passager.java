package com.compagnie;

import java.util.ArrayList;
import java.util.List;

public class Passager extends Personne {
    private String passeport;
    private List<Reservation> reservations = new ArrayList<>();

    public Passager(String id, String nom, String adresse, String contact, String passeport) {
        super(id, nom, adresse, contact);
        this.passeport = passeport;
    }

    public void reserverVol(Vol vol) {
        Reservation res = new Reservation("R-" + vol.getNumeroVol(), "10/04/2026");
        reservations.add(res);
        System.out.println("Réservation confirmée pour " + nom);
    }

    public void annulerReservation() {
        System.out.println("Réservation annulée.");
    }
}