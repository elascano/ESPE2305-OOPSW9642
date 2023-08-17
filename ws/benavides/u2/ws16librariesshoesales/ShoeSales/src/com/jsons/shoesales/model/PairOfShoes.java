package com.jsons.shoesales.model;

import com.jsons.tax.SalesTax;

/**
 *
 * @author Ruben Benavides, Jsons, DCCO-ESPE
 */
public class PairOfShoes {

    private int id;
    private String brand;
    private String model;
    private float price;
    private float totalPrice;

    @Override
    public String toString() {
        return "PairOfShoes{" + "id=" + id + ", brand=" + brand + ", model=" + model + ", price=" + price + ", totalPrice=" + totalPrice + '}';
    }
    
    public PairOfShoes(int id, String brand, String model, float price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.totalPrice = SalesTax.computeIva(price, 12.0F);;
    }
    
    public PairOfShoes(int id, String brand, String model, float price, float totalPrice) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.totalPrice = totalPrice;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getPrice() {
        return price;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }
    
}
