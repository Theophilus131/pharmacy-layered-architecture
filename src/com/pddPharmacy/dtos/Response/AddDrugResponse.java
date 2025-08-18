package com.pddPharmacy.dtos.Response;

public class AddDrugResponse {
    private int drugs;
    private String drugName;

    public int getDrugs() {
        return drugs;
    }

    public void setDrugs(int drugs) {
        this.drugs = drugs;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }
}
