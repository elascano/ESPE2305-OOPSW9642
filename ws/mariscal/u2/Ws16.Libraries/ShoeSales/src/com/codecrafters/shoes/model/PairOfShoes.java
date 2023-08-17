/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.codecrafters.shoes.model;

import com.codecrafters.tax.sales.SalexTax;

/**
 *
 * @author Mesias Mariscal, CodeCrafters; DCCO-ESPE
 */
public class PairOfShoes {
    int id;
    String brand;
    String model;
    float price;
    float totalprice;

    public PairOfShoes(int id, String brand, String model, float price, float totalprice) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.totalprice = totalprice;
    }
    public PairOfShoes(int id, String brand, String model, float price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.totalprice = SalexTax.compute(price, 12.0F);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(float totalprice) {
        this.totalprice = totalprice;
    }

    @Override
    public String toString() {
        return "PairOfShoes{" + "id=" + id + ", brand=" + brand + ", model=" + model + ", price=" + price + ", totalprice=" + totalprice + '}';
    }
    
}
