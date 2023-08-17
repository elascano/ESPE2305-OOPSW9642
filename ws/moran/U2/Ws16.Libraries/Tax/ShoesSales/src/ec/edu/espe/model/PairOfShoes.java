package ec.edu.espe.model;

import com.thefamse.tax.sales.SalesTax;

/**
 *
 * @author Moran David
 */
public class PairOfShoes {
    private int id;
    private String brand;
    private String model;
    private float price;
    private float totalPrice;

    @Override
    public String toString() {
        return "\nID: " + id + "-->" + brand + "-->" + model + "\nPrice:" + price +
                "\nPrice with IVA " + totalPrice +"\n";
    }
    
    public PairOfShoes(int id, String brand, String model, float price, float totalPrice) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.totalPrice = SalesTax.computeIva(price, 12.0F);
    }
    
    public PairOfShoes(int id, String brand, String model, float price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.totalPrice = SalesTax.computeIva(price, 12.0F);
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

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    
}
