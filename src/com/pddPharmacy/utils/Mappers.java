package com.pddPharmacy.utils;

import com.pddPharmacy.data.models.Drug;
import com.pddPharmacy.dtos.Request.AddDrugRequest;
import com.pddPharmacy.dtos.Response.AddDrugResponse;

public class Mappers {
    public static Drug map(AddDrugRequest addDrugRequest){
        Drug drug = new Drug();

        map(addDrugRequest, drug);
        return drug;
    }

    public static AddDrugResponse map(Drug drug){
        AddDrugResponse addDrugResponse = new AddDrugResponse();
        addDrugResponse.setDrugName(drug.getName());
        addDrugResponse.setDrugs(drug.getId());

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
