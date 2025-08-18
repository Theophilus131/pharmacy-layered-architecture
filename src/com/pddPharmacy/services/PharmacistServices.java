package com.pddPharmacy.services;

import com.pddPharmacy.data.models.Drug;
import com.pddPharmacy.data.repositories.Drugs;
import com.pddPharmacy.dtos.Request.AddDrugRequest;
import com.pddPharmacy.dtos.Response.AddDrugResponse;

import static com.pddPharmacy.utils.Mappers.map;

public class PharmacistServices {
   private Drugs drugs = new Drugs();

    public PharmacistServices() {
       this.drugs = new Drugs();
    }

    public AddDrugResponse addDrug(AddDrugRequest drugRequest){
        Drug drug=new Drug();


        map(addDrugRequest, new Drug());
        drugs.save(drug);
        return map(drug);


    }



}





