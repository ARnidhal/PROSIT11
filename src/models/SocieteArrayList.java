package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



public  class  SocieteArrayList implements IGestion<employes> {

    ArrayList<employes> listemployes;

    public SocieteArrayList(){
        this.listemployes = new ArrayList<>();
    }

    public void ajouterEmploye(employes t){
        listemployes.add(t);

    }

    public boolean rechercherEmploye(String nom){

        for(employes empoye : listemployes){

            if (empoye.getNom().equals(nom)){
                return true;

            }
        }
        return false;

    }


    public boolean rechercherEmploye(employes t){
        return listemployes.contains(t);


    }

    public void supprimerEmploye(employes t){

        listemployes.remove(t);
    }


    public void displayEmploye(){

        for (employes employe : listemployes)
        {
            System.out.println(employe);
        }
    }

    public void trierEmployeParId(){

        Collections.sort(listemployes, new Comparator<employes>() {
            @Override
            public int compare(employes o1, employes o2) {
                return Integer.compare(o1.getId(), o2.getId());
            }
        });


    }


    public void trierEmployeParNomDepartementEtGrade(){

        Collections.sort(listemployes, new Comparator<employes>() {
            @Override
            public int compare(employes o1, employes o2) {
                int compareNom = o1.getNom().compareTo(o2.getNom());
                if (compareNom==0){

                    int compareDepart = o1.getNom_depart().compareTo(o2.getNom_depart());
                    if (compareDepart == 0){
                        return Integer.compare(o1.getGrade(), o2.getGrade());

                    }
                    return compareDepart;


                }
                return compareNom;

            }
        });

    }





}
