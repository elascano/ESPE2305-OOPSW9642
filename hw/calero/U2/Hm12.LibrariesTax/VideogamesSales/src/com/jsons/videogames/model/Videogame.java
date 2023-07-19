
package com.jsons.videogames.model;

/**
 *
 * @author Adonny Calero,Jsons,DCCO-ESPE
 */
public class Videogame {
    
    private int id;
    private String name;
    private String companny;
    private float price;
    private float totalPrice;
    private float productionCost;

    public Videogame(int id, String name, String companny, float price, float totalPrice, float productionCost ) {
        this.id = id;
        this.name = name;
        this.companny = companny;
        this.price = price;
        this.totalPrice = totalPrice;
        this.productionCost = productionCost;
    }

    @Override
    public String toString() {
        return "Videogame{" + "id=" + id + ", name=" + name + ", companny=" + companny + ", price=" + price + ", totalPrice=" + totalPrice + ", Production Cost=" + productionCost + '}';
    }

    public float getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(float productionCost) {
        this.productionCost = productionCost;
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the companny
     */
    public String getCompanny() {
        return companny;
    }

    /**
     * @param companny the companny to set
     */
    public void setCompanny(String companny) {
        this.companny = companny;
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
