package com.pddPharmacy.data.repositories;

import com.pddPharmacy.data.models.Drug;

import java.util.ArrayList;
import java.util.List;


public class Drugs {
    private final List<Drug> allDrugs = new ArrayList<>();
    private long id = 0;

    public void save(Drug panadol){
        panadol.setId(generateId());
        allDrugs.add(panadol);
    }

    private long generateId() {
        return id++;
    }

    public long getsize() {
        return allDrugs.size();
    }

    public Drug findById(long id ) {
        for(Drug drug:allDrugs){
            if(drug.getId() == id){
            return drug;}
        }
        return null;
    }

    public  void deleteById(long id) {
        for (var Drug : allDrugs) {
            if(Drug.getId() == id) {
                allDrugs.remove(Drug);
                break;
            }

        }

    }

    public void delete(Drug drug){
        deleteById(drug.getId());
    }
}
