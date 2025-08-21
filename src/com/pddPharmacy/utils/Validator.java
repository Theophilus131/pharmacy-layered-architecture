package com.pddPharmacy.utils;

import com.pddPharmacy.dtos.Request.AddDrugRequest;
import com.pddPharmacy.exceptions.InvalidDrugQualityException;

public class Validator {
    public static void validate(AddDrugRequest addDrugRequest){
        validateDrugName(addDrugRequest);
        validateDrugQuantity(addDrugRequest);

    }

    private static void validateDrugQuantity(AddDrugRequest addDrugRequest) {
    }

    private static void validateDrugName(AddDrugRequest addDrugRequest) {
        if(addDrugRequest.getQuantity() <= 0) throw new InvalidDrugQualityException("Quantity must be greater than 0");
    }


}
