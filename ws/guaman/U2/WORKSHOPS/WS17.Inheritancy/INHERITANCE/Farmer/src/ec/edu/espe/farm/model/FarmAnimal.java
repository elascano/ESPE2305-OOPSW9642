
package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Jordan Guaman, Software Juniors, DCCO-ESPE
 */
public abstract class FarmAnimal {
    int id;
    String breed;
    Date bornOn;
    
    public abstract boolean feed();
    public abstract int produce ();
    public int getAgeInMonths(){
    return 0;
    }

    public FarmAnimal(int id, String breed, Date bornOn) {
        this.id = id;
        this.breed = breed;
        this.bornOn = bornOn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Date getBornOn() {
        return bornOn;
    }

    public void setBornOn(Date bornOn) {
        this.bornOn = bornOn;
    }

    @Override
    public String toString() {
        return "FarmAnimal{" + "id=" + id + ", breed=" + breed + ", bornOn=" + bornOn + '}';
    }
    
            
    
    
}
