package ec.edu.espe.food.model;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public class Food {
    private int id;
    private String name;
    private int quantity;
    private double sellPrice;

    @Override
    public String toString() {
        return "Food{" + "id=" + id + ", name=" + name + ", quantity=" + quantity + ", sellPrice=" + sellPrice + '}';
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
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the sellPrice
     */
    public double getSellPrice() {
        return sellPrice;
    }

    /**
     * @param sellPrice the sellPrice to set
     */
    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }
    
}
