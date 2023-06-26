package ec.edu.espe.shoes.model;

/**
 *
 * @author Anthony Morales, The_FAMSE
 */
public class ProductController {
    private int id;
    private String brand;
    private float pack;
    private float cigarette;
    private float totalPrice;

    public ProductController(int id, String brand, float pack, float cigarette, float totalPrice) {
        this.id = id;
        this.brand = brand;
        this.pack = pack;
        this.cigarette = cigarette;
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "PackageOfCigar{" + "id=" + id + ", brand=" + brand + ", pack=" + pack + ", cigarette=" + cigarette + ", totalPrice=" + totalPrice + '}';
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
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the pack
     */
    public float getPack() {
        return pack;
    }

    /**
     * @param pack the pack to set
     */
    public void setPack(float pack) {
        this.pack = pack;
    }

    /**
     * @return the cigarette
     */
    public float getCigarette() {
        return cigarette;
    }

    /**
     * @param cigarette the cigarette to set
     */
    public void setCigarette(float cigarette) {
        this.cigarette = cigarette;
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
