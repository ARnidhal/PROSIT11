package models;

import java.util.Objects;
import java.util.Collections;

public class employes {
    int id;
    String nom;
    String prenom;
    String nom_depart;
    int grade;


    public employes() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom_depart() {
        return nom_depart;
    }

    public void setNom_depart(String nom_depart) {
        this.nom_depart = nom_depart;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public employes(int id, String nom, String prenom, String nom_depart, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nom_depart = nom_depart;
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof employes employes)) return false;
        return id == employes.id  && Objects.equals(nom, employes.nom) && Objects.equals(prenom, employes.prenom) ;
    }

    @Override
    public String toString() {
        return "employes{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nom_depart='" + nom_depart + '\'' +
                ", grade=" + grade +
                '}';
    }



}
