package com.pddPharmacy.dtos.Response;

public class AddDrugResponse {
    private long drugs;
    private String drugName;

    public long getDrugs() {
        return drugs;
    }

    public void setDrugs(long drugs) {
        this.drugs = drugs;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }
}
