package com.compagnie;

public class Reservation {
    private String numeroReservation;
    private String dateReservation;
    private String statut;

    public Reservation(String numero, String date) {
        this.numeroReservation = numero;
        this.dateReservation = date;
        this.statut = "Validée";
    }

    public void confirmerReservation() {
        this.statut = "Confirmée";
    }

    public void annulerReservation() {
        this.statut = "Annulée";
    }
}