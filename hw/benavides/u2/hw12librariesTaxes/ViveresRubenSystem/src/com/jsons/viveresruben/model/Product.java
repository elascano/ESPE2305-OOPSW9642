package com.jsons.viveresruben.model;

import com.jsons.tax.SalesTax;

/**
 *
 * @author Ruben Benavides, Jsons, DCCO-ESPE
 */
public class Product {

    @Override
    public String toString() {
        return "Product{" + "type=" + type + ", id=" + id + ", price=" + price + ", finalPrice (ice included) =" + finalPrice + '}';
    }
    
    private String type;
    private int id;
    private float price;
    private float finalPrice;
    
    public Product(String type, int id, float price, float icePercentage) {
        this.type = type;
        this.id = id;
        this.price = price;
        this.finalPrice = SalesTax.computeIce(price, 0.12F, icePercentage);
    }
    
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the finalPrice
     */
    public float getFinalPrice() {
        return finalPrice;
    }

    /**
     * @param finalPrice the finalPrice to set
     */
    public void setFinalPrice(float finalPrice) {
        this.finalPrice = finalPrice;
    }

}
