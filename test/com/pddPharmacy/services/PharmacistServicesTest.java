package com.pddPharmacy.services;

import com.pddPharmacy.data.models.Category;
import com.pddPharmacy.data.models.Type;
import com.pddPharmacy.data.repositories.Drugs;
import com.pddPharmacy.dtos.Request.AddDrugRequest;
import com.pddPharmacy.dtos.Request.BuyDrugsRequest;
import com.pddPharmacy.exceptions.InvalidDrugQualityException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;



class PharmacistServicesTest {
    PharmacistServices pharmacistServices;
    Drugs drugs;

    @BeforeEach
    void setUp() {
        drugs = new Drugs();
        pharmacistServices = new PharmacistServices(drugs);
        
    }


    @Test
    public void test_addDrug_DrugCountIs1(){
    AddDrugRequest addDrugRequest = new AddDrugRequest();

    addDrugRequest.setName("panadol");
    addDrugRequest.setType(Type.SYRUP);
    addDrugRequest.setManufactureOn(LocalDate.of(2025,10,11));
    addDrugRequest.setQuantity(1);
    addDrugRequest.setCategory(Category.ANALGESTIC);
    addDrugRequest.setExpiryDate(addDrugRequest.getManufactureOn().plusMonths(10));

    pharmacistServices.addDrug(addDrugRequest);
    assertEquals(1L, drugs.getsize());

    }

    @Test
    void test_addDrugWithZeroQuantityThrowException(){
        AddDrugRequest addDrugRequest = new AddDrugRequest();

        addDrugRequest.setName("panadol");
        addDrugRequest.setType(Type.SYRUP);
        addDrugRequest.setManufactureOn(LocalDate.of(2025,10,11));
        addDrugRequest.setQuantity(0);
        addDrugRequest.setCategory(Category.ANALGESTIC);
        addDrugRequest.setExpiryDate(addDrugRequest.getManufactureOn().plusMonths(10));
        assertThrows(InvalidDrugQualityException.class, ()-> pharmacistServices.addDrug(addDrugRequest));

    }



    @Test
    void test_buyDrugsQuantityReduces(){
        AddDrugRequest addDrugRequest = new AddDrugRequest();

        addDrugRequest.setName("panadol");
        addDrugRequest.setType(Type.SYRUP);
        addDrugRequest.setManufactureOn(LocalDate.of(2025,10,11));
        addDrugRequest.setQuantity(10);
        addDrugRequest.setCategory(Category.ANALGESTIC);
        addDrugRequest.setExpiryDate(addDrugRequest.getManufactureOn().plusMonths(10));

        pharmacistServices.addDrug(addDrugRequest);

        BuyDrugsRequest panadolBuyDrugsRequest = new BuyDrugsRequest();
        panadolBuyDrugsRequest.setDrugName("panadol");
        panadolBuyDrugsRequest.setQuantity(5);

        pharmacistServices.buyDrugs(panadolBuyDrugsRequest);
        assertEquals(2, pharmacistServices.getAvaibleDrug().size());



    }

//    @Test
//    void test_availableDrugsCanBefound(){
//        AddDrugRequest panadol = new AddDrugRequest();
//        panadol.setName("panadol");
//        panadol.setType(Type.SYRUP);
//        panadol.setManufactureOn(LocalDate.of(2025,10,11));
//        panadol.setQuantity(15);
//        panadol.setCategory(Category.ANALGESTIC);
//        panadol.setExpiryDate(panadol.getManufactureOn().plusMonths(10));
//
//        pharmacistServices.addDrug(panadol);
//
//        AddDrugRequest alamoBitters = new AddDrugRequest();
//
//        alamoBitters.setName("alamobitters");
//        alamoBitters.setQuantity(12);
//        alamoBitters.setType(Type.SYRUP);
//        alamoBitters.setCategory(Category.ANALGESTIC);
//        alamoBitters.setManufactureOn(LocalDate.now());
//        alamoBitters.setExpiryDate(alamoBitters.getExpiryDate().plusMonths(10));
//
//        pharmacistServices.addDrug(alamoBitters);
//
//        pharmacistServices.buyDrugs("panadol",15 );
//        pharmacistServices.buyDrugs("alamoBitters", 12);
//
//    }


}