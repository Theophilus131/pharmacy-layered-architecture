package com.pddPharmacy.services;

import com.pddPharmacy.data.models.Category;
import com.pddPharmacy.data.models.Drug;
import com.pddPharmacy.data.models.Type;
import com.pddPharmacy.data.repositories.Drugs;
import com.pddPharmacy.dtos.Request.AddDrugRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class PharmacistServicesTest {
    PharmacistServices pharmacistServices;
    Drugs drugs;

    @BeforeEach
    void setUp() {
        pharmacistServices = new PharmacistServices();
        drugs = new Drugs();
    }


    @Test
    public void test_addDrug_DrugCountIs1(){
    assertEquals(0L, drugs.getsize());
    AddDrugRequest addDrugRequest = new AddDrugRequest();

    addDrugRequest.setName("panadol");
    addDrugRequest.setType(Type.SYRUP);
    addDrugRequest.setManufactureOn(LocalDate.of(2025,10,11));
    addDrugRequest.setQuantity(1);
    addDrugRequest.setCategory(Category.ANALGESTIC);
    addDrugRequest.setExpiryDate(addDrugRequest.getManufactureOn().plusMonths(10));


//    pharmacistServices.addDrug(addDrugRequest);
//    assertEquals(1L, drugs.getsize());

    }

}