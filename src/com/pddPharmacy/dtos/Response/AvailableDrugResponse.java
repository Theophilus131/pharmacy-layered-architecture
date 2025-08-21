package com.pddPharmacy.dtos.Response;

import java.time.LocalDate;

public class AvailableDrugResponse {

    private String name;
    private int quantity;
    private boolean isExpired;
    public boolean isIsExpired;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isExpired() {
        return isExpired;
    }

    public void setExpired(boolean expired) {
        isExpired = expired;
    }

    public boolean isIsExpired() {
        return isIsExpired;
    }

    public void setIsExpired(LocalDate isExpired) {
        isIsExpired = isExpired;
    }
}
