package com.pddPharmacy.data.repositories;

import com.pddPharmacy.data.models.Drug;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrugsTest {

     private Drugs drugs;

    @BeforeEach
    void setUp() {
        drugs = new Drugs();
    }
    @Test
    public void test_addDrugs_DrugCountIs1() {
        Drug panadol=new Drug();
        drugs.save(panadol);
        assertEquals(1L, drugs.getsize());

    }

    @Test
    public void test_addTwoDrugs_DrugsCountIs2(){
        Drug panadol = new Drug();
        drugs.save(panadol);
        Drug alamoBitters = new Drug();
        drugs.save(alamoBitters);
        assertEquals(2L, drugs.getsize());
    }


    @Test
    public void test_findDrugs_ByID(){
        Drug panadol = new Drug();
        drugs.save(panadol);
        assertEquals(panadol, drugs.findById(panadol.getId()));
    }


    @Test
    public void test_twoDrugs_Added_CanBe_FoundById(){
        Drug panadol = new Drug();
        drugs.save(panadol);
        assertEquals(1L, drugs.getsize());

        Drug alamoBitters = new Drug();
        drugs.save(alamoBitters);
        assertEquals(2L, drugs.getsize());

        assertEquals(panadol, drugs.findById(panadol.getId()));
        assertEquals(alamoBitters, drugs.findById(alamoBitters.getId()));

    }

    @Test
    public void test_drugs_can_be_deleted_ById(){
        Drug panadol = new Drug();
        drugs.save(panadol);
        Drug alamoBitters = new Drug();
        drugs.save(alamoBitters);
        drugs.deleteById(alamoBitters.getId());
        assertEquals(1L, drugs.getsize());

    }

    @Test
    public void test_drugs_can_be_deleted(){
        Drug panadol = new Drug();
        drugs.save(panadol);
        Drug alamoBitters = new Drug();
        drugs.save(alamoBitters);
        drugs.delete(alamoBitters);
        assertEquals(1L, drugs.getsize());

    }

    @Test
    public void test_drugs_canBe_Updated(){


    }

}