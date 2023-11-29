package models;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<departement>{

    Set<departement>listdepartements;
    public DepartementHashSet(){
        this.listdepartements=new HashSet<>();

    }

    public void ajouterDepartement(departement t){

        listdepartements.add(t);


    }

    public boolean rechercherDepartement(String nom){

        for (departement depar : listdepartements){
            if (depar.getNom_depart().equals(nom)){
                return true;


            }


        }
        return false;
    }


    public boolean rechercherDepartement(departement t){

        return listdepartements.contains(t);


    }

    public void supprimerDepartement(departement t){

        listdepartements.remove(t);

    }

    public void displayDepartement(){

        for (departement dep : listdepartements){

            System.out.println(dep);

        }

    }


    public TreeSet<departement> trierDepartementById(){

        return new TreeSet<>(listdepartements);

    }






}
