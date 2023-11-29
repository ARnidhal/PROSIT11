package models;

import java.util.Objects;

public class departement {

    int id;
    String  nom_depart;
    int nb_employes;


    public departement(int id, String nom_depart, int nb_employes) {
        this.id = id;
        this.nom_depart = nom_depart;
        this.nb_employes = nb_employes;
    }

    public departement() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_depart() {
        return nom_depart;
    }

    public void setNom_depart(String nom_depart) {
        this.nom_depart = nom_depart;
    }

    public int getNb_employes() {
        return nb_employes;
    }

    public void setNb_employes(int nb_employes) {
        this.nb_employes = nb_employes;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof departement that)) return false;
        return getId() == that.getId() && Objects.equals(getNom_depart(), that.getNom_depart());
    }

    @Override
    public String toString() {
        return "departement{" +
                "id=" + id +
                ", nom_depart='" + nom_depart + '\'' +
                ", nb_employes=" + nb_employes +
                '}';
    }
}
