package ec.edu.espe.shoes.model;

/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */
public class PairOfShoes {

    int id;
    String make;
    String model;
    float price;
    float totalPrice;

    @Override
    public String toString() {
        return "PairOfShoes{" + "id=" + id + ", make=" + make + ", model=" + model + ", price=" + price + ", totalPrice=" + totalPrice + '}';
    }

    public PairOfShoes(int id, String make, String model, float price, float totalPrice) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.price = price;
        this.totalPrice = totalPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
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
