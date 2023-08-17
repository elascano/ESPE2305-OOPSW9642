
package espe.edu.ec.farm.model;

import java.util.Date;

/**
 *
 * @author Anabel Davila
 */
public abstract class FarmAnimal {

  
    private int id;
    private String breed;
    private Date bornOn;

    @Override
    public String toString() {
        return "FarmAnimal{" + "id=" + id + ", breed=" + breed + ", bornOn=" + bornOn + '}';
    }

    public FarmAnimal(int id, String breed, Date bornOn) {
        this.id = id;
        this.breed = breed;
        this.bornOn = bornOn;
    }
    
    public abstract boolean feed(Food food);
    public abstract int produce ();
    public int getAgeInMonths(){
    //TODO compute age
    return 0;
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

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
}
