package com.example.tunisairapp;

public class DemandeAutorisation {

    private String heureDebut, heureFin, raison;

    public DemandeAutorisation(String heureDebut, String heureFin, String raison){
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.raison = raison;
    }

    public String getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
    }

    public String getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(String heureFin) {
        this.heureFin = heureFin;
    }

    public String getRaison() {
        return raison;
    }

    public void setRaison(String raison) {
        this.raison = raison;
    }
}
