package com.example.tunisairapp;

public class DemandeConge {

    private String dateDebut, datefin, description, fichier, typeConge;

    public DemandeConge(String dateDebut, String datefin, String description, String fichier, String typeConge)
    {
        this.dateDebut= dateDebut;
        this.datefin= datefin;
        this.description= description;
        this.fichier= fichier;
        this.typeConge= typeConge;
    }

    public String getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getDatefin() {
        return datefin;
    }

    public void setDatefin(String datefin) {
        this.datefin = datefin;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFichier() {
        return fichier;
    }

    public void setFichier(String fichier) {
        this.fichier = fichier;
    }

    public String getTypeConge() {
        return typeConge;
    }

    public void setTypeConge(String typeConge) {
        this.typeConge = typeConge;
    }

}
