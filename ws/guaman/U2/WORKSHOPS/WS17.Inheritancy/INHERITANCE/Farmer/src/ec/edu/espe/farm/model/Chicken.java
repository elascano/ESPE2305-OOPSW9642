
package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Jordan Guaman, Software Juniors, DCCO-ESPE
 */
public class Chicken extends FarmAnimal{
    private boolean isMolting;
    private int laidEggs;

    public Chicken(boolean isMolting, int laidEggs, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.isMolting = isMolting;
        this.laidEggs = laidEggs;
    }

    @Override
    public String toString() {
        return "Chicken{" + "isMolting=" + isMolting + ", laidEggs=" + laidEggs + '}';
    }

    
    public boolean isIsMolting() {
        return isMolting;
    }

    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }

    public int getLaidEggs() {
        return laidEggs;
    }

    public void setLaidEggs(int laidEggs) {
        this.laidEggs = laidEggs;
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
    public boolean feed() {
          //TODO program animal feeding
 
        return true;
    }

    @Override
    public int produce() {
        //TODO program animal feeding
        
        return 4; 
            }
   public int produce(Meat meat); 
    return meat.getPounds();
}
