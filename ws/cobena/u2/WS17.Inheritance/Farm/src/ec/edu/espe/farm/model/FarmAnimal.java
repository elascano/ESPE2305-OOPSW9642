
package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public abstract class FarmAnimal {
    private int id;
    private String breed;
    private Date bornOn;
    private float weight;

    public FarmAnimal(int id, String breed, Date bornOn, float weight) {
        this.id = id;
        this.breed = breed;
        bornOn.setYear(bornOn.getYear()-1900);
        bornOn.setMonth(bornOn.getMonth()-1);
        this.bornOn = bornOn;
        this.weight = weight;
    }

    public FarmAnimal() {
    }
    
    @Override
    public String toString() {
        return "ID: " + id + " || Breed: " + breed + " || Born Date: " + bornOn + " ||";
    }
    
    public abstract boolean feed(Food food);
    public abstract int produce();
    public abstract void gainWeight(float foodWeight);
    
    public int getAgeInMonths(){
        long timeDiff = new Date().getTime() - bornOn.getTime();
        Date ageDate = new Date();
        ageDate.setTime(timeDiff);
        ageDate.setYear(ageDate.getYear()-70);
        return ageDate.getYear()*12;
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
        bornOn.setYear(bornOn.getYear()-1900);
        bornOn.setMonth(bornOn.getMonth()-1);
        this.bornOn = bornOn;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
