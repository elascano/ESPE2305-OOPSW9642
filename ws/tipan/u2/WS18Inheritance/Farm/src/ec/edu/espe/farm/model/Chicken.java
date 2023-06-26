package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */
public class Chicken extends FarmAnimal implements IBird{
    boolean isMolting;
    int laidEggs;

    
    public Chicken(boolean isMolting, int laidEggs, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.isMolting = isMolting;
        this.laidEggs = laidEggs;
    }

    @Override
    public String toString() {
        return "Chicken{"+super.toString() + "isMolting=" + isMolting + ", laidEggs=" + laidEggs +  '}';
    }
    

    @Override
    public boolean feed(Food food) {
        //TODO program animal feeding
        return true;
    }

    @Override
    public int produce() {
         //TODO program the number of chickens
        return 4;
    }
    public int produce(Meat meat){
        return meat.getPounds();
    }
    @Override
    public void layEgg() {
        laidEggs= laidEggs+1;
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

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public Date getBornOn() {
        return bornOn;
    }

    @Override
    public void setBornOn(Date bornOn) {
        this.bornOn = bornOn;
    }

    
    
}
