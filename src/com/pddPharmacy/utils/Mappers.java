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

    public static Drug map(AddDrugResponse addDrugResponse){


        return null;
    }


}
