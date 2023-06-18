package ec.edu.espe.videogames.model;

/**
 *
 * @author Edison Verdesoto, Code Warriors, DCCO-ESPE
 */
public class Videogame {
    private int id;
    private String name;
    private String platform;
    private float price;
    private float totalPrice;


    @Override
    public String toString() {
        return "Videogame{" + "id=" + id + ", name=" + name + ", platform=" + platform + ", price=" + price 
                + ", totalPrice=" + String.format("%.2f", totalPrice) + '}';
    }

    public Videogame(int id, String name, String platform, float price, float totalPrice) {
        this.id = id;
        this.name = name;
        this.platform = platform;
        this.price = price;
        this.totalPrice = totalPrice;
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
     * @return the platform
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * @param platform the platform to set
     */
    public void setPlatform(String platform) {
        this.platform = platform;
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
