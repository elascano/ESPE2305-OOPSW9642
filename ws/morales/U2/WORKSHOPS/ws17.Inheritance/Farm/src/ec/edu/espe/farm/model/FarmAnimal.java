package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Anthony Morales, The_FAMSE
 */
public abstract class FarmAnimal {
    private int id;
    private String breed;
    private Date bornOn;
    
    public abstract boolean feed(Food food);
    public abstract int produce();
    
    public int getAgeInMonths(){
        return 0;
    }

    @Override
    public String toString() {
        return "FarmAnimal{" + "id=" + getId() + ", breed=" + getBreed() + ", bornOn=" + getBornOn() + '}';
    }

    public FarmAnimal(int id, String breed, Date bornOn) {
        this.id = id;
        this.breed = breed;
        this.bornOn = bornOn;
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
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * @return the bornOn
     */
    public Date getBornOn() {
        return bornOn;
    }

    /**
     * @param bornOn the bornOn to set
     */
    public void setBornOn(Date bornOn) {
        this.bornOn = bornOn;
    }
    
    
}
