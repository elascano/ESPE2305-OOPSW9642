package ec.edu.espe.exam.model;

import java.util.HashMap;

/**
 *
 * @author Leonardo Narvaez, The FAMSE, DCCO-ESPE
 */
public class SmartWatch implements Map{
    
    private HashMap<Object, Object> data;
    private int id;
    private String brand;
    private String color;
    private int price;

    @Override
    public String toString() {
        return "SmartWatch{" + "Data=" + data + ", Id=" + id + ", Brand=" + brand + ", Color=" + color + "Price =" + price +'}';
    }
   
    
    public SmartWatch(int id, String brand, String color, int price) {
        data = new HashMap<Object, Object>();
        data.put("Id", id);
        data.put("Brand", brand);
        data.put("Color", color);
        data.put("Price", price);
        
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.price = price;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public HashMap<Object, Object> getData() {
        return data;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }
   
    
}
