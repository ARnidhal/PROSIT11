package models;

import java.util.Map;

import java.util.HashMap;

public class AffectationHashMap {


    Map<String ,String> map = new HashMap<>();

    private Map<employes, departement> affectations;

    public AffectationHashMap() {
        affectations = new HashMap<>();
    }

    void ajouterEmployeDepartement(employes e, departement d){

        affectations.put(e,d);

    }


    public void afficherEmployesEtDepartements(employes e , departement d){

        for (Map.Entry<employes, departement> entry : affectations.entrySet()) {
            employes employe = entry.getKey();
            departement departement = entry.getValue();
            System.out.println(employe + " - " + departement);
        }

    }

    public void supprimerEmploye(employes e) {
        affectations.remove(e);
    }

    public void supprimerEmployeEtDepartement(employes e, departement d) {
        affectations.remove(e, d);
    }

    public void afficherEmployes() {
        for (employes employe : affectations.keySet()) {
            System.out.println(employe);
        }
    }

    public void afficherDepartements() {
        for (departement departement : affectations.values()) {
            System.out.println(departement);
        }
    }

    public boolean rechercherEmploye(employes e) {
        return affectations.containsKey(e);
    }


    public boolean rechercherDepartement(departement d) {
        return affectations.containsValue(d);
    }


    public Map<employes, departement> trierMap() {
        Map<employes, departement> sortedMap = new HashMap<>(affectations);
        return sortedMap;
    }




}
