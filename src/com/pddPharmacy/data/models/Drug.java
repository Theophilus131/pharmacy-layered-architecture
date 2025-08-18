package com.pddPharmacy.data.models;

import java.time.LocalDate;

public class Drug {
    private Long id = 0L;
    private String name;
    private Type type;
    private Category category;
    private LocalDate manufactureOn;
    private int quantity;
    private LocalDate expiryDate;



    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public LocalDate getManufactureOn() {
        return manufactureOn;
    }

    public void setManufactureOn(LocalDate manufactureOn) {
        this.manufactureOn = manufactureOn;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

}
