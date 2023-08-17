package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Ruben Benavides, Jsons, DCCO-ESPE
 */
public class Cow extends FarmAnimal {
    
    private boolean isMolting;

    @Override
    public String toString() {
        return "Cow{" + super.toString() + ", isMolting=" + isMolting + '}';
    }

    public boolean isIsMolting() {
        return isMolting;
    }

    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }

    public Cow(int id, String breed, Date bornOn, boolean isMolting) {
        super(id, breed, bornOn);
        this.isMolting = isMolting;
    }

    @Override
    public boolean feed(Food food) {
        //TODO program feed cow
        return true;
    }

    @Override
    public int produce() {
        //TODO program produce cows
        return 1;
    }
    
    public void getLeatherForClothes(){
        //TODO program the function to get leather
    }
    
}
