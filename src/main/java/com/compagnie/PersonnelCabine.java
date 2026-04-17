package com.compagnie;

public class PersonnelCabine extends Employe {
    private String qualification;

    public PersonnelCabine(String id, String nom, String numEmp, String qualification) {
        super(id, nom, "", "", numEmp, "");
        this.qualification = qualification;
    }

    @Override
    public String obtenirRole() {
        return "Personnel Cabine";
    }

    public void affecterVol() {
        System.out.println("Membre cabine " + nom + " affecté.");
    }
}