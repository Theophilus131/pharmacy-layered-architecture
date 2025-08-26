package com.pddPharmacy.services;

import com.pddPharmacy.data.models.Drug;
import com.pddPharmacy.data.repositories.Drugs;
import com.pddPharmacy.dtos.Request.AddDrugRequest;
import com.pddPharmacy.dtos.Request.BuyDrugsRequest;
import com.pddPharmacy.dtos.Response.AddDrugResponse;
import com.pddPharmacy.dtos.Response.AvailableDrugResponse;
import com.pddPharmacy.exceptions.InvalidDrugQualityException;
import java.util.ArrayList;
import java.util.List;


import static com.pddPharmacy.utils.Mappers.map;
import static com.pddPharmacy.utils.Validator.validate;



    public class PharmacistServices {
    private final Drugs drugs;

    public PharmacistServices(Drugs drugs) {
       this.drugs = drugs;
    }


    public AddDrugResponse addDrug(AddDrugRequest addDrugRequest){
        Drug drug=new Drug();

        validate(addDrugRequest);
        map(addDrugRequest, new Drug());
        drugs.save(drug);
        return map(drug);
    }


    public void buyDrugs(BuyDrugsRequest buyDrugsRequest) {
        Drug drug = drugs.findByName(buyDrugsRequest.getDrugName());
        drug.setQuantity(drug.getQuantity() - buyDrugsRequest.getQuantity());
        drugs.save(drug);
    }

    public List<AvailableDrugResponse> getAvaibleDrug() {
        List<Drug> allDrugs = drugs.findAll();
        List<AvailableDrugResponse> availableDrugs = new ArrayList<>();

        for(Drug drug: allDrugs){
            if(drug.getQuantity() > 0){
                AvailableDrugResponse availableDrugResponse;
                availableDrugResponse = new AvailableDrugResponse();

                availableDrugResponse.setName(drug.getName());
                availableDrugResponse.setQuantity(drug.getQuantity());
                availableDrugResponse.setIsExpired(drug.getExpiryDate());
            }
        }
        return availableDrugs;
    }

}





