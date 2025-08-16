package com.pddPharmacy.services;

import com.pddPharmacy.data.models.Drug;
import com.pddPharmacy.data.repositories.Drugs;
import com.pddPharmacy.dtos.Request.AddDrugRequest;

public class PharmacistServices {
   private final Drugs drugs;

    public PharmacistServices() {
       this.drugs = new Drugs();
    }

    public void addDrug(AddDrugRequest drugRequest){
        Drug drug=new Drug();

        drug.setName(drugRequest.getName());
        drug.setCategory(drugRequest.getCategory());
        drug.setQuantity(drugRequest.getQuantity());
        drug.setType(drugRequest.getType());
        drug.setManufactureOn(drugRequest.getManufactureOn());
        drug.setExpiryDate(drugRequest.getExpiryDate());

        drugs.save(drug);



    }


}





