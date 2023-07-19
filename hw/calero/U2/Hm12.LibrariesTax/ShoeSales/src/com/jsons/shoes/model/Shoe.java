
package com.jsons.shoes.model;

import com.jsons.tax.SalesTax;

/**
 *
 * @author Adonny Calero,Jsons,DCCO-ESPE
 */
public class Shoe {
    private int id;
    private String make;
    private String model;
    private float price;
    private float totalPrice;
    
    public Shoe(int id, String make, String model, float price, float totalPrice) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.price = price;
        this.totalPrice = totalPrice;
    }
    
        public Shoe(int id, String make, String model, float price) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.price = price;
        this.totalPrice = SalesTax.computeIva(price, 12.0F);
    }
           
       @Override
        public String toString() {
        return "Shoe{" + "id=" + getId() + ", make=" + getMake() + ", model=" + getModel() + ", price=" + getPrice() + ", totalPrice=" + getTotalPrice() + '}';
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
     * @return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * @param make the make to set
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
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
     * @return the totalPrice
     */
    public float getTotalPrice() {
        return totalPrice;
    }

    /**
     * @param totalPrice the totalPrice to set
     */
    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    
    
}
