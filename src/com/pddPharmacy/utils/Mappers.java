package com.pddPharmacy.utils;

import com.pddPharmacy.data.models.Drug;
import com.pddPharmacy.dtos.Request.AddDrugRequest;
import com.pddPharmacy.dtos.Response.AddDrugResponse;

public class Mappers {
    public static Drug map(AddDrugRequest addDrugRequest){
        Drug drug = new Drug();

        drug.setName(addDrugRequest.getName());
        drug.setManufactureOn(addDrugRequest.getManufactureOn());
        drug.setCategory(addDrugRequest.getCategory());
        drug.setType(addDrugRequest.getType());
        drug.setExpiryDate(addDrugRequest.getExpiryDate());
        drug.setQuantity(addDrugRequest.getQuantity());

        return drug;
    }

    public static AddDrugResponse map(Drug drug){
        AddDrugResponse addDrugResponse = new AddDrugResponse();
        addDrugResponse.setDrugName(drug.getName());
        addDrugResponse.setDrugs(drug.getId().intValue());

        return addDrugResponse;

    }

    public static void map(AddDrugRequest drugRequest, Drug drug ){
        drug.setName(drugRequest.getName());
        drug.setManufactureOn(drugRequest.getManufactureOn());
        drug.setCategory(drugRequest.getCategory());
        drug.setType(drugRequest.getType());
        drug.setExpiryDate(drugRequest.getExpiryDate());
        drug.setQuantity(drugRequest.getQuantity());


    }


}
