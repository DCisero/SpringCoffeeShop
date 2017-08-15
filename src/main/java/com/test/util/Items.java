package com.test.util;

public class Items {

    private String name;
    private String description;
    private int quantity;
    private float price;

    public Items(){
        name = "";
        description = "";
        quantity = 0;
        price = 0;
    }
    public Items (String itName, String itDescipt, int itQuan, float itPri) {
        name = itName;
        description = itDescipt;
        quantity = itQuan;
        price = itPri;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String Desciption) {
        this.description = Desciption;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int Quantity) {
        this.quantity = Quantity;
    }
    public float getPrice() {
        return price;
    }

    public void setPrice(float Price) {
        this.price = Price;
    }


}
