/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Exercise.model;

import java.time.LocalDate;

/**
 *
 * @author Alexander J
 */

public class Dress {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    private String name;
    private String brand;
    private String size;
    private float price;
    private int quantity;
    private LocalDate dateReceived;
    //private LocalDate dateSold;
    
    public Dress(String name, String brand, String size, float price, int quantity) {
        this.name = name;
        this.brand = brand;
        this.size = size;
        this.price = price;
        this.quantity = quantity;
    }
    
    // Getters and setters
    
    // ...

    public LocalDate getDateReceived() {
        return dateReceived;
    }

    public void setDateReceived(LocalDate dateReceived) {
        this.dateReceived = dateReceived;
    }

    /*public LocalDate getDateSold() {
        return dateSold;
    }*/

    /*public void setDateSold(LocalDate dateSold) {
        this.dateSold = dateSold;
    }*/

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
    
}
