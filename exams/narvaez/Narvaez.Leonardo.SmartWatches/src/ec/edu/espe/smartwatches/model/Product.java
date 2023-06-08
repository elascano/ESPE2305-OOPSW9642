/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.smartwatches.model;

/**
 *
 * @author Narvaez Leonardo, The FAMSE, DCCO Espe
 */
public class Product {
    private int id;
    private String color;
    private String mark;

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", color=" + color + ", mark=" + mark + '}';
    }

    public Product(int id, String color, String mark) {
        this.id = id;
        this.color = color;
        this.mark = mark;
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
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the mark
     */
    public String getMark() {
        return mark;
    }

    /**
     * @param mark the mark to set
     */
    public void setMark(String mark) {
        this.mark = mark;
    }
    
}
