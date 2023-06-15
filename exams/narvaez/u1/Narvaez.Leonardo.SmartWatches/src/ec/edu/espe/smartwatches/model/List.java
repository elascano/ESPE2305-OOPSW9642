/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.smartwatches.model;

import java.util.ArrayList;

/**
 *
 * @author Narvaez Leonardo, The FAMSE, DCCO Espe
 */
public class List {
    private int id;
    private ArrayList<Product> products;

    @Override
    public String toString() {
        return "List{" + "id=\n" + id + ", products=\n" + products + '}';
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
     * @return the products
     */
    public ArrayList<Product> getProducts() {
        return products;
    }

    /**
     * @param products the products to set
     */
    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public List(int id, ArrayList<Product> products) {
        this.id = id;
        this.products = products;
    }
    
}
