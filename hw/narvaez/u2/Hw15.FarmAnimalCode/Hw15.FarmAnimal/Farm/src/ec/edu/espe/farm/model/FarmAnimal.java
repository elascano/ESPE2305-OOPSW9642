package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Narvaez Leonardo, The FAMSE, DCCO-ESPE
 */
public abstract class FarmAnimal {
    
    private int id;
    private String breed;
    private Date bornOn;
    
    public abstract boolean feed(Food food);
    
    public abstract int produce();
    
    public int getAgeInMonths(){
        //TODO compute age
        return 0;
    }

    public FarmAnimal(int id, String breed, Date bornOn) {
        this.id = id;
        this.breed = breed;
        this.bornOn = bornOn;
    }

    @Override
    public String toString() {
        return " Id: " + id + ", breed: " + breed + ", bornOn: " + bornOn;
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
}
