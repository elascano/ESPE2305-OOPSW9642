package ec.edu.espe.model;

/**
 * 
 * @Autor: Jhordy Marcillo
 */
public class Income {
    private int id;
    private float price;
    private float totalPrice;
    private float ingresoAnual;

    public Income(int id, float price, float totalPrice, float ingresoAnual) {
        this.id = id;
        this.price = price;
        this.totalPrice = totalPrice;
        this.ingresoAnual = ingresoAnual;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public float getIngresoAnual() {
        return ingresoAnual;
    }

    public void setIngresoAnual(float ingresoAnual) {
        this.ingresoAnual = ingresoAnual;
    }
}
