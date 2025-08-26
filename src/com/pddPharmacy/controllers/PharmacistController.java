package com.pddPharmacy.controllers;

import com.pddPharmacy.dtos.Request.AddDrugRequest;
import com.pddPharmacy.dtos.Request.BuyDrugsRequest;
import com.pddPharmacy.dtos.Response.AddDrugResponse;
import com.pddPharmacy.dtos.Response.AvailableDrugResponse;
import com.pddPharmacy.services.PharmacistServices;

import java.util.List;

public class PharmacistController {
    private final PharmacistServices pharmacistServices;

    public PharmacistController(PharmacistServices pharmacistServices) {
        this.pharmacistServices = pharmacistServices;
    }

    public AddDrugResponse recordNewDrug(AddDrugRequest addDrugRequest){
        return pharmacistServices.addDrug(addDrugRequest);
    }

    public String buyDrug(BuyDrugsRequest buyDrugsRequest){

        pharmacistServices.buyDrugs(buyDrugsRequest);
        return "Drugs bought successfully";
    }

    public List<AvailableDrugResponse> getAvailableDrugs(){

        return pharmacistServices.getAvaibleDrug();
    }
}
